package fixedwidthsyntax;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Syntax {
	 private List<LogicalGroup> logicalgroup;
	 private int linesize;
	 
	 public Syntax()
	 {
		 logicalgroup = new ArrayList<LogicalGroup>(); 
	 }

	public List<LogicalGroup> getLogicalgroup() {
		return logicalgroup;
	}

	public void setLogicalgroup(List<LogicalGroup> logicalgroup) {
		this.logicalgroup = logicalgroup;
	}

	public int getLinesize() {
		return linesize;
	}

	public void setLinesize(int linesize) {
		this.linesize = linesize;
	}
	 
}
