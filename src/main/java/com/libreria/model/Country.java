package com.libreria.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryID;

    @Column(name = "CountryName", nullable = false, unique = true)
    private String countryName;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private Set<City> cities;

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}
