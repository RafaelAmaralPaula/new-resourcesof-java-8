package com.lovelacetecnologia.interfaces_funcional;

public class Main {

	public static void main(String[] args) {

		// Impressora i = () -> {
		//
		// System.out.println("SIMULANDO IMPRESSÃO !");
		//
		// };

		// i.imprimir();

		Impressora i = (c) -> {

			System.out.println("SIMULANDO RECURSO . " + c);
			//  várias linhas de códigos

		};

		Compra compra = new Compra("Sabonete", 2.5);
		i.imprimir(compra);

	}

}
