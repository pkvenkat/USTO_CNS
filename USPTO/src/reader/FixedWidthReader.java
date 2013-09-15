package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import syntaxsearch.DataElementSearch;
import syntaxsearch.LogicalSearchGroup;

import Exceptions.IdNotFound;
import Utilities.Constants;
import fixedwidthsyntax.ReadFixedWidthSyntax;

public class FixedWidthReader implements Reader {
	private String delimiter;
	private ReadFixedWidthSyntax fwSyntax;
	private int maxNumofCharsPerLine;
	private String fixedWidthPath;
	private BufferedReader br;
	private LogicalSearchGroup currentLogicalSearch;
	private DataElementSearch currentDataSearch;
	private String value;
	private boolean cont;

	public FixedWidthReader(String fixedWidthFilePath, String schemaFilePath,
			String syntaxFilePAth) {
		this.fixedWidthPath = fixedWidthFilePath;
		fwSyntax = new ReadFixedWidthSyntax(schemaFilePath);
		fwSyntax.readSyntax(syntaxFilePAth);
		try {
			br = new BufferedReader(new FileReader(fixedWidthFilePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cont = false;

	}

	@Override
	public String readNextLine() {
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	public void read() throws IdNotFound {
		String line = null;
		while ((line = readNextLine()) != null) {
			String id = line.substring(0, Math.min(line.length(), 4));
			System.out.println("id=" + id);
			id = id.trim();
			if (id.length() == 4) {
				if (cont) {
					cont = false;
					System.out.println("value=" + value);

				}
				currentLogicalSearch = fwSyntax.getSyntaxSearchMap().get(id);
				if(currentLogicalSearch == null) throw new IdNotFound();
				System.out.println("logical group=" + id);

			} else if (id.length() == 3) {
				if (cont) {
					cont = false;
					System.out.println("value=" + value);
				}
				currentDataSearch = currentLogicalSearch.getDataElemSearchMap()
						.get(id);
				if(currentDataSearch == null) throw new IdNotFound();
				int fieldSize = currentDataSearch.getFieldsize();
				int maxSize = currentDataSearch.getMaxFieldsize();
				if (fieldSize != -1) {
					//System.out
					//		.println("data element group=" + id + "fieldSize ="
					//				+ fieldSize + "maxsize =" + maxSize);
					//to take care of field which has less length
					if (line.length() >= (fieldSize + 5)) {
						String value = line.substring(5, 5 + fieldSize);
						System.out.println("value=" + value);
					} else {
						value = line.substring(5, line.length());
						System.out.println("value=" + value);
					}
				}
				else if (fieldSize == -1 && maxSize != -1) {
					value = line.substring(5, line.length());
					System.out.println("data element group=" + id);
					if (maxSize < 75) {
						
					}
				}
				else
				{					
					value = line.substring(5, line.length());
					System.out.println("data element group=" + id);
				}
			} else if (id.isEmpty()) {
				// continuation of previous value
				value += line.trim();
				System.out.println("data element group=" + value);
				cont = true;
			}
		}

	}

	public void setRecordDelimiter(String delimit) {
		this.delimiter = delimit;
	}

	public void setMaxLineCharacters(int maxChar) {
		this.maxNumofCharsPerLine = maxChar;
	}

	@Override
	public String getReaderType() {
		return Constants.FIXED_WIDTH;
	}

	public void close() {
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
