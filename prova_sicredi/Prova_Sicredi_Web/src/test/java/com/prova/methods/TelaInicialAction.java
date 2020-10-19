package com.prova.methods;

import org.openqa.selenium.WebDriver;

import com.prova.generics.GenericMethodos;
import com.prova.pages.TelaInicialPage;

public class TelaInicialAction extends TelaInicialPage {
	
	GenericMethodos gen;

	
			
	public TelaInicialAction(WebDriver driver) {
		super(driver);

	}

	public void SelecionaVersao() {
		gen = new GenericMethodos(driver);
		gen.selectByVisibleText(selectVersion, "Bootstrap V4 Theme");

	}
	
	public void clickButtonAddCustumer() {
		addCustumer.click();

	}

}
