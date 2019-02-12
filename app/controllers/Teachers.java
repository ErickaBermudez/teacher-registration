/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.Application.index;
import models.Search;
import models.Teacher;
import play.mvc.Controller;

/**
 *
 * @author dsi
 */
public class Teachers extends Controller {

    public static void register() {
        render();
    }

    public static void createTeacher(Teacher teacher) {
        teacher.employeeNumber = teacher.getIndex();
        teacher.cityName = teacher.getCityName(teacher.city);
        validation.required(teacher.email);
        validation.required(teacher.firstName);
        validation.required(teacher.lastName);
        validation.required(teacher.phone);
        validation.required(teacher.city);
        if (validation.hasErrors()) {
            for (play.data.validation.Error error : validation.errors()) {
                params.flash(); // add http parameters to the flash scope
                validation.keep(); // keep the errors for the next request
                register();
            }
        } else {
            teacher.save();
            System.out.println("----------------saved----------------");
            System.out.println("teacher name saved: " + teacher.firstName);
            System.out.println("teacher last name saved: " + teacher.lastName);
            System.out.println("teacher email: " + teacher.email);
            System.out.println("teacher id: " + teacher.employeeNumber);
            System.out.println("teacher phone: " + teacher.phone);
            System.out.println("teacher city id: " + teacher.city);
            System.out.println("teacher city name: " + teacher.cityName);
            flash.success("Teacher %s added succefully!", teacher.firstName);
            register();
        }

    }

    public static int getCurrentIndex() {
        Teacher teacher = new Teacher();
        return teacher.getCurrentIndex();
    }

    private static void searchById(int parseInt) {
    }

    private static void searchByName(String s) {
    }
}
