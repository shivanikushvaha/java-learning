package week1.day7;

public class Teacher {
    private String name;
    private String department;
    private static Teacher teacher = null;

    private Teacher() {

    }

    private Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public static Teacher getInstance() {
        if (teacher == null) {
            return teacher = new Teacher();
        }
        return teacher;
    }

}
