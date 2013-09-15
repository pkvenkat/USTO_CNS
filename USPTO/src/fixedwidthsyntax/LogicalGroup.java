package fixedwidthsyntax;
import java.util.ArrayList;
import java.util.List;


public class LogicalGroup {
	private String name;
	private String id;
	private List<DataElement> dataelement;
	public LogicalGroup()
	{
		dataelement = new ArrayList<DataElement>();
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
	public List<DataElement> getDataelement() {
		return dataelement;
	}
	public void setDataelement(List<DataElement> dataelement) {
		this.dataelement = dataelement;
	}	
 
}
