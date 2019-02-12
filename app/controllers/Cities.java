/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.City;
import play.mvc.Controller;


/**
 *
 * @author dsi
 */
public class Cities extends Controller{

    static List<City> cities = Arrays.asList(
            new City(1, "Chihuahua"),
            new City(2, "Guadalajara"),
            new City(3, "Sonora"),
            new City(4, "Mexicalli")
    );
    
    
    public static String getCityNameById(int id) {
        String name = "";
        for (City city : cities) {
            if (city.cityId == id) {
                name = city.cityName;
            }
        }
        return name;
    }

}
