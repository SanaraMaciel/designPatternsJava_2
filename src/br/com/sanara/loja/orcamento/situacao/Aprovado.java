package br.com.sanara.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.sanara.loja.DomainException;
import br.com.sanara.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

}
