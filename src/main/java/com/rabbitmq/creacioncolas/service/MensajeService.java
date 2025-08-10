package com.rabbitmq.creacioncolas.service;

import com.rabbitmq.creacioncolas.dto.DtoRabbit.MensajeColaDto;

public interface MensajeService {
    void enviarMensaje(MensajeColaDto mensaje);
}