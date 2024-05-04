package com.github.jackgvdl.executor.service;

import com.github.jackgvdl.common.data.domain.Order;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class ExecutionService {

  public Order create(Order order) {
    order.setOrderId(UUID.randomUUID().toString()); // UUID
    order.setStatus("CREATED");

    log.info("Order created: ID ({})", order.getOrderId());
    return order;
  }
}
