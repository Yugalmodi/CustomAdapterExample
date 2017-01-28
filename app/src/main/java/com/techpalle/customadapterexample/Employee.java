package com.techpalle.customadapterexample;

/**
 * Created by DELL on 12/7/2016.
 */
public class Employee {
    private String eno, ename, esalary;

    public Employee() {

    }
    public Employee( String eno, String ename, String esalary) {
        this.eno = eno;
        this.ename = ename;
        this.esalary = esalary;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsalary() {
        return esalary;
    }

    public void setEsalary(String esalary) {
        this.esalary = esalary;
    }

}
