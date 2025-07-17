package com.rabbitmq.creacioncolas.controller;

import com.rabbitmq.creacioncolas.dto.MensajeDTO;
import com.rabbitmq.creacioncolas.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mensajes")
public class MessageController {

    private final MensajeService mensajeService;

    @Autowired
    public MessageController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarMensaje(@RequestBody MensajeDTO mensajeDTO) {
        mensajeService.enviarMensaje(mensajeDTO);
        return ResponseEntity.ok("Mensaje DTO enviado exitosamente a la cola.");
    }
}

