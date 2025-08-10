package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class OperationDataDTO {
    @JsonProperty("PayrollRegister")
    private PayrollRegisterDTO payrollRegister;

    public OperationDataDTO() {}

    public OperationDataDTO(PayrollRegisterDTO payrollRegister) {
        this.payrollRegister = payrollRegister;
    }

    public PayrollRegisterDTO getPayrollRegister() { return payrollRegister; }
    public void setPayrollRegister(PayrollRegisterDTO payrollRegister) { this.payrollRegister = payrollRegister; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationDataDTO that = (OperationDataDTO) o;
        return Objects.equals(payrollRegister, that.payrollRegister);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollRegister);
    }

    @Override
    public String toString() {
        return "OperationDataDTO{" +
                "payrollRegister=" + payrollRegister +
                '}';
    }
}