package com.pagamento.servicos;

public class PagOnline implements PagamentoOnline {
	
	private static final double taxaPagamento = 0.02;
	private static final double jurosMensal = 0.01;

	
	public double juros(double total, int meses) {
		return total * meses * jurosMensal;
	}
	
	public double taxaPagamento(double total) {
		return total * taxaPagamento;
	}
	

}
