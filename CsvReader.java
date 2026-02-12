import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.stream.Collectors;
import java.io.FileReader;
import java.util.Collections;



class CsvReader {
    private static final String SEPARATOR = ",";
    
    private final String filename;
    
    CsvReader(String filename) {
        this.filename = filename;
    }
    List<String> readHeader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .findFirst()
                    .map(line -> Arrays.asList(line.split(SEPARATOR)))
                    .get();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    
    List<List<String>> readRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            return reader.lines()
                    .skip(1)
                    .map(line -> Arrays.asList(line.split(SEPARATOR)))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}