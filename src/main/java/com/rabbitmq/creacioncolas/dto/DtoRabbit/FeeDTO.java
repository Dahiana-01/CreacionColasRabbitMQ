package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FeeDTO {
    @JsonProperty("TotalAmount") private String totalAmount;

    public FeeDTO() {}

    public FeeDTO(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalAmount() { return totalAmount; }
    public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeeDTO feeDTO = (FeeDTO) o;
        return Objects.equals(totalAmount, feeDTO.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAmount);
    }

    @Override
    public String toString() {
        return "FeeDTO{" + "totalAmount='" + totalAmount + '\'' + '}';
    }
}