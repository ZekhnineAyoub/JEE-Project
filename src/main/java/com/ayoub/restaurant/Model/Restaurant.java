package com.ayoub.restaurant.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;
    private String phone_number;
    private Specialty specialty;
    private Ratings ratings;

    @OneToOne(targetEntity = Menu.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "menu",referencedColumnName = "id")
    private Menu menu;

    public Restaurant(){

    }

    public Restaurant(String name, String location, String phone_number, Specialty specialty, Ratings ratings, Menu menu) {
        this.name = name;
        this.location = location;
        this.phone_number = phone_number;
        this.specialty = specialty;
        this.ratings = ratings;
        this.menu = menu;
    }

    public Restaurant(Long id, String name, String location, String phone_number, Specialty specialty, Ratings ratings, Menu menu) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone_number = phone_number;
        this.specialty = specialty;
        this.ratings = ratings;
        this.menu = menu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", specialty=" + specialty +
                ", ratings=" + ratings +
                ", menu=" + menu +
                '}';
    }


}
