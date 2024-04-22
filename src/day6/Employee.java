package day6;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Float salary;
    private List<String> skills;

    public Employee() {
    }

    public Employee(Integer id, String name, Float salary, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skills = skills;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills =skills;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String toString() {
        return "Employee = " + id + " "
                + name + " "
                +  salary + " "
                + skills;
    }

}
