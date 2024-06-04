package ru.gb.jdk;

public class Employee {

    private String name;

    private Integer experience;

    private Integer id;

    private String phone;


    public Employee(String name, Integer experience, Integer id, String phone) {
        this.name = name;

        if(checkExperience(experience)){
            this.experience = experience;
        }
        if (checkId(id)){
            this.id = id;
        }
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        if (checkExperience(experience)) {
            this.experience = experience;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (checkId(id)) {
            this.id = id;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private boolean checkExperience(Integer experience) {
        if (experience >= 0 && experience < 60) {
            return true;
        }
        System.out.println("неверно ввели данные");
        return false;
    }


    private boolean checkId(Integer id) {
        if ((id > 9999) && (id < 100000)) {
            return true;
        }
        System.out.println("неверно ввели данные");
        return false;
    }


    @Override
    public String toString() {
        return String.format("Работник: " + name + ", таб № " + id + ", стаж: " + experience + ", номер телефона: " + phone);
    }
}

