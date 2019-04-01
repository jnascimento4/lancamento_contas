package br.com.extract.adapter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.extract.model.Conta;

public class ExtratoAdapter {
	
	private static String JSON = "src/main/resources/lancamento-conta-legado.json";
	private static ExtratoAdapter instance = new ExtratoAdapter();
	
	public static ExtratoAdapter getInstance() {
		if (instance == null) {
			instance = new ExtratoAdapter();
		}
		return instance;
	}
	
	public Conta convertJsonToObject() throws FileNotFoundException, IOException {
		
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		
		return mapper.readValue(new FileReader(JSON), Conta.class);
	}

}
