package com.ayoub.restaurant.Controller;


import com.ayoub.restaurant.Model.Restaurant;
import com.ayoub.restaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "Restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;
    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @GetMapping("get/{id}")
    public Optional<Restaurant> GetRestaurantByID(@PathVariable Long id){

        return restaurantService.GetRestaurantById(id);
    }

    @GetMapping("/getAll")
    public List<Restaurant> GetAllRestaurant(){

        return restaurantService.GetAllRestaurant();
    }

    @PostMapping("/Add")
    public void NewRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.AddNewRestaurant(restaurant);
    }

    @DeleteMapping("delete/{id}")
    public void DeleteRestaurantById(@PathVariable Long id){

        restaurantService.DeletRestaurantById(id);
    }

    @GetMapping("/getAll/proximity")
    public List<Restaurant> GetAllRestaurantProximity(){
        return restaurantService.GetAllRestaurantProximity();
    }

}
