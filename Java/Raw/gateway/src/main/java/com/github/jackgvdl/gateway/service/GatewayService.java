package com.github.jackgvdl.gateway.service;

import com.github.jackgvdl.common.data.domain.Order;
import com.github.jackgvdl.gateway.config.lib.NetworkConfig;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Log4j2
@Service
@RequiredArgsConstructor
public class GatewayService {

  private final NetworkConfig networkConfig;
  private WebClient webClient;

  @PostConstruct
  public void init() {
    final var executorUrl = networkConfig.getExecutorServiceUrl();
    webClient = WebClient.create(executorUrl);
  }

  public Order createOrder(Order order) {
    final var result =
        webClient
            .post()
            .uri("/executor")
            .bodyValue(order)
            .retrieve()
            .bodyToMono(Order.class)
            .block();

    assert result != null;

    log.info("Order executed: status ({})", result.getStatus());
    return result;
  }
}
