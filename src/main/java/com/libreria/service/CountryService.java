package com.libreria.service;

import com.libreria.model.Country;
import com.libreria.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(int id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}
