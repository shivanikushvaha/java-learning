package week3.day20;

public class Student {
    private String name;
    private Integer age;
    private String address;
    private String pinCode;

    public Student(String name){
        this.name = name;
    }

    private Student(String name, Integer age){
        this(name, age, "Vadodara", "390019");
    }

    private Student(String name, Integer age, String address, String pinCode){
        this.name = name;
        this.age = age;
        this.address = address;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPinCode() {
        return pinCode;
    }
}
