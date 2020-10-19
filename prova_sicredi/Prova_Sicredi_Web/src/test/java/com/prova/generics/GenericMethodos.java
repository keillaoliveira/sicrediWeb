package com.prova.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.prova.pages.PageObject;



public class GenericMethodos extends PageObject{

	public GenericMethodos(WebDriver driver) {
		super(driver);
	}
	
	public void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
