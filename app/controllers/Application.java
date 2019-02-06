package controllers;

import java.io.File;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

     
    public static void index() {
        render();
    }
    
    public static void createTeacher(String firstName, String lastName, String email) throws InterruptedException{
        Teacher teacher = new Teacher(firstName, lastName, email);
        teacher.save();
        System.out.println("----------------saved----------------");
        System.out.println("teacher name saved: "+teacher.firstName);
        System.out.println("teacher last name saved: "+teacher.lastName);
        System.out.println("teacher email: "+teacher.email);
        System.out.println("teacher id: "+teacher.employeeNumber);
        index();
    }
    
    public static int getCurrentIndex(){
        Teacher teacher = new Teacher();
        return teacher.getCurrentIndex();
    }
    
    public static void hi(){
        System.out.println("hello world");
    }

}