package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PaysheetDTO {
    @JsonProperty("Date") private FromDateDTO date;
    @JsonProperty("UserReference") private String userReference;
    @JsonProperty("IpAddress") private String ipAddress;
    @JsonProperty("DateTime") private String dateTime;

    public PaysheetDTO() {}

    public PaysheetDTO(FromDateDTO date, String userReference, String ipAddress, String dateTime) {
        this.date = date;
        this.userReference = userReference;
        this.ipAddress = ipAddress;
        this.dateTime = dateTime;
    }

    public FromDateDTO getDate() { return date; }
    public void setDate(FromDateDTO date) { this.date = date; }
    public String getUserReference() { return userReference; }
    public void setUserReference(String userReference) { this.userReference = userReference; }
    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaysheetDTO that = (PaysheetDTO) o;
        return Objects.equals(date, that.date) && Objects.equals(userReference, that.userReference) && Objects.equals(ipAddress, that.ipAddress) && Objects.equals(dateTime, that.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, userReference, ipAddress, dateTime);
    }

    @Override
    public String toString() {
        return "PaysheetDTO{" + "date=" + date + ", userReference='" + userReference + '\'' + ", ipAddress='" + ipAddress + '\'' + ", dateTime='" + dateTime + '\'' + '}';
    }
}