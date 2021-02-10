package com.pagamento.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private Date dataVencimento;
	private Double total;
	
	public Parcelas() {}

	public Parcelas(Date dataVencimento, Double total) {
		super();
		this.dataVencimento = dataVencimento;
		this.total = total;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return data.format(dataVencimento) + " - " +  total;
	}
	

}
