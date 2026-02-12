import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.stream.Collectors;
import java.io.FileReader;



public class Main
{
	public static void main(String[] args) throws Exception {
		CsvReader firstFileReader = new CsvReader("fileName1.csv");
		
		CsvReader secondFileReader = new CsvReader("fileName2.csv");
		
		List<List<String>> firstFileRows = firstFileReader.readRecords();
		List<List<String>> secondFileRows = secondFileReader.readRecords();
		List<String> firstFileHeaders = firstFileReader.readHeader();
		List<String> SecondFileheaders = secondFileReader.readHeader();
		
		ListToMap Difference = new ListToMap();
		Difference.Result(firstFileRows, secondFileRows, firstFileHeaders, SecondFileHeaders);
	}
}