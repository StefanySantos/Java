package com.pagamento.servicos;

public interface PagamentoOnline {
	
	double taxaPagamento(double total);
	double juros(double total, int meses);
	

}
