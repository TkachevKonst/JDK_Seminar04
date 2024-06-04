package ru.gb.jdk;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */
public class Program {


    public static void main(String[] args) {


        Employee employee1 = new Employee("Иван", 10, 50010, "89081235489");
        Employee employee2 = new Employee("Петр", 2, 50852, "89088965234");
        Employee employee3 = new Employee("Анастасия", 25, 50357, "89138569421");
        Employee employee4 = new Employee("Александр", 5, 59652, "89518965230");
        Employee employee5 = new Employee("Мария", 5, 58545, "89084789632");


        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);
        employeeDirectory.addEmployee(employee4);
        employeeDirectory.addEmployee(employee5);

        employeeDirectory.printEmployeeDirectory();

        employeeDirectory.addNewEmployee("Василий", 30, 50854, "89081478952");

        employeeDirectory.printEmployeeDirectory();

        System.out.println(employeeDirectory.searchIdEmployee(50852));
        System.out.println(employeeDirectory.searchIdEmployee(50850));
        System.out.println("--------------------");
        System.out.println(employeeDirectory.searchExperienceEmployee(5));
        System.out.println(employeeDirectory.searchExperienceEmployee(6));
        System.out.println("--------------------");
        System.out.println(employeeDirectory.searchPhoneEmployee("89081478952"));
        System.out.println(employeeDirectory.searchPhoneEmployee("89081478741"));
    }
}
