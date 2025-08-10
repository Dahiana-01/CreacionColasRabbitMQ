package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class MensajeColaDto {

    @JsonProperty("messageId") private String messageId;
    @JsonProperty("timestamp") private String timestamp;
    @JsonProperty("status") private String status;
    @JsonProperty("errors") private List<Object> errors;
    @JsonProperty("errorType") private String errorType;
    @JsonProperty("path") private String path;
    @JsonProperty("message") private String message;
    @JsonProperty("operationData") private OperationDataDTO operationData;

    public MensajeColaDto() {}

    public MensajeColaDto(String messageId, String timestamp, String status, List<Object> errors, String errorType, String path, String message, OperationDataDTO operationData) {
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.status = status;
        this.errors = errors;
        this.errorType = errorType;
        this.path = path;
        this.message = message;
        this.operationData = operationData;
    }

    public String getMessageId() { return messageId; }
    public void setMessageId(String messageId) { this.messageId = messageId; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public List<Object> getErrors() { return errors; }
    public void setErrors(List<Object> errors) { this.errors = errors; }
    public String getErrorType() { return errorType; }
    public void setErrorType(String errorType) { this.errorType = errorType; }
    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public OperationDataDTO getOperationData() { return operationData; }
    public void setOperationData(OperationDataDTO operationData) { this.operationData = operationData; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MensajeColaDto that = (MensajeColaDto) o;
        return Objects.equals(messageId, that.messageId) && Objects.equals(timestamp, that.timestamp) && Objects.equals(status, that.status) && Objects.equals(errors, that.errors) && Objects.equals(errorType, that.errorType) && Objects.equals(path, that.path) && Objects.equals(message, that.message) && Objects.equals(operationData, that.operationData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, timestamp, status, errors, errorType, path, message, operationData);
    }

    @Override
    public String toString() {
        return "MensajeDTO{" +
                "messageId='" + messageId + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", status='" + status + '\'' +
                ", errors=" + errors +
                ", errorType='" + errorType + '\'' +
                ", path='" + path + '\'' +
                ", message='" + message + '\'' +
                ", operationData=" + operationData +
                '}';
    }
}