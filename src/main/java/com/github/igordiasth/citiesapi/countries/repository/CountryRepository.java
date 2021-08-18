package com.github.igordiasth.citiesapi.countries.repository;

import com.github.igordiasth.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
