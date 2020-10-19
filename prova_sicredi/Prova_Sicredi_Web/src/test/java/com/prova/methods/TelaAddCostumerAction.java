package com.prova.methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.prova.generics.GenericMethodos;
import com.prova.pages.TelaAddCostumerPage;

public class TelaAddCostumerAction extends TelaAddCostumerPage {

	GenericMethodos gen;

	public TelaAddCostumerAction(WebDriver driver) {
		super(driver);

	}

	public void PreencheFormulario() throws InterruptedException {
		gen = new GenericMethodos(driver);
		Thread.sleep(5000);
		name.sendKeys("Teste Sicredi");
		lastName.sendKeys("Teste");
		firstName.sendKeys("Keilla");
		phone.sendKeys("51 9999-9999");
		addressLine1.sendKeys("Av Assis Brasil, 3970");
		addressLine2.sendKeys("Torre D");
		city.sendKeys("Porto Alegre");
		state.sendKeys("RS");
		country.sendKeys("Brasil");
		fromEmployeer.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[contains(text(),'Fixter')]")).click();
		creditLimit.click();
		creditLimit.sendKeys("200");

	}

	public void SaveCustumer() throws InterruptedException {
		Thread.sleep(5000);
		buttonSave.click();

	}

	public void ValidaMsgSucesso() {

		Assert.assertEquals(
				"Your data has been successfully stored into the database. Edit Customer or Go back to list",
				msgSucess.getText());

	}
}
