package br.com.extract.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.extract.ExtratoService;
import br.com.extract.model.Conta;
import br.com.extract.response.ErrorResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "/conta/lancamento", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContaController {
	
	@Autowired
	private ExtratoService extratoService;
	
	@GetMapping
	@ApiOperation(value = "verifica status da proposta", httpMethod = "GET", response = Conta.class)
	@RequestMapping(value = "/conta/lancamento")
	public ResponseEntity<?> teste() {
		Conta conta = null;
		try {
			conta = extratoService.buscarConta();
		} catch (IOException e) {
			return new ResponseEntity<ErrorResponse>(new ErrorResponse("01-A","Erro Inesperado"), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Conta>(conta, HttpStatus.OK);
	}
	
}
