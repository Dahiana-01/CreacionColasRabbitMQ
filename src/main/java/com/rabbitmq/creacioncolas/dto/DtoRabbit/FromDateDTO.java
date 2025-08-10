package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FromDateDTO {
    @JsonProperty("FromDateTime") private String fromDateTime;

    public FromDateDTO() {}

    public FromDateDTO(String fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    public String getFromDateTime() { return fromDateTime; }
    public void setFromDateTime(String fromDateTime) { this.fromDateTime = fromDateTime; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FromDateDTO that = (FromDateDTO) o;
        return Objects.equals(fromDateTime, that.fromDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromDateTime);
    }

    @Override
    public String toString() {
        return "FromDateDTO{" + "fromDateTime='" + fromDateTime + '\'' + '}';
    }
}