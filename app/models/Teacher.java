/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.List;
import javax.persistence.Entity;
import play.db.jpa.*;


/**
 *
 * @author Ericka 
 * @date 5/02/2019
 */

@Entity
public class Teacher extends Model{
    
    
    static int counter = 0;
    public int employeeNumber;
    public String firstName;
    public String lastName; 
    public String email; 
    public int phone; 
    public int city;
    public String cityName;
    
    public Teacher(String firstName, String lastName,
            String email, int phoneNumber, int city){
        this.employeeNumber = getIndex();
        this.cityName = getCityName(city);
        this.firstName = firstName;
        this.lastName = lastName; 
        this.email = email; 
        this.phone = phoneNumber;
        this.city = city;
    }
    
    public Teacher(){
        
    }
    
    public int getIndex(){
        counter++; 
        return counter;
    }
    
    public String getCityName(int id){
        City c = new City();
       return c.getCityNameById(id);
    }
    
    public Teacher getLastTeacherById(int id){
        Teacher lastTeacher = Teacher.findById(id);
        return lastTeacher;
    }
    
    public int getCurrentIndex(){
        return counter;
    }
    
    public List findTeachersByNumber(int number){
        return Teacher.find("byEmployeeNumber", number).fetch();
    }
    

}
