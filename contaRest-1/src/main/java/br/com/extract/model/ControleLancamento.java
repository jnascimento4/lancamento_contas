package br.com.extract.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ControleLancamento {
	
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	
	@JsonFormat(pattern = "dd/MM/YYYY")
	private Date dataEfetivaLancamento;
	
	@JsonFormat(pattern = "dd/MM/YYYY")
	private Date dataLancamentoContaCorrenteCliente;
	
	private Long numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private Integer codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private Integer quantidadeLancamentoRemessa;
	
	private Long numeroRaizCNPJ;
	
	private Long numeroSufixoCNPJ;
	
	private BigDecimal valorLancamentoRemessa;
	
	@JsonFormat(pattern = "dd/MM/YYYY")
	private Date dateLancamentoContaCorrenteCliente;
	
	@JsonFormat(pattern = "dd/MM/YYYY")
	private Date dateEfetivaLancamento;

	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public Date getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public Long getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public Integer getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(Integer codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public Long getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(Long numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public Long getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(Long numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public Date getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(Date dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public Date getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(Date dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

}
