package com.lovelacetecnologia.lambda_referenciametdos;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Fatura> vencidas = new FaturaDAO().faturaVencidas();

		EnviadorEmail email = new EnviadorEmail();

		// for (Fatura f : vencidas) {
		//
		// email.enviar(f.getEmailDevedor(), f.resumo());
		//
		// }

//		vencidas.forEach(f -> {
//
//			email.enviar(f.getEmailDevedor(), f.resumo());
//			f.setEmailEnviado(true);
//
//		});
		
		
//		for(Fatura f : vencidas){
//			f.atualizarStatus();
//		}
		
		
		vencidas.forEach(Fatura :: atualizarStatus);

	}

}
