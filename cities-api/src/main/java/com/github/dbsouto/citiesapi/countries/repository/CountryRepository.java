package com.github.dbsouto.citiesapi.countries.repository;

import com.github.dbsouto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
