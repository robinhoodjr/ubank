package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	// This function will read data from a CSV file
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
