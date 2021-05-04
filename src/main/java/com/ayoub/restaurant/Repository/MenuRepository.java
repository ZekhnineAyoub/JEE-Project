package com.ayoub.restaurant.Repository;

import com.ayoub.restaurant.Model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
