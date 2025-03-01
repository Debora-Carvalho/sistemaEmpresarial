package com.exercicios.configuracoes.sistemaEmpresarial;

/**
 * 
 */
public class App {
    public static void main(String[] args) {

		ConfigManager config = ConfigManager.getInstance(); 

		System.out.println("URL do Banco de dados: " + 
				config.getConfig("db.url")); 
		System.out.println("Chave da API: " + 
				config.getConfig("api.key")); 
		System.out.println("Limite de conexões simultâneas ao Banco de dados: " + 
				config.getConfig("db.max.connections")); 
		System.out.println("Limite de requisições simultâneas ao Servidor: " + 
				config.getConfig("server.max.requests")); 
    }
}
