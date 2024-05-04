package com.github.jackgvdl.executor.controller;

import com.github.jackgvdl.common.data.domain.Order;
import com.github.jackgvdl.executor.service.ExecutionService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/executor")
@AllArgsConstructor
public class ExecutorController {

  private final ExecutionService executionService;

  @PostMapping
  public ResponseEntity<Order> execute(Order order) {
    final var response = executionService.create(order);
    return ResponseEntity.ok(response);
  }
}
