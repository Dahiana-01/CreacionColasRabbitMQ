package com.rabbitmq.creacioncolas;

import com.rabbitmq.creacioncolas.config.RabbitMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RabbitMQConfig.class)
public class CreacioncolasApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreacioncolasApplication.class, args);
    }

}
