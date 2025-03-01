/**
 * 
 */
package com.exercicios.configuracoes.sistemaEmpresarial;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 */
public class ConfigManager {
	/**Instância única do Singleton*/
	private static ConfigManager instance;

	/**Objeto para armazenar as configurações*/
	private Properties properties;
	/**Construtor privado para impedir múltiplas instâncias*/
	private ConfigManager() {
		properties = new Properties();
		/**buscar as configurações no arquivo*/
		loadConfigurations();
	}
	
	/** Método responsável por carregar as configurações do arquivo
	 * @param String db.url, api.key, max.connections
	 * @return String conteúdo da chave
	 * */
	private void loadConfigurations() {

		InputStream file =
				this.getClass().getResourceAsStream("config.properties");
		try{
			properties.load(file);
			System.out.println("Configurações carregadas com sucesso.\n");
			file.close();
		}
		catch(IOException e){
			System.out.println("Arquivo de configuração não encontrado!\n");

			e.printStackTrace();
		}

	}

	public static ConfigManager getInstance() {
		if (instance == null) {
			instance = new ConfigManager();
		}
		return instance;
	}

	public String getConfig(String key) {
		return properties.getProperty(key);
	}
}
