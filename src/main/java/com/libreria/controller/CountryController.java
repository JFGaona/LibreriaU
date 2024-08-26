package com.libreria.controller;

import com.libreria.model.Country;
import com.libreria.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable int id) {
        return countryService.getCountryById(id);
    }

    @PostMapping
    public Country createCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable int id) {
        countryService.deleteCountry(id);
    }
}
