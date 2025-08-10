package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class DateRangeDTO {
    @JsonProperty("FromDateTime") private String fromDateTime;
    @JsonProperty("ToDateTime") private String toDateTime;

    public DateRangeDTO() {}

    public DateRangeDTO(String fromDateTime, String toDateTime) {
        this.fromDateTime = fromDateTime;
        this.toDateTime = toDateTime;
    }

    public String getFromDateTime() { return fromDateTime; }
    public void setFromDateTime(String fromDateTime) { this.fromDateTime = fromDateTime; }
    public String getToDateTime() { return toDateTime; }
    public void setToDateTime(String toDateTime) { this.toDateTime = toDateTime; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateRangeDTO that = (DateRangeDTO) o;
        return Objects.equals(fromDateTime, that.fromDateTime) && Objects.equals(toDateTime, that.toDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromDateTime, toDateTime);
    }

    @Override
    public String toString() {
        return "DateRangeDTO{" + "fromDateTime='" + fromDateTime + '\'' + ", toDateTime='" + toDateTime + '\'' + '}';
    }
}