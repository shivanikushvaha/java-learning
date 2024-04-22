package day6;

import java.util.List;

public class Teacher {
    private Integer id;
    private String name;
    private List<Department> departmentList;
    private List<String> subject;

    public Teacher() {
    }

    public Teacher(Integer id, String name, List<Department> departmentList, List<String> subject) {
        this.id = id;
        this.name = name;
        this.departmentList = departmentList;
        this.subject = subject;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public List<String> getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentList=" + departmentList +
                ", subject=" + subject +
                '}';
    }
}
