package com.agberoaba.kafkapg.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

  @Bean
  public NewTopic xlsxFileTopic() {
    return TopicBuilder.name("file").build();
  }
}
