package ru.gb.jdk;

import java.util.ArrayList;

public class EmployeeDirectory {

    ArrayList<Employee> employees = new ArrayList<>();

    public void printEmployeeDirectory (){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addNewEmployee(String name, Integer experience, Integer id, String phone) {
        employees.add(new Employee(name, experience, id, phone));
    }


    public Employee searchIdEmployee(Integer id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return employees.get(i);
            }
        }
        return null;
    }


    public ArrayList<Employee> searchExperienceEmployee(Integer experience) {
        ArrayList<Employee> employees1 = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getExperience().equals(experience)) {
                employees1.add(employees.get(i));
            }
        }
        return employees1;
    }

    public Employee searchPhoneEmployee(String phone) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getPhone().equals(phone)) {
                return employees.get(i);
            }
        }
        return null;
    }

}
