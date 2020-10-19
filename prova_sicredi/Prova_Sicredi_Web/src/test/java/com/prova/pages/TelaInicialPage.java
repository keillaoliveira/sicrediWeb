package com.prova.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TelaInicialPage extends PageObject{

	public TelaInicialPage(WebDriver driver) {
		super(driver);
		
	}
		
	@FindBy(how = How.ID, using = "switch-version-select")
	protected WebElement selectVersion;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")
	protected WebElement addCustumer;
	
	

	
}
