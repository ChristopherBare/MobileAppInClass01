/*
In Class Assinment 1
MainPart1.java
Christopher Bare
800789199
 */

public class User {
    String first;
    String last;
    int age;
    String email;
    String gender;
    String city;
    String state;

    public User() {

    }

    public User(String first, String last, int age, String gender, String city, String state) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.state = state;
    }

    public String getFirst() {
        return first;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}
