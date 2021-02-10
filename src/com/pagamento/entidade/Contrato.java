package com.pagamento.entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numeroContrato;
	private Date dataContrato;
	private double valorContrato;
	
	List<Parcelas> ArrayPagamento = new ArrayList<Parcelas>();
	
	public List<Parcelas> getArrayPagamento() {
		return ArrayPagamento;
	}

	public Contrato(Integer numeroContrato, Date dataContrato, double valorContrato) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}

	public Contrato() {}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}


	
	
	
//	

			

}
