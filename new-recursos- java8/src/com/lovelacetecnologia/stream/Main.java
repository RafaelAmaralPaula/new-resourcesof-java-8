package com.lovelacetecnologia.stream;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas(); 	
		
//		for(Fatura f : faturas) {
//			
//			if(f.getValor() > 250) {
//				
//				System.out.println("FATURA ACIMA DE R$ 250.0 " + f); 
//			}
//		}
	
	
	faturas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);
		
		//faturas.forEach(f -> System.out.println(f));

	faturas.forEach(f ->{ 
			
		
	});
	
	}

}
