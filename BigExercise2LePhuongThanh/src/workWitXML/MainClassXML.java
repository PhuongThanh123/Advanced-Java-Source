package workWitXML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * @author: Le Phuong Thanh
 * @version: 1.0
 * @Date: 19/09/2016
 * @Desciptione: Class main class handling XML display content of file XML
 */
public class MainClassXML {

	static String filePath = "src/workWitXML/cd.xml";

	public static void main(String[] args) throws FileNotFoundException,
			ParserConfigurationException, SAXException, IOException,
			ClassNotFoundException, SQLException {

		CDController cdController = new CDController();
		cdController.textTransfomer(filePath);
		System.out.println(cdController.viewFile(filePath));
	}
}
