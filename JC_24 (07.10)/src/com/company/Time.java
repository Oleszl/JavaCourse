package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    int min =0;
    int hour=0;


    public String check(){
        if (hour>=24){
            hour-=24;
        }
        if (min>60){
            min-=60;
            hour++;
        }
        return "time: " +(hour<10?"0"+hour:hour)  + ":" + (min<10?"0"+min:min);
    }

    @Override
    public String toString() {
        return check();
    }
}
