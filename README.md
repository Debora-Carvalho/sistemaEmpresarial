# Sistema Empresarial de Gerenciamento de Configurações

## Descrição do Exercício
Este projeto implementa um sistema empresarial de gerenciamento de configurações utilizando o padrão de projeto Singleton. O sistema garante que apenas uma instância da classe de configuração seja criada e compartilhada por toda a aplicação, evitando inconsistências e conflitos ao acessar ou modificar os parâmetros.

As configurações, como URLs de banco de dados, chaves de API e limites de recursos, são carregadas a partir de um arquivo `config.properties` e acessadas de forma consistente por todos os módulos da aplicação.

## Tecnologias Utilizadas
- **Java**
- **Maven** (gerenciamento de dependências e build do projeto)
- **Padrão de Projeto: Singleton**

## Como Importar o Projeto para o Eclipse
1. Abra o terminal ou prompt de comando e execute:
```sh
 git clone https://github.com/Debora-Carvalho/sistemaEmpresarial.git
```

Lembre-se de descompactar (extrair) a pasta do projeto antes de utiliza-la.

2. Abra o Eclipse.
3. No menu superior, vá em `File` > `Import`.
4. Selecione `Existing Maven Projects` e clique em `Next`.
5. Clique em `Browse` e selecione a pasta do projeto.
6. Certifique-se de que o arquivo `pom.xml` foi reconhecido e clique em `Finish`.
7. Aguarde o Eclipse baixar as dependências do Maven e o projeto estará pronto para execução.

## Autoria
- **Autor:** Débora Carvalho
- **Data de realização:** Fev/2025

Se houver alguma dúvida ou sugestão, sinta-se à vontade para contribuir! 🚀


