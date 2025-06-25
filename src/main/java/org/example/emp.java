package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class emp {
    @Id
    private int empID;
    private String empName;
    private int manger_id;
    private  int salary;

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "emp{" +
                "empName='" + empName + '\'' +
                '}';
    }

    public int getManger_id() {
        return manger_id;
    }

    public void setManger_id(int manger_id) {
        this.manger_id = manger_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
