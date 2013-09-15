package fixedwidthsyntax;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import Exceptions.WrongSyntaxException;

import syntaxsearch.LogicalSearchGroup;

public class ReadFixedWidthSyntax implements ReadSyntax {
	private HashMap<String, LogicalSearchGroup> syntaxSearchMap;
    private String schemaPath;
    
	public ReadFixedWidthSyntax(String schemaPath) {
		syntaxSearchMap = new HashMap<String, LogicalSearchGroup>();
		this.schemaPath= schemaPath;
	}

	@Override
	public void readSyntax(String syntaxXMLPath) {
		File file = new File(syntaxXMLPath);
		JAXBContext jaxbContext;
		try {

			SchemaFactory factory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new StreamSource(new File(
					schemaPath)));
			// read the syntax xml file using the schema
			jaxbContext = JAXBContext.newInstance(Syntax.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			jaxbUnmarshaller.setSchema(schema);
			Syntax syntax = (Syntax) jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(syntax.getLinesize());
			List<LogicalGroup> lg = syntax.getLogicalgroup();
			for (LogicalGroup logical : lg) {
				LogicalSearchGroup lsg;
				
					lsg = new LogicalSearchGroup(logical);
					syntaxSearchMap.put(lsg.getId(), lsg);								
			}           
		} 
		catch (WrongSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public HashMap<String, LogicalSearchGroup> getSyntaxSearchMap() {
		return syntaxSearchMap;
	}

	public void setSyntaxSearchMap(
			HashMap<String, LogicalSearchGroup> syntaxSearchMap) {
		this.syntaxSearchMap = syntaxSearchMap;
	}


	public String getSchemaPath() {
		return schemaPath;
	}


	public void setSchemaPath(String schemaPath) {
		this.schemaPath = schemaPath;
	}

}
