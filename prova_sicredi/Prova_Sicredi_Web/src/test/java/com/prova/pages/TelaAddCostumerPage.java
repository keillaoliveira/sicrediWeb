package com.prova.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TelaAddCostumerPage extends PageObject {
	
	public TelaAddCostumerPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(how = How.NAME, using = "customerName")
	protected WebElement name;
	
	@FindBy(how = How.ID, using = "field-contactLastName")
	protected WebElement lastName;
	
	@FindBy(how = How.ID, using = "field-contactFirstName")
	protected WebElement firstName;
	
	@FindBy(how = How.ID, using = "field-phone")
	protected WebElement phone;
	
	@FindBy(how = How.ID, using = "field-addressLine1")
	protected WebElement addressLine1;
	
	@FindBy(how = How.ID, using = "field-addressLine2")
	protected WebElement addressLine2;
	
	@FindBy(how = How.ID, using = "field-city")
	protected WebElement city;

	@FindBy(how = How.ID, using = "field-state")
	protected WebElement state;
	
	@FindBy(how = How.ID, using = "field-postalCode")
	protected WebElement postalCode;
	
	@FindBy(how = How.ID, using = "field-country")
	protected WebElement country;
	
	@FindBy(how = How.ID, using = "field_salesRepEmployeeNumber_chosen")
	protected WebElement fromEmployeer;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/ul/li[8]")
	protected WebElement chooseEmployeer;
	
	@FindBy(how = How.CSS, using = "#field_salesRepEmployeeNumber_chosen > div > div")
	protected WebElement chooseEmployeer1;
	
	
	
	@FindBy(how = How.ID, using = "field-creditLimit")
	protected WebElement creditLimit;
	
	@FindBy(how = How.ID, using = "form-button-save")
	protected WebElement buttonSave;
	
	//form-button-save
	
	@FindBy(how = How.XPATH, using = "//div[@id=\"report-success\"]//p")
	protected WebElement msgSucess;
	
	
	
	
	

}
