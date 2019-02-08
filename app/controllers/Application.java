package controllers;

import java.io.File;

import java.util.*;

import models.*;
import play.*;
import play.mvc.*;
import play.mvc.results.Result;

public class Application extends Controller {

     
    public static void index() {
        render();
    }
    
    
    public static void search(Long id){
        Teacher teacher = Teacher.findById(id);
        render(teacher);
    }
    
    
    public static void hi(){
        System.out.println("hello world");
    }

}