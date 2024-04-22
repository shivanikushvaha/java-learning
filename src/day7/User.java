package day7;

public class User {
    private Integer id;
    private String name;
    private String username;
    private String dob;

    public User() {
    }

    public User(Integer id, String name, String username, String dob) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.dob = dob;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }

    public String test(){
        return """
                kjfsd
                klsjdfklsd
                lkjfklsd
                """;
    }

}
