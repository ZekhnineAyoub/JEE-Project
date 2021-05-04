package com.ayoub.restaurant.Repository;

import com.ayoub.restaurant.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Query(value = "SELECT id FROM restaurant WHERE location =?1",nativeQuery = true)
    List<Long> GetRestaurantByCIty(String city);

}
