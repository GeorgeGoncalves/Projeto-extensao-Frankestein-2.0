# Projeto de extensão(Frankenstein) 2.0

Esse projeto foi realizado por mim na disciplina de Programação Orientada a Objetos(POO), no curso de Analise e Desenvolvimento de Sistemas.  
Eu coloquei a primeira versão aqui no GitHub com nome de [Frankenstein](https://github.com/GeorgeGoncalves/Projeto-de-extens-o-Frankenstein-POO), mas como evolui no BackEnd, resolvi colocar em pratica atualizando meu projeto com Spring Boot.
Esse projeto foi feito com H2hibernate e Postgre.  
Esse projeto é o caixa de uma barbearia que tem dificuldade no fechamento de caixa, processo que é realizado manualmente.

![Diagrama UML](https://github.com/user-attachments/assets/bf35d648-5f7b-491c-93d1-80a2f668ed95)

### Conexao com H2hibernate 

```
<dependency> 
	<groupId>org.springframework.boot</groupId> 
	<artifactId>spring-boot-starter-data-jpa</artifactId> 
</dependency> 
<dependency> 
	<groupId>com.h2database</groupId> 
	<artifactId>h2</artifactId> 
	<scope>runtime</scope> 
</dependency> 
```

### Conexao com Postgre

```
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```

### Arquivo conexao com H2hibernate

```
# DATASOURCE 
spring.datasource.url=jdbc:h2:mem:testebd
spring.datasource.username=sa
spring.datasource.password=

# H2 CLIENT 
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# JPA, SQL 
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.properties.hibernate.format_sql=true
```

### Arquivo conexao Postgre

```
# DATASOURCE
spring.datasource.url=jdbc:postgresql://localhost:5432/barbearia
spring.datasource.username=postgres
spring.datasource.password=123456

# JPA, SQL
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
```

### Autor

George Gonçalves Miranda  
[<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/george-gon%C3%A7alves-901971323/?trk=li_LOL_SPIN_global_careers_jobsgtm_conv_acq_july2022_spinv1)
