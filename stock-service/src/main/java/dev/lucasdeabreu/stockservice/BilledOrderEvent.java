package dev.lucasdeabreu.stockservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BilledOrderEvent {
    private Order order;
}