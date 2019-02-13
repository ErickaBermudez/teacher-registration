/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.Application.*;
import models.Teacher;
import play.data.validation.*;
import play.mvc.Controller;

/**
 *
 * @author dsi
 */
public class Teachers extends Controller {
    public static void register(){
        render();
    }

    public static void createTeacher(String firstName,
            String email,
            int phone,
            int city) {
        validation.required(firstName);
        validation.required(email);
        validation.required(phone);
        validation.required(city);
        if (validation.hasErrors()) {
            for (play.data.validation.Error error : validation.errors()) {
                System.out.println(error.message());
            }
            params.flash();
            validation.keep();
            register();
        }

        if (!validation.hasErrors()) {
            Teacher teacher = new Teacher();
            teacher.setFirstName(firstName);
            teacher.setEmail(email);
            teacher.setPhone(phone);
            teacher.setCity(city);
            teacher.setCityName(teacher.getCityName(teacher.city));
            teacher.setEmployeeNumber(teacher.getIndex());
            teacher.save();
            System.out.println("----------------saved----------------");
            System.out.println("teacher name saved: " + teacher.firstName);
            System.out.println("teacher email: " + teacher.email);
            System.out.println("teacher id: " + teacher.employeeNumber);
            System.out.println("teacher phone: " + teacher.phone);
            System.out.println("teacher city id: " + teacher.city);
            System.out.println("teacher city name: " + teacher.cityName);
            flash.success("Teacher %s added succefully!", teacher.firstName);
            register();
        }

    }
}
