package com.logging.practice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static java.util.Calendar.*;

/**
 * Created by kparobo.abala 02/03/2020
 **/

@Document(collection = "person")
public class Person {

    @Id
    private String id;
//    @Indexed
    private String name;
//    @Indexed
    private long age;
//    @Indexed
    private List<String> favoriteBooks;
//    @Indexed
    private Date dateOfBirth;
    public Person() {
    }

    public Person(String name, List<String> childrenName, Date dateOfBirth) {
        this.name = name;
        this.favoriteBooks = childrenName;
        this.dateOfBirth = dateOfBirth;
        this.age = getDiffYears(dateOfBirth, new Date());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public List<String> getFavoriteBooks() {
        return favoriteBooks;
    }

    public void setFavoriteBooks(List<String> favoriteBooks) {
        this.favoriteBooks = favoriteBooks;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // standard getters and setters
    private int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }
    private Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.UK);
        cal.setTime(date);
        return cal;
    }

    @Override
    public String toString() {
        return String.format("Person{personId='%s', name='%s', age=%d, dateOfBirth=%s}\n",
                id, name, age, dateOfBirth);
    }

}
