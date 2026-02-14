import java.util.List;



public class Main
{
	public static void main(String[] args) throws Exception {
		CsvReader firstFileReader = new CsvReader("fileName.csv");
		
		CsvReader secondFileReader = new CsvReader("fileName2.csv");
		
		List<List<String>> firstFileRows = firstFileReader.readRecords();
		List<List<String>> secondFileRows = secondFileReader.readRecords();
		List<String> firstFileHeaders = firstFileReader.readHeader();
		List<String> secondFileHeaders = secondFileReader.readHeader();
		
		ListToMap Difference = new ListToMap();
		Difference.Result(firstFileRows, secondFileRows, firstFileHeaders, secondFileHeaders);
	}
}