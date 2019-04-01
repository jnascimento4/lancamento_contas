package br.com.extract;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.extract.model.Conta;

public interface ExtratoService {

	public Conta buscarConta() throws FileNotFoundException, IOException;
}
