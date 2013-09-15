import Exceptions.IdNotFound;
import reader.FixedWidthReader;
import reader.Reader;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String fixedWidthFile = "C:/DOCUME~1/pkvenkat/fixedWidthFormat.txt";
		String fixedWidthFile = "C:/DOCUME~1/pkvenkat/1976.dat";
		String SchemaFile = "C:/Documents and Settings/pkvenkat/syntax.xsd";
		String syntaxXMLFile = "C:/Documents and Settings/pkvenkat/example.xml";
		
		FixedWidthReader fwr = new FixedWidthReader(fixedWidthFile,SchemaFile,syntaxXMLFile);
		try {
			fwr.read();
		} catch (IdNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fwr.close();
	}
}
