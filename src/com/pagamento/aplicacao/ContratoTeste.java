package com.pagamento.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.pagamento.entidade.Contrato;
import com.pagamento.entidade.Parcelas;
import com.pagamento.servicos.PagOnline;
import com.pagamento.servicos.ServicoContrato;

public class ContratoTeste {
	public static void main(String[] args) throws ParseException{
				
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe o numero do contrato ");
		int numeroContrato = teclado.nextInt();
		
		System.out.println("Informe a data do contrato: ");
		Date dataContrato = data.parse(teclado.next());
		
		System.out.println("Informe o valor do contrato: ");
		Double valorContrato = teclado.nextDouble();
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);
		
		System.out.println("Quantas parcelas deseja gerar? ");
		int parcelas = teclado.nextInt();
		
		ServicoContrato sc = new ServicoContrato(new PagOnline());
		sc.processandoContrato(contrato, parcelas);
		
		System.out.println("Parcelas:");
		for(Parcelas pagamentoDt: contrato.getArrayPagamento()) {
			System.out.println(pagamentoDt);
		}
		
		
		
		teclado.close();
	}

}
