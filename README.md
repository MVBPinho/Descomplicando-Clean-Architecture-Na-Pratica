Este repositório contém comandos e exemplos úteis para o curso, incluindo simulação de CEP com Wiremock, acesso ao MongoDB via Docker e mensagens para fila Kafka.

## 📚 Comandos MongoDB para Este Curso
```bash
## 🐳 Acesse o Docker
docker ps
docker exec -it mongodb mongosh -u root -p example
show collections
```

## 🚀 Simulando Aplicação de CEP com Wiremock
Acesse a pasta `mocks` e execute o comando abaixo para iniciar o Wiremock:
```bash
## Executar o Wiremock para simular uma aplicação de CEP
java -jar .\wiremock-standalone-3.12.1.jar --port 8082

## 🔎 Exemplos de Requisições
curl --location 'http://localhost:8082/addresses/38400000'
curl --location 'http://localhost:8082/addresses/38400001'
```

## 💬 Tópico Kafka para Validação de CPF
```bash
{
  "id": "67f1efee52bad20ca2e33839",
  "name": "danilo",
  "zipCode": "38400001",
  "cpf": "11111111111",
  "isValidCpf": true
}
```

## 🔶 Requisições via Postman
```bash
## findCustomerById
curl --location 'http://localhost:8081/api/v1/customers/67f1f7d4ed42be0dbd05bd8b'

## insertCustomer
curl --location 'http://localhost:8081/api/v1/customers' \
--header 'Content-Type: application/json' \
--data '{
    "name" : "danilo",
    "zipCode" : "38400001",
    "cpf" : "11111111111"
}'

## updateCustomerById
curl --location --request PUT 'http://localhost:8081/api/v1/customers/67f1ef0852bad20ca2e33838' \
--header 'Content-Type: application/json' \
--data '{
    "name" : "Sebastiao",
    "zipCode" : "38400000",
    "cpf" : "11111111111"
}'

## deleteCustomerById
curl --location --request DELETE 'http://localhost:8081/api/v1/customers/67f1efee52bad20ca2e33839'
```