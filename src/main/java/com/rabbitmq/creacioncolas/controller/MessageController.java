package com.rabbitmq.creacioncolas.controller;

import com.rabbitmq.creacioncolas.dto.DtoRabbit.MensajeColaDto;
import com.rabbitmq.creacioncolas.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qa-RegistroNomina-Queue")
public class MessageController {

    private final MensajeService mensajeService;

    @Autowired
    public MessageController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarMensaje(@RequestBody MensajeColaDto mensajeColaDto) {
        mensajeService.enviarMensaje(mensajeColaDto);
        return ResponseEntity.ok("Mensaje enviado exitosamente a la cola RabbitMQ.");
    }
}

