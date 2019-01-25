package com.gmail.spbisoft.futuresapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Futures {

    @Id
    private String id;
    private String contractGroup;
    private String contractName;
    private String contractSymbol;
    private String margin;
    private String maintenance;

    public Futures() {
    }

    public Futures(String id, String contractGroup, String contractName, String contractSymbol, String margin, String maintenance) {
        this.id = id;
        this.contractGroup = contractGroup;
        this.contractName = contractName;
        this.contractSymbol = contractSymbol;
        this.margin = margin;
        this.maintenance = maintenance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractGroup() {
        return contractGroup;
    }

    public void setContractGroup(String contractGroup) {
        this.contractGroup = contractGroup;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractSymbol() {
        return contractSymbol;
    }

    public void setContractSymbol(String contractSymbol) {
        this.contractSymbol = contractSymbol;
    }

    public String getMargin() {
        return margin;
    }

    public void setMargin(String margin) {
        this.margin = margin;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }
}
