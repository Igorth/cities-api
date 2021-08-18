package com.github.igordiasth.citiesapi;


import com.github.igordiasth.citiesapi.countries.Country;
import com.github.igordiasth.citiesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    // Ao inves de usar Autowired, pode criar um construtor
//    public CountryResource(CountryRepository repository) {
//        this.repository = repository;
//    }


    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }
}
