package com.rabbitmq.creacioncolas.service;

import com.rabbitmq.creacioncolas.dto.MensajeDTO;

public interface MensajeService {
    void enviarMensaje(MensajeDTO mensajeDTO);
}