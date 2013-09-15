package syntaxsearch;

import java.util.HashMap;
import java.util.List;

import fixedwidthsyntax.DataElement;
import fixedwidthsyntax.Position;

public class DataElementSearch {
	

	private String name;
	private String id;
	private int fieldsize;
	private int maxFieldsize;
	private String datatype;
	private String required;
	private HashMap<String,Position> positionMap;
	
	public  DataElementSearch(DataElement de)
	{
		positionMap = new HashMap<String,Position>();
		this.name = de.getName();
		this.id = de.getId();
		this.fieldsize= de.getFieldsize();
		this.datatype = de.getDatatype();
		this.required = de.getRequired();
		this.maxFieldsize = de.getMaxsize();
		List<Position> posList = de.getPosition();
		for(Position pos: posList)
		{
			positionMap.put(pos.getName(), pos);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFieldsize() {
		return fieldsize;
	}

	public void setFieldsize(int fieldsize) {
		this.fieldsize = fieldsize;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}
	
	public Position getPosition(String name)
	{
		return positionMap.get(name);
	}
	
	public int getMaxFieldsize() {
		return maxFieldsize;
	}

	public void setMaxFieldsize(int maxFieldsize) {
		this.maxFieldsize = maxFieldsize;
	}


}
