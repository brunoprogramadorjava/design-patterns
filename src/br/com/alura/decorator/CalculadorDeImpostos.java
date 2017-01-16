package br.com.alura.decorator;

public class CalculadorDeImpostos {

	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {

		double calculoImposto = imposto.calcular(orcamento);
		System.out.println(calculoImposto);
	}

}
