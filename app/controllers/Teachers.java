/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import static controllers.Application.index;
import models.Input;
import models.Teacher;
import play.mvc.Controller;

/**
 *
 * @author dsi
 */
public class Teachers extends Controller{
    public static void register(){
        render();
    }
    
    public static void createTeacher(Teacher teacher){
        teacher.employeeNumber = teacher.getIndex();
        teacher.save();
        System.out.println("----------------saved----------------");
        System.out.println("teacher name saved: "+teacher.firstName);
        System.out.println("teacher last name saved: "+teacher.lastName);
        System.out.println("teacher email: "+teacher.email);
        System.out.println("teacher id: "+teacher.employeeNumber);
        register();
    }
    
    public static int getCurrentIndex(){
        Teacher teacher = new Teacher();
        return teacher.getCurrentIndex();
    }
    
    public static void determineSearch(Input input){
        if(isInteger(input.content)){
            System.out.println("it worked!");
            
            //searchById(Integer.parseInt(s));
        }else{
            //searchByName(s);
        }
    }
    
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }catch(NullPointerException e){
            return false;
        }
        return true;
    }

    private static void searchById(int parseInt) {
    }

    private static void searchByName(String s) {
    }
}
