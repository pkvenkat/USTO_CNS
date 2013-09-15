package syntaxsearch;

import java.util.HashMap;
import java.util.List;

import Exceptions.WrongSyntaxException;

import fixedwidthsyntax.DataElement;
import fixedwidthsyntax.LogicalGroup;

public class LogicalSearchGroup {
	private String name;
	private String  id;	
	private HashMap<String, DataElementSearch> dataElemSearchMap;
	
	public LogicalSearchGroup(LogicalGroup le)throws  WrongSyntaxException
	{
		this.dataElemSearchMap = new HashMap<String, DataElementSearch>();
		this.name = le.getName();
		this.id = le.getId();
		System.out.print("logical id =" +this.id);
		List<DataElement> deList=le.getDataelement();
		for(DataElement de:deList)
		{
			DataElementSearch des = new  DataElementSearch(de);
			System.out.print("data id =" +des.getId());
			if(dataElemSearchMap.containsKey(des.getId())) throw new WrongSyntaxException();
			dataElemSearchMap.put(des.getId(), des);
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

	public HashMap<String, DataElementSearch> getDataElemSearchMap() {
		return dataElemSearchMap;
	}

	public void setDataElemSearchMap(
			HashMap<String, DataElementSearch> dataElemSearchMap) {
		this.dataElemSearchMap = dataElemSearchMap;
	}
	
	public DataElementSearch getDataElement(String id)
	{
		return dataElemSearchMap.get(id);
	}	
	
	public DataElementSearch add(DataElementSearch des)
	{
		return dataElemSearchMap.put(des.getId(), des);
	}	

}
