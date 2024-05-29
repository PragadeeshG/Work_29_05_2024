package com.test1;

public class CustomerClassChart {
	private Integer setId;
	private Integer customerClassId;
	private String customerClassBudgetIndicator;
	private String customerClassSheet;
	private String customerClassControlFlag;
	private String customerClassDesc;
	private String customerClassShortDesc;
	private String customerClassType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CustomerClassChart() {

	}

	public CustomerClassChart(Integer setId, Integer customerClassId, String customerClassBudgetIndicator,
			String customerClassSheet, String customerClassControlFlag, String customerClassDesc,
			String customerClassShortDesc, String customerClassType, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.setId = setId;
		this.customerClassId = customerClassId;
		this.customerClassBudgetIndicator = customerClassBudgetIndicator;
		this.customerClassSheet = customerClassSheet;
		this.customerClassControlFlag = customerClassControlFlag;
		this.customerClassDesc = customerClassDesc;
		this.customerClassShortDesc = customerClassShortDesc;
		this.customerClassType = customerClassType;
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

	public String getCustomerClassBudgetIndicator() {
		return customerClassBudgetIndicator;
	}

	public void setCustomerClassBudgetIndicator(String customerClassBudgetIndicator) {
		this.customerClassBudgetIndicator = customerClassBudgetIndicator;
	}

	public String getCustomerClassSheet() {
		return customerClassSheet;
	}

	public void setCustomerClassSheet(String customerClassSheet) {
		this.customerClassSheet = customerClassSheet;
	}

	public String getCustomerClassControlFlag() {
		return customerClassControlFlag;
	}

	public void setCustomerClassControlFlag(String customerClassControlFlag) {
		this.customerClassControlFlag = customerClassControlFlag;
	}

	public String getCustomerClassDesc() {
		return customerClassDesc;
	}

	public void setCustomerClassDesc(String customerClassDesc) {
		this.customerClassDesc = customerClassDesc;
	}

	public String getCustomerClassShortDesc() {
		return customerClassShortDesc;
	}

	public void setCustomerClassShortDesc(String customerClassShortDesc) {
		this.customerClassShortDesc = customerClassShortDesc;
	}

	public String getCustomerClassType() {
		return customerClassType;
	}

	public void setCustomerClassType(String customerClassType) {
		this.customerClassType = customerClassType;
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