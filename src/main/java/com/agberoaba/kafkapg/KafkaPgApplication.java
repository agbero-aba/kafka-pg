package com.agberoaba.kafkapg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaPgApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaPgApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
    return args -> kafkaTemplate.send("file", "http://my-link");
  }
}
