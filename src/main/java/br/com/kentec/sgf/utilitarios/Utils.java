package br.com.kentec.sgf.utilitarios;

import java.util.UUID;

public class Utils {
	
	public static String certificador() {
		String certificador;
		UUID uuId = UUID.randomUUID();
		certificador = uuId.toString();
		return certificador;
	}


}
