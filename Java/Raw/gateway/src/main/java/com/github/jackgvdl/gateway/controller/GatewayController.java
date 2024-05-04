package com.github.jackgvdl.gateway.controller;

import com.github.jackgvdl.common.data.domain.Order;
import com.github.jackgvdl.gateway.service.GatewayService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
@AllArgsConstructor
public class GatewayController {

  private GatewayService gatewayService;

  @PostMapping
  public ResponseEntity<Order> createOrder(@RequestBody Order order) {
    final var response = gatewayService.createOrder(order);
    return ResponseEntity.ok(response);
  }
}
