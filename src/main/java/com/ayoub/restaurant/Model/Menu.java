package com.ayoub.restaurant.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class Menu {

    @Id
    private Long id;
    private String menu_type;
    private String menu_item;
    private Long menu_price;

    public Menu(Long id, String menu_type, String menu_item, Long menu_price) {
        this.id = id;
        this.menu_type = menu_type;
        this.menu_item = menu_item;
        this.menu_price = menu_price;
    }

    public Menu(String menu_type, String menu_item, Long menu_price) {
        this.menu_type = menu_type;
        this.menu_item = menu_item;
        this.menu_price = menu_price;
    }
    public Menu(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenu_type() {
        return menu_type;
    }

    public void setMenu_type(String menu_type) {
        this.menu_type = menu_type;
    }

    public String getMenu_item() {
        return menu_item;
    }

    public void setMenu_item(String menu_item) {
        this.menu_item = menu_item;
    }

    public Long getMenu_price() {
        return menu_price;
    }

    public void setMenu_price(Long menu_price) {
        this.menu_price = menu_price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menu_type='" + menu_type + '\'' +
                ", menu_item='" + menu_item + '\'' +
                ", menu_price=" + menu_price +
                '}';
    }
}
