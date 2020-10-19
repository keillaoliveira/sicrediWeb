package com.prova.cenarios;

import org.junit.Test;

import com.prova.methods.TelaAddCostumerAction;
import com.prova.methods.TelaInicialAction;
import com.prova.utils.SetUp;

public class Cenario1 extends SetUp {
	
	static TelaInicialAction telaInicial;
	static TelaAddCostumerAction telaAddCostumer;


	@Test
	public void test() throws InterruptedException {
		telaInicial = new TelaInicialAction(driver);
		telaAddCostumer = new TelaAddCostumerAction(driver);
		
		telaInicial.SelecionaVersao();
		telaInicial.clickButtonAddCustumer();
		telaAddCostumer.PreencheFormulario();
		telaAddCostumer.SaveCustumer();
		Thread.sleep(5000);
		telaAddCostumer.ValidaMsgSucesso();
	}

}
