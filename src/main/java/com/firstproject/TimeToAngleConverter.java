
package com.firstproject;

import org.joda.time.LocalTime;

/**
 *
 * @author Piyawut Chiradejnunt
 */
public class TimeToAngleConverter {
    
    private static LocalTime currentTime = new LocalTime();
    
    public static void main(String args[]){

        Converter converter = new Converter(currentTime);
        
        System.out.println("The current local time is: " + currentTime);
        
        int result = converter.convertTimeToAngle();
        System.out.println("result: " + result);
    } 
}
