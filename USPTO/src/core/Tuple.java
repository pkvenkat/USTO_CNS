package core;

import information.PatentInformation;

public class Tuple {
	// Patent Number is primary key

	private Long patentNumber;
	private PatentInformation patentInformation;

	public Tuple() {
		patentInformation = new PatentInformation ();
	}

	public PatentInformation getFacade() {
		return patentInformation;
	}

	public void setFacade(PatentInformation facade) {
		this.patentInformation = facade;
	}

	public Tuple(Long patentNumber) {
		this.patentNumber = patentNumber;
	}

	public Long getPatentNumber() {
		return patentNumber;
	}

	public void setPatentNumber(Long patentNumber) {
		this.patentNumber = patentNumber;
	}

}
