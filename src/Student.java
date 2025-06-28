public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String department;

    public Student() {
        this.id = 0;
        this.firstName = "John";
        this.lastName = "Doe";
        this.email = "john.doe@genericemail.com";
        this.major = "Math";
        this.department = "Computer Science";
    }

    public Student(int id, String firstName, String lastName, String email, String major, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}
