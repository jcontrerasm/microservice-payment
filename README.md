Microservice Payment
=====

**Stack del proyecto:**

* Spring Boot
* MySQL
* Kafka
* Docker

## Pre-Requisitos

* Tener java configurado.
* Tener docker y docker-compose instalados.
* En MySQL, crear una base de datos llamada **`db_borrow`**.

## Ejecución del proyecto en local

* Construir imagen ejecutando **`make build`** en linux y **`docker build -t microservice-payment:1.0.0`** en windows.
* Levantar los servicios ejecutando **`make up`** en linux y **`docker-compose up`** en windows.
* Realizar un pago: **` Tipo POST - http://localhost:8089/v1/paymentEvent`**.

~~~
{
	"nroBorrow": 46546457,
	"feeAmount": 40.5,
	"fee": 1,
	"creationDate": "18/04/2020",
	"borrowId": 1
}
~~~
