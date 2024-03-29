package com.example.GoBankers.DTO;

public class UserDTO {

    private int userId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String mobileNo;

    private String email;

    private String password;

    private String userName;

    public UserDTO(int userId, String firstName, String middleName, String lastName, String mobileNo, String email, String password, String userName) {
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

    public UserDTO(int userId, String firstName, String middleName, String lastName, String mobileNo, String email, String userName) {
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.userName = userName;
    }

    public UserDTO() {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

}
