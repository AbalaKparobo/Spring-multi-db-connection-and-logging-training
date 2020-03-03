package com.logging.practice.dal;

import com.logging.practice.dal.contract.PersonDal;
import com.logging.practice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by kparobo.abala 02/03/2020
 **/

@Repository
public class PersonDalImpl implements PersonDal {

    @Autowired
    @Qualifier("secondaryMongoTemplate") MongoTemplate mongoTemplate;

//    public PersonDalImpl(MongoTemplate mongoTemplate) {
//        this
//    }

    public Person savePerson(Person person) {
        Person person1 = new Person();
        mongoTemplate.save(person);
        return person;
    }
}
