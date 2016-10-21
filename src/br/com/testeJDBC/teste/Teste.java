package br.com.testeJDBC.teste;

import java.sql.Connection;

import br.com.testeJDBC.dao.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {

		try {

			ConnectionFactory fabrica = new ConnectionFactory(); // instanciou o
																	// objeto da
																	// classe
																	// connectionfactory
			Connection conexao = fabrica.getConnection(); // criando objeto para
															// chamar o metodo
															// que
															// eh nosso objeto
															// fabrica
			System.out.println("Conexão aberta");
			conexao.close();

		} 
		
		catch (Exception e) {

			e.printStackTrace();

		}

	}
}
