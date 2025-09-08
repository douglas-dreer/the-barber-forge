# The Barber Forge
<img alt="Logo do The Barber Forge" height="300" src="docs/img/The%20Barber%27s%20Forge.png" title="Logo do Projeto: The Barber&#39;s Forge" width="300" style="text-align: center"/>


Projeto backend para a plataforma The Barber Forge, uma solução para otimizar e gerenciar agendamentos e serviços em barbearias.

---

## Badges
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com)
[![Code Coverage](https://img.shields.io/badge/coverage-0%25-lightgrey)](https://sonarcloud.io)
[![Quality Gate Status](https://img.shields.io/badge/quality%20gate-not%20checked-lightgrey)](https://sonarcloud.io)
[![Kotlin Version](https://img.shields.io/badge/kotlin-1.9.25-blue?logo=kotlin)](https://kotlinlang.org)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-green?logo=spring)](https://spring.io/projects/spring-boot)
[![Java Version](https://img.shields.io/badge/java-21-orange.svg)](https://www.oracle.com/java/technologies/downloads/#java21)

---

## 🚀 Tecnologias Utilizadas

Este projeto foi construído com um conjunto de tecnologias modernas e robustas para garantir performance, qualidade e manutenibilidade.

- **Linguagem:** [Kotlin](https://kotlinlang.org/) `1.9.25`
- **Framework Principal:** [Spring Boot](https://spring.io/projects/spring-boot) `3.5.5`
- **Build & Dependências:** [Gradle](https://gradle.org/)
- **Ambiente de Execução:** [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- **Persistência de Dados:**
    - [Spring Data JPA](https://spring.io/projects/spring-data-jpa) & JDBC
    - **Banco de Dados (Desenvolvimento):** [H2 Database](https://www.h2database.com/html/main.html)
    - **Banco de Dados (Produção):** [Oracle DB](https://www.oracle.com/database/)
- **Segurança:** [Spring Security](https://spring.io/projects/spring-security)
- **APIs & Webservices:**
    - Spring Web (REST) & Spring Data REST
    - [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign) para comunicação entre serviços
- **Testes:**
    - [JUnit 5](https://junit.org/junit5/)
    - [Spring Boot Test](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing)
    - MockMVC
- **Qualidade de Código & Cobertura:**
    - [Jacoco](https://www.eclemma.org/jacoco/) para relatório de cobertura de testes
    - [SonarQube](https://www.sonarqube.org/) para análise estática de código
- **Documentação de API:**
    - [Spring REST Docs](https://spring.io/projects/spring-restdocs)
    - [Asciidoctor](https://asciidoctor.org/) para renderização da documentação

---

## 📋 Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em seu ambiente:

-   **JDK 21** ou superior
-   Uma IDE de sua preferência (IntelliJ IDEA ou VS Code são recomendados)
-   Docker (para rodar instâncias de SonarQube ou Oracle, se necessário)

> **Nota:** Não é necessário instalar o Gradle, pois o projeto utiliza o Gradle Wrapper (`./gradlew`), que gerencia a versão correta do Gradle automaticamente.

---

## ⚙️ Como Começar

Siga os passos abaixo para clonar e executar o projeto localmente.

**1. Clone o repositório:**
```bash
git clone [https://github.com/seu-usuario/the-barber-forge.git](https://github.com/seu-usuario/the-barber-forge.git)
cd the-barber-forge
```

**2. Execute a aplicação (Perfil de Desenvolvimento):**
O projeto é configurado para usar o perfil `dev` por padrão, que utiliza um banco H2 em memória. Para mais detalhes, veja [docs/PROFILES.md](docs/PROFILES.md).

Para iniciar a aplicação, execute o seguinte comando:
```bash
./gradlew bootRun
```
A aplicação estará disponível em `http://localhost:8080`. O console do H2 pode ser acessado em `http://localhost:8080/h2-console`.

---

## 🛠️ Comandos Úteis do Gradle

### Executar Testes
Para rodar todos os testes unitários e de integração:
```bash
./gradlew test
```

### Gerar Relatório de Cobertura de Testes
Para analisar a cobertura de código dos testes, execute:
```bash
./gradlew jacocoTestReport
```
O relatório HTML estará disponível em `build/reports/jacoco/test/html/index.html`.

### Análise de Qualidade de Código
Antes de executar, certifique-se que seu servidor SonarQube está rodando e configurado.
```bash
./gradlew sonarqube
```

### Gerar Documentação da API
A documentação é gerada a partir dos testes. Para criá-la:
```bash
./gradlew asciidoctor
```
O resultado será um arquivo HTML localizado em `build/docs/asciidoc/index.html`.

### Limpar o Projeto
Para remover o diretório `build` e todos os artefatos gerados:
```bash
./gradlew clean
```

---

## 🔀 Estratégia de Branches (GitFlow)

Adotamos o GitFlow como nossa estratégia de versionamento para manter o repositório organizado.

-   `main`: Contém o código de produção estável. Só aceita merges da branch `develop` para releases.
-   `develop`: Branch principal de desenvolvimento. Todas as novas features devem ser mergeadas aqui.
-   `feature/*`: Crie uma branch a partir de `develop` para cada nova funcionalidade (ex: `feature/user-authentication`). Pull Requests devem ser abertos para `develop`.

Qualquer alteração no código deve ser submetida através de um **Pull Request**.