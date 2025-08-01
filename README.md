<h1 allign = "center">
    TodoList
</h1>

API para gernciar tarefas(CRUD) [desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) proposto para backend junior, que se candidataram a vaga na Simplify.

## Tecnologias
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spirng Data JPA](https://spring.io/projects/spring-data-jpa)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar

- Clonar repositório
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

- A ferramenta utilizada para realizar as requisições HTTP foi o [Postman](https://www.postman.com/)

### Criar Tarefa(POST):

---

**URL:** `http://localhost:8080/todos`  
**Método** `POST`
**BODY (JSON):**

```json
{
  "name": "Estudar Spring",
  "description": "Aprender sobre API REST",
  "accomplished": false,
  "priority": 1
}

```

### Listar Tarefas(GET):

---

**URL:** `http://localhost:8080/todos`
**Método:**`GET`

### Atualizar Tarefa(PUT):

---

**URL:** `http://localhost:8080/todos/{id}`  
**Método** `PUT`
**BODY (JSON):**

```json
{
  "name": "Tarefa Atualizada",
  "description": "Conteudo atualizado",
  "accomplished": true,
  "priority": 2
}

```

### Deletar Tarefa(DELETE):

---

**URL:**`http://localhost:8080/todos/{id}`
**Método**`DELETE`
