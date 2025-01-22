package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd"));
        
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        
        return dayOfWeek.name();
    }
    
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 + val2;        
        
        return result;
    }
    
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMunus(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 - val2;        
        
        return result;
    }
    
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int result = val1 * val2;        
        
        return result;
    }
    
    @GetMapping("/devide/{val1}/{val2}")
    public double calcDivide(@PathVariable int val1, @PathVariable int val2) {
        double result = (double)val1 / val2;        
        
        return result;
    }
}
