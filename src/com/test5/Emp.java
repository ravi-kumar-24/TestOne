package com.test5;

import java.io.Serializable;
import java.util.Objects;

public final class Emp implements Comparable<Emp>, Serializable {

    private Long seriabaleVersionId = 123243243232L;
    private final int empId;
    private final String name;
    private final Integer salary;

    public Emp(int id, String name, Integer salary){
        this.empId = id;
        this.name = name;
        this.salary = salary;

    }
    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empId == emp.empId &&
                Objects.equals(name, emp.name);
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }

    @Override
    public int compareTo(Emp o) {
        int salaryDiff  = this.salary.compareTo(o.getSalary());

        if(salaryDiff==0){
             return this.name.compareTo(o.getName());
        }
        return salaryDiff;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
