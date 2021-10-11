package ru.eshmakar.spring.mvc;

import ru.eshmakar.spring.mvc.validator.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "The name must be min 2 symbols")//минимальная длина имени, иначе выводится это сообщение
    private String name;

//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private int salary;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "must be in a format XXX-XX-XX")
    private String phoneNumber;

    @CheckEmail(value = "gmail.com", message = "must be ends with gmail.com")//наша собственная аннотация
    private String email;
    private String department;
    private Map<String, String> departmentsList;
    private String carBrand;

    private Map<String, String> carList;
    private String[] languages;
    private Map<String, String> languagesList;


    public Employee() {
        departmentsList = new LinkedHashMap<>();
        departmentsList.put("Information Technology", "IT");
        departmentsList.put("Human Resources", "HR");
        departmentsList.put("Sales", "Sales");

        carList = new HashMap<>();
        carList.put("BMW", "BMW");
        carList.put("Audi", "Audi");
        carList.put("Mercedes-Benz", "MB");

        languagesList = new HashMap<>();
        languagesList.put("English", "EN");
        languagesList.put("Arabic", "AR");
        languagesList.put("Deuthc", "FR");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
