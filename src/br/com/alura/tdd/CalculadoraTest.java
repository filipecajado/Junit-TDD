package br.com.alura.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPostivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
	 Assert.assertEquals(10, soma);	
	}
}
