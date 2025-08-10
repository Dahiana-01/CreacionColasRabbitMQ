package com.rabbitmq.creacioncolas.service;

import com.rabbitmq.creacioncolas.dto.DtoRabbit.MensajeColaDto;
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
    private final String exchangeName;
    private final String routingKey;

    public MensajeServiceImpl(RabbitTemplate rabbitTemplate,
                              @Value("${rabbitmq.exchange.name}") String exchangeName,
                              @Value("${rabbitmq.routing.key}") String routingKey) {
        this.rabbitTemplate = rabbitTemplate;
        this.exchangeName = exchangeName;
        this.routingKey = routingKey;
    }

    @Override
    public void enviarMensaje(MensajeColaDto mensajeDto) {
        log.info("Enviando DTO al exchange '{}' con la routing key '{}'", exchangeName, routingKey);
        rabbitTemplate.convertAndSend(exchangeName, routingKey, mensajeDto);
    }
}