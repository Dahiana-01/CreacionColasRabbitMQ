package com.rabbitmq.creacioncolas.dto.DtoRabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FileDataDTO {
    @JsonProperty("Identification") private String identification;
    @JsonProperty("FileName") private String fileName;
    @JsonProperty("StatusFile") private StatusFileDTO statusFile;
    @JsonProperty("Size") private String size;
    @JsonProperty("TotalTaxes") private String totalTaxes;

    public FileDataDTO() {}

    public FileDataDTO(String identification, String fileName, StatusFileDTO statusFile, String size, String totalTaxes) {
        this.identification = identification;
        this.fileName = fileName;
        this.statusFile = statusFile;
        this.size = size;
        this.totalTaxes = totalTaxes;
    }

    public String getIdentification() { return identification; }
    public void setIdentification(String identification) { this.identification = identification; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public StatusFileDTO getStatusFile() { return statusFile; }
    public void setStatusFile(StatusFileDTO statusFile) { this.statusFile = statusFile; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public String getTotalTaxes() { return totalTaxes; }
    public void setTotalTaxes(String totalTaxes) { this.totalTaxes = totalTaxes; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileDataDTO that = (FileDataDTO) o;
        return Objects.equals(identification, that.identification) && Objects.equals(fileName, that.fileName) && Objects.equals(statusFile, that.statusFile) && Objects.equals(size, that.size) && Objects.equals(totalTaxes, that.totalTaxes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, fileName, statusFile, size, totalTaxes);
    }

    @Override
    public String toString() {
        return "FileDataDTO{" + "identification='" + identification + '\'' + ", fileName='" + fileName + '\'' + ", statusFile=" + statusFile + ", size='" + size + '\'' + ", totalTaxes='" + totalTaxes + '\'' + '}';
    }
}