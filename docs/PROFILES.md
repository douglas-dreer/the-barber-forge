# Configuração de Perfis de Ambiente

## Perfil Development (`dev`)

**Arquivo**: `src/main/resources/application-dev.yml`

### Características
- Banco H2 em memória
- Console H2 habilitado
- SQL logging ativo
- DDL auto-create
- Dados de exemplo carregados

### Configuração Completa
```yaml
spring:
  datasource:
    url: jdbc:h2:mem:devdb
    driver-class-name: org.h2.Driver
    username: sa
    password: 
  h2:
    console:
      enabled: true
      path: /h2-console
      settings:
        web-allow-others: true
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: create-drop
    properties:
      hibernate:
        format_sql: true
        use_sql_comments: true
  sql:
    init:
      mode: always
      data-locations: classpath:data-dev.sql

logging:
  level:
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
    org.springframework.security: DEBUG

management:
  endpoints:
    web:
      exposure:
        include: '*'
