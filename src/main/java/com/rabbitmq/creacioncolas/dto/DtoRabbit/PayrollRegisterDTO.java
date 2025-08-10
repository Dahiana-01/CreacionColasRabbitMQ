package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class PayrollRegisterDTO {
    @JsonProperty("OperationType") private String operationType;
    @JsonProperty("FileData") private FileDataDTO fileData;
    @JsonProperty("TransactionReference") private TransactionReferenceDTO transactionReference;
    @JsonProperty("EmployeePayrollSimulation") private EmployeePayrollSimulationDTO employeePayrollSimulation;
    @JsonProperty("EmployeePayrollDispersion") private EmployeePayrollDispersionDTO employeePayrollDispersion;
    @JsonProperty("Paysheet") private PaysheetDTO paysheet;
    @JsonProperty("Status") private String status;

    public PayrollRegisterDTO() {}

    public PayrollRegisterDTO(String operationType, FileDataDTO fileData, TransactionReferenceDTO transactionReference, EmployeePayrollSimulationDTO employeePayrollSimulation, EmployeePayrollDispersionDTO employeePayrollDispersion, PaysheetDTO paysheet, String status) {
        this.operationType = operationType;
        this.fileData = fileData;
        this.transactionReference = transactionReference;
        this.employeePayrollSimulation = employeePayrollSimulation;
        this.employeePayrollDispersion = employeePayrollDispersion;
        this.paysheet = paysheet;
        this.status = status;
    }

    // Getters y Setters
    public String getOperationType() { return operationType; }
    public void setOperationType(String operationType) { this.operationType = operationType; }
    public FileDataDTO getFileData() { return fileData; }
    public void setFileData(FileDataDTO fileData) { this.fileData = fileData; }
    public TransactionReferenceDTO getTransactionReference() { return transactionReference; }
    public void setTransactionReference(TransactionReferenceDTO transactionReference) { this.transactionReference = transactionReference; }
    public EmployeePayrollSimulationDTO getEmployeePayrollSimulation() { return employeePayrollSimulation; }
    public void setEmployeePayrollSimulation(EmployeePayrollSimulationDTO employeePayrollSimulation) { this.employeePayrollSimulation = employeePayrollSimulation; }
    public EmployeePayrollDispersionDTO getEmployeePayrollDispersion() { return employeePayrollDispersion; }
    public void setEmployeePayrollDispersion(EmployeePayrollDispersionDTO employeePayrollDispersion) { this.employeePayrollDispersion = employeePayrollDispersion; }
    public PaysheetDTO getPaysheet() { return paysheet; }
    public void setPaysheet(PaysheetDTO paysheet) { this.paysheet = paysheet; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayrollRegisterDTO that = (PayrollRegisterDTO) o;
        return Objects.equals(operationType, that.operationType) && Objects.equals(fileData, that.fileData) && Objects.equals(transactionReference, that.transactionReference) && Objects.equals(employeePayrollSimulation, that.employeePayrollSimulation) && Objects.equals(employeePayrollDispersion, that.employeePayrollDispersion) && Objects.equals(paysheet, that.paysheet) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType, fileData, transactionReference, employeePayrollSimulation, employeePayrollDispersion, paysheet, status);
    }

    @Override
    public String toString() {
        return "PayrollRegisterDTO{" +
                "operationType='" + operationType + '\'' +
                ", fileData=" + fileData +
                ", transactionReference=" + transactionReference +
                ", employeePayrollSimulation=" + employeePayrollSimulation +
                ", employeePayrollDispersion=" + employeePayrollDispersion +
                ", paysheet=" + paysheet +
                ", status='" + status + '\'' +
                '}';
    }
}