package com.bishnu;

import java.util.List;


public class Employee extends Principal
{
    private int empId;
    private String firstName;
    private String lastName;
    private int salary;
    private Bishnu bis;
    private List<RelatesToDTO> relatesToDTOs;
    private DataPrivacyIssueStatus status;
    
    public Employee(int empId, String firstName, String lastName, int salary) {
        super();
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    /**
     * @return the bis
     */
    public Bishnu getBis() {
      return bis;
    }

    /**
     * @param bis the bis to set
     */
    public void setBis(Bishnu bis) {
      this.bis = bis;
    }

    /**
     * @return the relatesToDTOs
     */
    public List<RelatesToDTO> getRelatesToDTOs() {
      return relatesToDTOs;
    }

    /**
     * @param relatesToDTOs the relatesToDTOs to set
     */
    public void setRelatesToDTOs(List<RelatesToDTO> relatesToDTOs) {
      this.relatesToDTOs = relatesToDTOs;
    }

    /**
     * @return the status
     */
    public DataPrivacyIssueStatus getStatus() {
      return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(DataPrivacyIssueStatus status) {
      this.status = status;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", firstName=" + firstName
                + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
}
