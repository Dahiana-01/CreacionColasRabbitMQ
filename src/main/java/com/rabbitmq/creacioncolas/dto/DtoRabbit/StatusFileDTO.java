package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class StatusFileDTO {
    @JsonProperty("Code")
    private String code;

    public StatusFileDTO() {}

    public StatusFileDTO(String code) {
        this.code = code;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusFileDTO that = (StatusFileDTO) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "StatusFileDTO{" + "code='" + code + '\'' + '}';
    }
}
