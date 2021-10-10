package ru.eshmakar.spring.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departmentsList;
    private String carBrand;

    private Map<String, String> carList;


    public Employee() {
        //это будет выпадающий список департаментов
        departmentsList = new LinkedHashMap<>();
        departmentsList.put("Information Technology", "IT");
        departmentsList.put("Human Resources", "HR");
        departmentsList.put("Sales", "Sales");
        carList = new HashMap<>();
        carList.put("BMW", "BMW");
        carList.put("Audi", "Audi");
        carList.put("Mercedes-Benz", "MB");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(Map<String, String> departmentsList) {
        this.departmentsList = departmentsList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarList() {
        return carList;
    }

    public void setCarList(Map<String, String> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
