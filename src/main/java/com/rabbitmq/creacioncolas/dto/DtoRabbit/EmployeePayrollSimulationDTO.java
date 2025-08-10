package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class EmployeePayrollSimulationDTO {
    @JsonProperty("UserReference") private String userReference;
    @JsonProperty("IpAddress") private String ipAddress;
    @JsonProperty("Date") private DateRangeDTO date;
    @JsonProperty("NumberValidatedRecords") private String numberValidatedRecords;
    @JsonProperty("TotalNumberValidatedRecords") private String totalNumberValidatedRecords;
    @JsonProperty("Fees") private FeesDTO fees;
    @JsonProperty("TotalDocumentValueWithTaxes") private String totalDocumentValueWithTaxes;
    @JsonProperty("ErrorRecordCount") private String errorRecordCount;
    @JsonProperty("SuccessfulRecordCount") private String successfulRecordCount;
    @JsonProperty("TotalOperations") private String totalOperations;
    @JsonProperty("JsonWithReportedErrors") private String jsonWithReportedErrors;
    @JsonProperty("FileNameValidation") private String fileNameValidation;
    @JsonProperty("PayerAccountValidation") private String payerAccountValidation;
    @JsonProperty("CreditAccountValidation") private String creditAccountValidation;

    public EmployeePayrollSimulationDTO() {}

    public EmployeePayrollSimulationDTO(String userReference, String ipAddress, DateRangeDTO date, String numberValidatedRecords, String totalNumberValidatedRecords, FeesDTO fees, String totalDocumentValueWithTaxes, String errorRecordCount, String successfulRecordCount, String totalOperations, String jsonWithReportedErrors, String fileNameValidation, String payerAccountValidation, String creditAccountValidation) {
        this.userReference = userReference;
        this.ipAddress = ipAddress;
        this.date = date;
        this.numberValidatedRecords = numberValidatedRecords;
        this.totalNumberValidatedRecords = totalNumberValidatedRecords;
        this.fees = fees;
        this.totalDocumentValueWithTaxes = totalDocumentValueWithTaxes;
        this.errorRecordCount = errorRecordCount;
        this.successfulRecordCount = successfulRecordCount;
        this.totalOperations = totalOperations;
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
    public String getTotalNumberValidatedRecords() { return totalNumberValidatedRecords; }
    public void setTotalNumberValidatedRecords(String totalNumberValidatedRecords) { this.totalNumberValidatedRecords = totalNumberValidatedRecords; }
    public FeesDTO getFees() { return fees; }
    public void setFees(FeesDTO fees) { this.fees = fees; }
    public String getTotalDocumentValueWithTaxes() { return totalDocumentValueWithTaxes; }
    public void setTotalDocumentValueWithTaxes(String totalDocumentValueWithTaxes) { this.totalDocumentValueWithTaxes = totalDocumentValueWithTaxes; }
    public String getErrorRecordCount() { return errorRecordCount; }
    public void setErrorRecordCount(String errorRecordCount) { this.errorRecordCount = errorRecordCount; }
    public String getSuccessfulRecordCount() { return successfulRecordCount; }
    public void setSuccessfulRecordCount(String successfulRecordCount) { this.successfulRecordCount = successfulRecordCount; }
    public String getTotalOperations() { return totalOperations; }
    public void setTotalOperations(String totalOperations) { this.totalOperations = totalOperations; }
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
        EmployeePayrollSimulationDTO that = (EmployeePayrollSimulationDTO) o;
        return Objects.equals(userReference, that.userReference) && Objects.equals(ipAddress, that.ipAddress) && Objects.equals(date, that.date) && Objects.equals(numberValidatedRecords, that.numberValidatedRecords) && Objects.equals(totalNumberValidatedRecords, that.totalNumberValidatedRecords) && Objects.equals(fees, that.fees) && Objects.equals(totalDocumentValueWithTaxes, that.totalDocumentValueWithTaxes) && Objects.equals(errorRecordCount, that.errorRecordCount) && Objects.equals(successfulRecordCount, that.successfulRecordCount) && Objects.equals(totalOperations, that.totalOperations) && Objects.equals(jsonWithReportedErrors, that.jsonWithReportedErrors) && Objects.equals(fileNameValidation, that.fileNameValidation) && Objects.equals(payerAccountValidation, that.payerAccountValidation) && Objects.equals(creditAccountValidation, that.creditAccountValidation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userReference, ipAddress, date, numberValidatedRecords, totalNumberValidatedRecords, fees, totalDocumentValueWithTaxes, errorRecordCount, successfulRecordCount, totalOperations, jsonWithReportedErrors, fileNameValidation, payerAccountValidation, creditAccountValidation);
    }

    @Override
    public String toString() {
        return "EmployeePayrollSimulationDTO{" + "userReference='" + userReference + '\'' + ", ipAddress='" + ipAddress + '\'' + ", date=" + date + ", numberValidatedRecords='" + numberValidatedRecords + '\'' + ", totalNumberValidatedRecords='" + totalNumberValidatedRecords + '\'' + ", fees=" + fees + ", totalDocumentValueWithTaxes='" + totalDocumentValueWithTaxes + '\'' + ", errorRecordCount='" + errorRecordCount + '\'' + ", successfulRecordCount='" + successfulRecordCount + '\'' + ", totalOperations='" + totalOperations + '\'' + ", jsonWithReportedErrors='" + jsonWithReportedErrors + '\'' + ", fileNameValidation='" + fileNameValidation + '\'' + ", payerAccountValidation='" + payerAccountValidation + '\'' + ", creditAccountValidation='" + creditAccountValidation + '\'' + '}';
    }
}