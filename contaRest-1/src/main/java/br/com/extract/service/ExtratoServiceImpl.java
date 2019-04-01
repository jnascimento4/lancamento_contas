package br.com.extract.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.stereotype.Service;

import br.com.extract.ExtratoService;
import br.com.extract.adapter.ExtratoAdapter;
import br.com.extract.model.Conta;

@Service
public class ExtratoServiceImpl implements ExtratoService {

	public Conta buscarConta() throws FileNotFoundException, IOException {
		return ExtratoAdapter.getInstance().convertJsonToObject();
	}

}
