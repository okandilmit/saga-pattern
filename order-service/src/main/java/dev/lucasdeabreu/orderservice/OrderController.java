package dev.lucasdeabreu.orderservice;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Order order) {
        log.debug("Post an order {}", order);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createOrder(order));
    }

    @GetMapping
    public ResponseEntity getAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
