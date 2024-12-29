package com.github.jackgvdl.gateway.config.lib;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class NetworkConfig {

  @Value("${application.network.executorServiceUrl}")
  private String executorServiceUrl;
}
