/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Cities;
import java.util.Arrays;
import java.util.List;
import play.db.jpa.Model;

/**
 *
 * @author dsi
 */
public class City extends Model {

    public int cityId;
    public String cityName;


    public City(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }
    
    public City(){
        
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public String getCityNameById(int id){
        String c = Cities.getCityNameById(id);
        return c;
    }


}
