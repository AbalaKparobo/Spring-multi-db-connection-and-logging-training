package com.logging.practice;

import com.logging.practice.dal.contract.PersonDal;
import com.logging.practice.model.Person;
import com.logging.practice.model.RateCard;
import com.logging.practice.model.TaxiRide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TaxiFareController {

    @Autowired
    PersonDal personDal;

    @GetMapping("/taxifare")
    public RateCard getTaxiFare() {
        return new RateCard("500", "Henry");
    }

    @PostMapping("/taxifare/calculate")
    public String calculateFare(@RequestBody @Valid TaxiRide taxiRide) {
        // calculate Fare
        return "Calculating fare...";
    }

    @PostMapping(value = "/person", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Person addPerson(@RequestBody Person person) {
        if (!ObjectUtils.isEmpty(person)) {
            return personDal.savePerson(person);
        }
        throw new IllegalArgumentException("Cannot save an empty person object");
    }
}
