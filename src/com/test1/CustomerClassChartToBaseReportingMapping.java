package com.test1;

public class CustomerClassChartToBaseReportingMapping {
	private Integer setId;
	private Integer customerClassId;
	private Integer essBaseId;
	private String department;
	private Integer baseReportingIndicator;
	private boolean customerClassMappedToReport;
	private boolean isActive;
	private String masterSectionName;
	private String masterSectionType;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CustomerClassChartToBaseReportingMapping() {

	}

	public CustomerClassChartToBaseReportingMapping(Integer setId, Integer customerClassId, Integer essBaseId,
			String department, Integer baseReportingIndicator, boolean customerClassMappedToReport, boolean isActive,
			String masterSectionName, String masterSectionType, String creationCr, String modifiedCr,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.setId = setId;
		this.customerClassId = customerClassId;
		this.essBaseId = essBaseId;
		this.department = department;
		this.baseReportingIndicator = baseReportingIndicator;
		this.customerClassMappedToReport = customerClassMappedToReport;
		this.isActive = isActive;
		this.masterSectionName = masterSectionName;
		this.masterSectionType = masterSectionType;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getCustomerClassId() {
		return customerClassId;
	}

	public void setCustomerClassId(Integer customerClassId) {
		this.customerClassId = customerClassId;
	}

	public Integer getEssBaseId() {
		return essBaseId;
	}

	public void setEssBaseId(Integer essBaseId) {
		this.essBaseId = essBaseId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getBaseReportingIndicator() {
		return baseReportingIndicator;
	}

	public void setBaseReportingIndicator(Integer baseReportingIndicator) {
		this.baseReportingIndicator = baseReportingIndicator;
	}

	public boolean isCustomerClassMappedToReport() {
		return customerClassMappedToReport;
	}

	public void setCustomerClassMappedToReport(boolean customerClassMappedToReport) {
		this.customerClassMappedToReport = customerClassMappedToReport;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getMasterSectionName() {
		return masterSectionName;
	}

	public void setMasterSectionName(String masterSectionName) {
		this.masterSectionName = masterSectionName;
	}

	public String getMasterSectionType() {
		return masterSectionType;
	}

	public void setMasterSectionType(String masterSectionType) {
		this.masterSectionType = masterSectionType;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
