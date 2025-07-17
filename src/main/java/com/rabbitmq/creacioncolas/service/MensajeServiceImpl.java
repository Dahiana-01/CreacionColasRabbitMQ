package com.rabbitmq.creacioncolas.service;

import com.rabbitmq.creacioncolas.config.RabbitMQConfig;
import com.rabbitmq.creacioncolas.dto.MensajeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MensajeServiceImpl implements MensajeService {

    private static final Logger log = LoggerFactory.getLogger(MensajeServiceImpl.class);

    private final RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.exchange}")
    private String EXCHANGE_NAME;

    @Value("${spring.rabbitmq.binding}")
    private String ROUTING_KEY;

    @Autowired
    public MensajeServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void enviarMensaje(MensajeDTO mensajeDTO) {
        log.info("Enviando DTO al exchange '{}' con la routing key '{}'", EXCHANGE_NAME, ROUTING_KEY);
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, mensajeDTO);
    }
}