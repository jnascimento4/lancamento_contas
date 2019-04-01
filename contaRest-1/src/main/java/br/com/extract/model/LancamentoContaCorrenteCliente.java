package br.com.extract.model;

import java.util.List;

public class LancamentoContaCorrenteCliente {

	private Long numeroRemessaBanco;
	
	private List<DadosAnalisticos> dadosAnaliticoLancamentoFinanceiroCliente;
	
	private String nomeSituacaoRemessa;
	
	private DomiciloBancario dadosDomicilioBancario;
	
	private String nomeTipoOperacao;

	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public DomiciloBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}

	public void setDadosDomicilioBancario(DomiciloBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public List<DadosAnalisticos> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}

	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			List<DadosAnalisticos> dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	
	
}
