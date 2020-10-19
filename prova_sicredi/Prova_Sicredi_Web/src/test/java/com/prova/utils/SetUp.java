package com.prova.utils;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	protected static WebDriver driver;
	static WebElement element;
	File browser;

	@Before
	public void setUp() throws Exception {
		browser = new File(Constants.PATH_CHROMEDRIVER);
		System.setProperty("webdriver.chrome.driver", browser.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");

	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}
