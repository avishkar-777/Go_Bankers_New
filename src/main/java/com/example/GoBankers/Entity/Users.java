package com.example.GoBankers.Entity;

import javax.persistence.*;

@Entity
@Table(name ="t_register_user", schema="go_bankers")

public class Users {

    @Id
    @Column(name="user_id", length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name="first_name", length = 100)
    private String firstName;

    @Column(name="middle_name", length = 100)
    private String middleName;

    @Column(name="last_name", length = 100)
    private String lastName;

    @Column(name="mobile_no", length = 15)
    private String mobileNo;

    @Column(name="email", length = 100)
    private String email;

    @Column(name="password", length = 20)
    private String password;


    public Users(int userId, String firstName, String middleName, String lastName, String mobileNo, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
    }

    public Users(String firstName, String middleName, String lastName, String mobileNo, String email, String password) {
//        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
    }


    public Users() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
