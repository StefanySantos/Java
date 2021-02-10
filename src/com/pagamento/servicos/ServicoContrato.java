package com.pagamento.servicos;

import java.util.Calendar;
import java.util.Date;

import com.pagamento.entidade.Contrato;
import com.pagamento.entidade.Parcelas;

public class ServicoContrato {
	
	private PagamentoOnline pagamentoOnline;
	
	public ServicoContrato(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
	
	public void processandoContrato(Contrato contrato, int meses) {
		double parcelaBase = contrato.getValorContrato()/ meses;
		for(int i = 1; i<= meses; i++) {
			double parcelaAtualizada = parcelaBase + pagamentoOnline.juros(parcelaBase, i);
			double ultimaParcela = parcelaAtualizada + pagamentoOnline.taxaPagamento(parcelaAtualizada);
			Date dataC = adcMeses(contrato.getDataContrato(), i);
			contrato.getArrayPagamento().add(new Parcelas(dataC, ultimaParcela));
		}
	}
	
	private Date adcMeses(Date date, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, x);
		return calendar.getTime();
	}
}
