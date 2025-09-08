# Gerenciamento de Dependências

Este documento fornece uma visão geral das dependências utilizadas no projeto, organizadas por escopo. As dependências são gerenciadas pelo Gradle e definidas no arquivo `build.gradle.kts`.

---

## Escopo: `implementation`

Bibliotecas essenciais para a compilação e execução da aplicação em todos os ambientes.

| Dependência                               | Propósito                                                                      |
| ----------------------------------------- | ------------------------------------------------------------------------------ |
| `spring-boot-starter-actuator`            | Fornece endpoints para monitoramento e gerenciamento da aplicação (health, metrics). |
| `spring-boot-starter-data-jdbc`           | Starter para uso de JDBC com o Spring, simplificando o acesso a dados.         |
| `spring-boot-starter-data-jpa`            | Starter para persistência de dados com JPA e Hibernate.                        |
| `spring-boot-starter-data-rest`           | Expõe repositórios Spring Data como endpoints REST automaticamente.            |
| `spring-boot-starter-security`            | Habilita e configura a segurança da aplicação (autenticação e autorização).    |
| `spring-boot-starter-validation`          | Fornece suporte para validação de dados (ex: anotações `@Valid`, `@NotNull`).    |
| `spring-boot-starter-web`                 | Starter principal para a construção de aplicações web e APIs RESTful com Spring MVC. |
| `jackson-module-kotlin`                   | Adiciona suporte de primeira classe para serialização/desserialização de Kotlin. |
| `kotlin-reflect`                          | Biblioteca de reflexão do Kotlin, necessária para alguns frameworks.           |
| `spring-cloud-starter-openfeign`          | Cliente HTTP declarativo para facilitar a comunicação entre microserviços.     |

---

## Escopo: `developmentOnly`

Bibliotecas usadas apenas durante o desenvolvimento local para melhorar a produtividade. Elas não são incluídas no pacote final da aplicação.

| Dependência                    | Propósito                                                                    |
| ------------------------------ | ---------------------------------------------------------------------------- |
| `spring-boot-devtools`         | Habilita ferramentas de desenvolvimento como reinicialização automática (live reload). |

---

## Escopo: `runtimeOnly`

Dependências necessárias apenas em tempo de execução, mas não para a compilação do código.

| Dependência               | Propósito                                                   |
| ------------------------- | ----------------------------------------------------------- |
| `h2database`              | Driver para o banco de dados H2, usado no perfil de desenvolvimento. |
| `ojdbc11`                 | Driver JDBC da Oracle para conexão com o banco de dados Oracle. |

---

## Escopo: `testImplementation`

Bibliotecas utilizadas exclusivamente para a escrita e execução de testes.

| Dependência                   | Propósito                                                              |
| ----------------------------- | ---------------------------------------------------------------------- |
| `spring-boot-starter-test`    | Starter principal para testes, inclui JUnit 5, Mockito e AssertJ.      |
| `kotlin-test-junit5`          | Fornece integrações e asserções específicas do Kotlin para JUnit 5.    |
| `spring-restdocs-mockmvc`     | Permite a geração de documentação de API a partir de testes com MockMVC. |
| `spring-security-test`        | Fornece suporte para testar endpoints e métodos protegidos pelo Spring Security. |

---

## Gerenciamento de Versões (BOM)

Utilizamos o `spring-cloud-dependencies` Bill of Materials (BOM) para garantir que as versões das bibliotecas do Spring Cloud sejam compatíveis entre si. Isso é definido no bloco `dependencyManagement`.