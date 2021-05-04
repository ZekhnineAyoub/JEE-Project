package com.ayoub.restaurant.Service;

import com.ayoub.restaurant.Config.JsonFile;
import com.ayoub.restaurant.Model.Restaurant;
import com.ayoub.restaurant.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService{
    private List<Restaurant> DbRestaurant = new ArrayList<Restaurant>();
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void AddNewRestaurant(Restaurant restaurant) {

        restaurantRepository.save(restaurant);
    }

    public List<Restaurant> GetAllRestaurant() {

        return  restaurantRepository.findAll();
    }

    public Optional<Restaurant> GetRestaurantById(Long id) {

        return restaurantRepository.findById(id);
    }

    public void DeletRestaurantById(Long id) {

        restaurantRepository.deleteById(id);
    }

    public List<Restaurant> GetAllRestaurantProximity() {

        final String RessourceUrl;
        RessourceUrl = "http://api.ipstack.com/93.24.218.10?access_key=66306cdf2855543e1bbce69f7cb4837e";
        RestTemplate restTemplate = new RestTemplate();
        JsonFile jsonFile = restTemplate.getForObject(RessourceUrl,JsonFile.class);
        List<Long> ListRestaurantCityProximityByID =restaurantRepository.GetRestaurantByCIty(jsonFile.getCity());
        List<Restaurant> ListRestaurantCityProximity = restaurantRepository.findAllById(ListRestaurantCityProximityByID);
        return ListRestaurantCityProximity;
    }

}
