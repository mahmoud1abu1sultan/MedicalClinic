/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lodingwindowe;

/**
 *
 * @author MAHMOUD.T
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private int age;

    public User(String firstName, String lastName, String email, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }//END;

    public User(String firstName, String lastName, String email, String password, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }//END;

    public User(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }//END;

    public User(String email) {
        this.email = email;
    }//END;

    public String getFirstName() {
        return firstName;
    }//END;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//END;

    public String getLastName() {
        return lastName;
    }//END;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//END;

    public String getEmail() {
        return email;
    }//END;

    public void setEmail(String email) {
        this.email = email;
    }//END;

    public String getPassword() {
        return password;
    }//END;

    public void setPassword(String password) {
        this.password = password;
    }//END;

    public String getGender() {
        return gender;
    }//END;

    public void setGender(String gender) {
        this.gender = gender;
    }//END;

    public int getAge() {
        return age;
    }//END;

    public void setAge(int age) {
        this.age = age;
    }//END;

}//END class;
