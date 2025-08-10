package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class TransactionReferenceDTO {
    @JsonProperty("AccountIdentification") private String accountIdentification;

    public TransactionReferenceDTO() {}

    public TransactionReferenceDTO(String accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    public String getAccountIdentification() { return accountIdentification; }
    public void setAccountIdentification(String accountIdentification) { this.accountIdentification = accountIdentification; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionReferenceDTO that = (TransactionReferenceDTO) o;
        return Objects.equals(accountIdentification, that.accountIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIdentification);
    }

    @Override
    public String toString() {
        return "TransactionReferenceDTO{" + "accountIdentification='" + accountIdentification + '\'' + '}';
    }

}
