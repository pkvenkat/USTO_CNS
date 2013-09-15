package fixedwidthsyntax;
import java.util.ArrayList;
import java.util.List;


public class DataElement {
	private String name;
	private String id;
	private int fieldsize;
	private int maxsize;
	private String datatype;
	private String required;
	private List<Position> position;

	public DataElement()
	{
		position = new ArrayList<Position>();
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
	public List<Position> getPosition() {
		return position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}
	public int getMaxsize() {
		return maxsize;
	}
	public void setMaxsize(int maxsize) {
		this.maxsize = maxsize;
	}


}
