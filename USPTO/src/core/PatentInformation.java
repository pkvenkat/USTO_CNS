package core;

public class PatentInformation {
  private String patentno;
  
  private String  applicationNumber;
  //PBL in FWF
  private String publicationLevel;
  //ART in FWF
  private Integer artUnit;
 //TTL in FWF
  private String titleOfInvention;
 //ISD in FWF- issue date
  private Long issueDate;
 // NCL in FWF
  private Integer numOfClaims;
  //ECL
  private String exemplaryClaim;
     //EXA 
  private String assistantExaminar;
	//EXP
  private String primaryExaminar;
  //NDR
  private Integer numOfDrawings;
  //No of Figures- NFG
  private Integer numOfFigures;
  //DCD 
  private Long disclamerDate;
  //NPS
  private Integer numOfPagesSpec;
public String getPatentno() {
	return patentno;
}
public void setPatentno(String patentno) {
	this.patentno = patentno;
}

public String getApplicationNumber() {
	return applicationNumber;
}
public void setApplicationNumber(String applicationNumber) {
	this.applicationNumber = applicationNumber;
}
public String getPublicationLevel() {
	return publicationLevel;
}
public void setPublicationLevel(String publicationLevel) {
	this.publicationLevel = publicationLevel;
}
public Integer getArtUnit() {
	return artUnit;
}
public void setArtUnit(Integer artUnit) {
	this.artUnit = artUnit;
}
public String getTitleOfInvention() {
	return titleOfInvention;
}
public void setTitleOfInvention(String titleOfInvention) {
	this.titleOfInvention = titleOfInvention;
}
public Long getIssueDate() {
	return issueDate;
}
public void setIssueDate(Long issueDate) {
	this.issueDate = issueDate;
}
public Integer getNumOfClaims() {
	return numOfClaims;
}
public void setNumOfClaims(Integer numOfClaims) {
	this.numOfClaims = numOfClaims;
}
public String getExemplaryClaim() {
	return exemplaryClaim;
}
public void setExemplaryClaim(String exemplaryClaim) {
	this.exemplaryClaim = exemplaryClaim;
}
public String getAssistantExaminar() {
	return assistantExaminar;
}
public void setAssistantExaminar(String assistantExaminar) {
	this.assistantExaminar = assistantExaminar;
}
public String getPrimaryExaminar() {
	return primaryExaminar;
}
public void setPrimaryExaminar(String primaryExaminar) {
	this.primaryExaminar = primaryExaminar;
}
public Integer getNumOfDrawings() {
	return numOfDrawings;
}
public void setNumOfDrawings(Integer numOfDrawings) {
	this.numOfDrawings = numOfDrawings;
}
public Integer getNumOfFigures() {
	return numOfFigures;
}
public void setNumOfFigures(Integer numOfFigures) {
	this.numOfFigures = numOfFigures;
}
public Long getDisclamerDate() {
	return disclamerDate;
}
public void setDisclamerDate(Long disclamerDate) {
	this.disclamerDate = disclamerDate;
}
public Integer getNumOfPagesSpec() {
	return numOfPagesSpec;
}
public void setNumOfPagesSpec(Integer numOfPagesSpec) {
	this.numOfPagesSpec = numOfPagesSpec;
}
  
	
}
