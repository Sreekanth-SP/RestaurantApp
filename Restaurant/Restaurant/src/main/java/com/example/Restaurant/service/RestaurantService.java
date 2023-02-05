package com.example.Restaurant.service;

import com.example.Restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants=new ArrayList<>();
    private static int restaurantCount=0;

    static {
        restaurants.add(new Restaurant(++restaurantCount,"KeralaHouse Restaurant","22 Jew Street,Kochi,Kerala",907409112,"Greek"));
        restaurants.add(new Restaurant(++restaurantCount,"Uduppi Restaurant","2nd Street Ernakulam,Kerala",805409112,"Vegetarian"));
        restaurants.add(new Restaurant(++restaurantCount,"Kaadarkkas","Mattachery,Kochi,Kerala",999457890,"Arabian"));
        restaurants.add(new Restaurant(++restaurantCount,"Kerala house, kozhikode","Mehaboob Road, Kozhikode,Kerala",907409112,"Sweets"));
    }

    public List<Restaurant> findAll(){
        return restaurants;
    }

    public Restaurant findRestaurantByName(String name){
        Predicate<? super Restaurant> predicate= restaurant -> restaurant.getName()==name;
        Restaurant restaurant=restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void deleteRestaurant(String name){
        Predicate<? super Restaurant> predicate= restaurant -> restaurant.getName()==name;
        restaurants.removeIf(predicate);
    }

    public void updateRestaurant(String name,Restaurant newrestaurant){
        Restaurant restaurant=findRestaurantByName(name);
        restaurant.setId(newrestaurant.getId());
        restaurant.setAddress(restaurant.getAddress());
        restaurant.setName(restaurant.getName());
        restaurant.setNumber(restaurant.getNumber());
        restaurant.setSpeciality(restaurant.getSpeciality());
    }
}