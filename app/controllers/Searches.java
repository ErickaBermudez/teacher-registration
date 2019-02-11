/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Search;
import models.Teacher;
import play.mvc.Controller;

/**
 *
 * @author dsi
 */
public class Searches extends Controller {
    
    public static void search(){
        render();
    }

    public static void determineSearch(Search input) {
        if (isInteger(input.content)) {
            System.out.println("it worked!");

            //searchById(Integer.parseInt(s));
        } else {
            //searchByName(s);
        }
        search();
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
    
    public static void listInfo(Search input){
        int number = 0; 
        if(isInteger(input.content)){
            number = Integer.valueOf(input.content);
            List<Teacher> teachers = new Teacher().findTeachersByNumber(number);
            render(number, teachers);
        }else{
            error();
        }
    }
    
    public static void error(){
        render();
    }
}
