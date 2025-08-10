package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class EmployeePayrollDispersionDTO {
    @JsonProperty("UserReference") private String userReference;
    @JsonProperty("IpAddress") private String ipAddress;
    @JsonProperty("Date") private DateRangeDTO date;
    @JsonProperty("NumberValidatedRecords") private String numberValidatedRecords;
    @JsonProperty("Fee") private FeeDTO fee;
    @JsonProperty("TotalAmount") private String totalAmount;
    @JsonProperty("ErrorRecordCount") private String errorRecordCount;
    @JsonProperty("SuccessfulRecordCount") private String successfulRecordCount;
    @JsonProperty("JsonWithReportedErrors") private String jsonWithReportedErrors;
    @JsonProperty("FileNameValidation") private String fileNameValidation;
    @JsonProperty("PayerAccountValidation") private String payerAccountValidation;
    @JsonProperty("CreditAccountValidation") private String creditAccountValidation;

    public EmployeePayrollDispersionDTO() {}

    public EmployeePayrollDispersionDTO(String userReference, String ipAddress, DateRangeDTO date, String numberValidatedRecords, FeeDTO fee, String totalAmount, String errorRecordCount, String successfulRecordCount, String jsonWithReportedErrors, String fileNameValidation, String payerAccountValidation, String creditAccountValidation) {
        this.userReference = userReference;
        this.ipAddress = ipAddress;
        this.date = date;
        this.numberValidatedRecords = numberValidatedRecords;
        this.fee = fee;
        this.totalAmount = totalAmount;
        this.errorRecordCount = errorRecordCount;
        this.successfulRecordCount = successfulRecordCount;
        this.jsonWithReportedErrors = jsonWithReportedErrors;
        this.fileNameValidation = fileNameValidation;
        this.payerAccountValidation = payerAccountValidation;
        this.creditAccountValidation = creditAccountValidation;
    }

    public String getUserReference() { return userReference; }
    public void setUserReference(String userReference) { this.userReference = userReference; }
    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }
    public DateRangeDTO getDate() { return date; }
    public void setDate(DateRangeDTO date) { this.date = date; }
    public String getNumberValidatedRecords() { return numberValidatedRecords; }
    public void setNumberValidatedRecords(String numberValidatedRecords) { this.numberValidatedRecords = numberValidatedRecords; }
    public FeeDTO getFee() { return fee; }
    public void setFee(FeeDTO fee) { this.fee = fee; }
    public String getTotalAmount() { return totalAmount; }
    public void setTotalAmount(String totalAmount) { this.totalAmount = totalAmount; }
    public String getErrorRecordCount() { return errorRecordCount; }
    public void setErrorRecordCount(String errorRecordCount) { this.errorRecordCount = errorRecordCount; }
    public String getSuccessfulRecordCount() { return successfulRecordCount; }
    public void setSuccessfulRecordCount(String successfulRecordCount) { this.successfulRecordCount = successfulRecordCount; }
    public String getJsonWithReportedErrors() { return jsonWithReportedErrors; }
    public void setJsonWithReportedErrors(String jsonWithReportedErrors) { this.jsonWithReportedErrors = jsonWithReportedErrors; }
    public String getFileNameValidation() { return fileNameValidation; }
    public void setFileNameValidation(String fileNameValidation) { this.fileNameValidation = fileNameValidation; }
    public String getPayerAccountValidation() { return payerAccountValidation; }
    public void setPayerAccountValidation(String payerAccountValidation) { this.payerAccountValidation = payerAccountValidation; }
    public String getCreditAccountValidation() { return creditAccountValidation; }
    public void setCreditAccountValidation(String creditAccountValidation) { this.creditAccountValidation = creditAccountValidation; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePayrollDispersionDTO that = (EmployeePayrollDispersionDTO) o;
        return Objects.equals(userReference, that.userReference) && Objects.equals(ipAddress, that.ipAddress) && Objects.equals(date, that.date) && Objects.equals(numberValidatedRecords, that.numberValidatedRecords) && Objects.equals(fee, that.fee) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(errorRecordCount, that.errorRecordCount) && Objects.equals(successfulRecordCount, that.successfulRecordCount) && Objects.equals(jsonWithReportedErrors, that.jsonWithReportedErrors) && Objects.equals(fileNameValidation, that.fileNameValidation) && Objects.equals(payerAccountValidation, that.payerAccountValidation) && Objects.equals(creditAccountValidation, that.creditAccountValidation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userReference, ipAddress, date, numberValidatedRecords, fee, totalAmount, errorRecordCount, successfulRecordCount, jsonWithReportedErrors, fileNameValidation, payerAccountValidation, creditAccountValidation);
    }

    @Override
    public String toString() {
        return "EmployeePayrollDispersionDTO{" + "userReference='" + userReference + '\'' + ", ipAddress='" + ipAddress + '\'' + ", date=" + date + ", numberValidatedRecords='" + numberValidatedRecords + '\'' + ", fee=" + fee + ", totalAmount='" + totalAmount + '\'' + ", errorRecordCount='" + errorRecordCount + '\'' + ", successfulRecordCount='" + successfulRecordCount + '\'' + ", jsonWithReportedErrors='" + jsonWithReportedErrors + '\'' + ", fileNameValidation='" + fileNameValidation + '\'' + ", payerAccountValidation='" + payerAccountValidation + '\'' + ", creditAccountValidation='" + creditAccountValidation + '\'' + '}';
    }
}