package week1.day6;

public class Department {
    private Integer id;
    private String name;

    public Department() {
    }
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name;
    }
}
