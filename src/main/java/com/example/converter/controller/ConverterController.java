package com.example.converter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
@RequestMapping("/converter")
public class ConverterController {

    @GetMapping("/convertKtoC/{in}")
    public String convertKtoC(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = Double.parseDouble(in.replace(",", ".")) - 273.15D;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }
    @GetMapping("/convertKtoF/{in}")
    public String convertKtoF(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = (Double.parseDouble(in.replace(",", ".")) - 273.15D) * 9 / 5 + 32;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }
    @GetMapping("/convertFtoC/{in}")
    public String convertFtoC(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = (Double.parseDouble(in.replace(",", "."))  - 32) * 5 / 9;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }
    @GetMapping("/convertFtoK/{in}")
    public String convertFtoK(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = (Double.parseDouble(in.replace(",", ".")) - 32) * 5 / 9 + 273.15D;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }
    @GetMapping("/convertCtoK/{in}")
    public String convertCtoK(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = Double.parseDouble(in.replace(",", ".")) + 273.15D;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }

    @GetMapping("/convertCtoF/{in}")
    public String convertCtoF(@PathVariable(name = "in") String in
    ) throws IOException {
        try {
            double newX = Double.parseDouble(in.replace(",", ".")) * 9 / 5 + 32;
            return ""+newX;
        }catch (NumberFormatException e){
            return "пожалуйста, напишите число правильно";
        }
    }

}
