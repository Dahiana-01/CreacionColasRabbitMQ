package com.rabbitmq.creacioncolas.dto;


public class MensajeDTO {
    private String tipo;
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public MensajeDTO(String tipo, String contenido) {
        this.tipo = tipo;
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "MensajeDTO{" +
                "tipo='" + tipo + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
