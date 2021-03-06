package workWithTXT;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016 
 * @Desciptione: Class Main handling display content file test
 */
public class MainClassTXT {
	
	static String filePath = "src/workWithTXT/cd.txt";
	static CDController cdController = new CDController();

	public static void main(String[] agrs) throws ClassNotFoundException,
			SQLException, IOException {

		cdController.writeFileList(filePath);
		cdController.readFile(filePath);
		System.out.println(cdController.toString());
	}

}
