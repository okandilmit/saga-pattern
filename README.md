# Saga Pattern

In this project there is 3 services which is;

Stock Service: It checks if there is any stock for item or not

Payment Service: It checks if the payment is succesful or not

Order Service: For the order creation

As the Saga Pattern commands, this microservices should be in order. Because that's what saga pattern does. In this example careography based saga pattern is used.

For this project, as an example: If one service fails, all fails but if all services succeed all succeeds. When the order created, the payment service gets triggered. If the payment is successful, stock service gets triggered, if not order gets cancelled. When the stock service triggered, it checks whether the ordered item is in stock or not. If the item is in stock, decrease the item count, if not return error and order gets cancelled.

In order to make this project run, since all services and rabbitMQ is dockerized, docker images need to be built and run. Since there is no front-end it can be triggered from postman.

This project is successfully copied :) and made changes from:
https://github.com/lucasdeabreu/saga-pattern-example
