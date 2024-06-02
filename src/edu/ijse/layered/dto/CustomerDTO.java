/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.dto;

/**
 *
 * @author Thisura
 */
public class CustomerDTO {

    private String CustID;
    private String CustTitle;
    private String CustName;
    private String CustDOB;
    private Double CustSalary;

    private String CustAddress;
    private String CustCity;
    private String CustProvience;
    private String CustZIP;

    public CustomerDTO(String CustID, String CustTitle, String CustName, String CustDOB, Double CustSalary, String CustAddress, String CustCity, String CustProvience, String CustZIP) {
        this.CustID = CustID;
        this.CustTitle = CustTitle;
        this.CustName = CustName;
        this.CustDOB = CustDOB;
        this.CustSalary = CustSalary;
        this.CustAddress = CustAddress;
        this.CustCity = CustCity;
        this.CustProvience = CustProvience;
        this.CustZIP = CustZIP;
    }

    public CustomerDTO() {
    }

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    /**
     * @return the CustTitle
     */
    public String getCustTitle() {
        return CustTitle;
    }

    /**
     * @param CustTitle the CustTitle to set
     */
    public void setCustTitle(String CustTitle) {
        this.CustTitle = CustTitle;
    }

    /**
     * @return the CustName
     */
    public String getCustName() {
        return CustName;
    }

    /**
     * @param CustName the CustName to set
     */
    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    /**
     * @return the CustDOB
     */
    public String getCustDOB() {
        return CustDOB;
    }

    /**
     * @param CustDOB the CustDOB to set
     */
    public void setCustDOB(String CustDOB) {
        this.CustDOB = CustDOB;
    }

    /**
     * @return the CustSalary
     */
    public Double getCustSalary() {
        return CustSalary;
    }

    /**
     * @param CustSalary the CustSalary to set
     */
    public void setCustSalary(Double CustSalary) {
        this.CustSalary = CustSalary;
    }

    /**
     * @return the CustAddress
     */
    public String getCustAddress() {
        return CustAddress;
    }

    /**
     * @param CustAddress the CustAddress to set
     */
    public void setCustAddress(String CustAddress) {
        this.CustAddress = CustAddress;
    }

    /**
     * @return the CustCity
     */
    public String getCustCity() {
        return CustCity;
    }

    /**
     * @param CustCity the CustCity to set
     */
    public void setCustCity(String CustCity) {
        this.CustCity = CustCity;
    }

    /**
     * @return the CustProvience
     */
    public String getCustProvience() {
        return CustProvience;
    }

    /**
     * @param CustProvience the CustProvience to set
     */
    public void setCustProvience(String CustProvience) {
        this.CustProvience = CustProvience;
    }

    /**
     * @return the CustZIP
     */
    public String getCustZIP() {
        return CustZIP;
    }

    /**
     * @param CustZIP the CustZIP to set
     */
    public void setCustZIP(String CustZIP) {
        this.CustZIP = CustZIP;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" + "CustID=" + CustID + ", CustTitle=" + CustTitle + ", CustName=" + CustName + ", CustDOB=" + CustDOB + ", CustSalary=" + CustSalary + ", CustAddress=" + CustAddress + ", CustCity=" + CustCity + ", CustProvience=" + CustProvience + ", CustZIP=" + CustZIP + '}';
    }

}
