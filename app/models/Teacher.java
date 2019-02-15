/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.List;
import javax.persistence.Entity;
import play.data.validation.*;
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
    @Required
    public String firstName;
    @Required
    public String email; 
    @Required
    public int phone; 
    @Required
    public int city;
    public String cityName;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Teacher.counter = counter;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
    
    public Teacher getTeacherByTeacherID(int id){
        Teacher teacher = new Teacher();
        teacher = Teacher.find("byEmployeeNumber", id).first();
        return teacher;
    }
    

}
