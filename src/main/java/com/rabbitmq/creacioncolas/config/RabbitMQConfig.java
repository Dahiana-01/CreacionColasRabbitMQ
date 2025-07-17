package com.rabbitmq.creacioncolas.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private static final Logger log = LoggerFactory.getLogger(RabbitMQConfig.class);

    @Value("${spring.rabbitmq.queue}")
    private String QUEUE_NAME;

    @Value("${spring.rabbitmq.exchange}")
    private String EXCHANGE_NAME;

    @Value("${spring.rabbitmq.binding}")
    private String ROUTING_KEY;

    private final AmqpAdmin amqpAdmin;

    @Autowired
    public RabbitMQConfig(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setExchange(EXCHANGE_NAME);
        rabbitTemplate.setRoutingKey(ROUTING_KEY);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }

    @PostConstruct
    public void setupRabbitMq() {
        log.info("INICIANDO LA CREACIÓN MANUAL DE LA INFRAESTRUCTURA RABBITMQ");
        try {
            // 1. Crear la cola
            Queue queue = new Queue(QUEUE_NAME, true, false, false);
            log.info("Creando cola: {}", QUEUE_NAME);
            amqpAdmin.declareQueue(queue);

            // 2. Crear el exchange
            TopicExchange exchange = new TopicExchange(EXCHANGE_NAME, true, false);
            log.info("Creando exchange: {}", EXCHANGE_NAME);
            amqpAdmin.declareExchange(exchange);

            // 3. Crear el enlace (binding) entre la cola y el exchange
            Binding binding = new Binding(QUEUE_NAME, Binding.DestinationType.QUEUE, EXCHANGE_NAME, ROUTING_KEY, null);
            log.info("Creando binding de {} a {} con la clave {}", QUEUE_NAME, EXCHANGE_NAME, ROUTING_KEY);
            amqpAdmin.declareBinding(binding);

            log.info("INFRAESTRUCTURA RABBITMQ CREADA EXITOSAMENTE");

        } catch (Exception e) {
            log.error("ERROR AL CREAR LA INFRAESTRUCTURA DE RABBITMQ", e);
        }
    }
}
