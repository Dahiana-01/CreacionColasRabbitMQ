package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FeesDTO {
    @JsonProperty("TotalAmount") private String totalAmount;

    public FeesDTO() {}

    public FeesDTO(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount() { return totalAmount; }
    public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeesDTO feesDTO = (FeesDTO) o;
        return Objects.equals(totalAmount, feesDTO.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAmount);
    }

    @Override
    public String toString() {
        return "FeesDTO{" + "totalAmount='" + totalAmount + '\'' + '}';
    }
}