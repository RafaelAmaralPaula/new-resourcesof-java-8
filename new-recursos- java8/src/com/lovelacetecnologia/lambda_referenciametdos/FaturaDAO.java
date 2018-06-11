package com.lovelacetecnologia.lambda_referenciametdos;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

	public List<Fatura> faturaVencidas() {

		List<Fatura> faturas = new ArrayList<>();

		faturas.add(new Fatura("rafael@lovelacetecnologia.com", 350.0));
		faturas.add(new Fatura("filipe@lovelacetecnologia.com", 550.0));
		faturas.add(new Fatura("gabriel@lovelacetecnologia.com", 1350.0));
		faturas.add(new Fatura("joãolovelacetecnologia.com", 450.0));

		return faturas;

	}

}
