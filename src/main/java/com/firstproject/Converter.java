
package com.firstproject;

import org.joda.time.LocalTime;

/**
 *
 * @author Piyawut Chiradejnunt
 */
public class Converter {
    
    private int hours;
    private int minutes;

    public Converter(LocalTime localtime){
        
        hours = localtime.getValue(0);
        minutes = localtime.getValue(1);
        
    }
    public int convertTimeToAngle() {     
        
        int angle1 = getHours() * 30;
        System.out.println("Short hand angle: " + angle1);
        
        int angle2 = (getMinutes() % 60) * 6;
        System.out.println("Long hand angle: " + angle2);

        return Math.abs(angle1 - angle2);
    }

    /**
     * @return the hours
     */
    public int getHours() {
        // convert the format for calculating
        return hours >= 12 ? hours-12 : 0 ;
    }

    /**ß
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }
}
