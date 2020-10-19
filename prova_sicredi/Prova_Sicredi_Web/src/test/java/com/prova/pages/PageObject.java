package com.prova.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.prova.utils.Constants;

public abstract class PageObject {
	
	
	protected static WebDriver driver;
	static File browser = new File(Constants.PATH_CHROMEDRIVER);;
	protected static WebDriverWait wait;

	public PageObject(WebDriver driver) {
		PageObject.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	
	
}
