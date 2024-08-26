package com.libreria.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "CityID", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "CountryID", nullable = false)
    private Country country;

    @Column(name = "Age", nullable = false)
    private int age;

    @Column(name = "Gender", nullable = false)
    private String gender;

    @Column(name = "Profession", nullable = false)
    private String profession;

    @Column(name = "MembershipCardNumber", nullable = false, unique = true)
    private String membershipCardNumber;

    @Column(name = "AvailableBalance", nullable = false)
    private BigDecimal availableBalance;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMembershipCardNumber() {
        return membershipCardNumber;
    }

    public void setMembershipCardNumber(String membershipCardNumber) {
        this.membershipCardNumber = membershipCardNumber;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }
}
