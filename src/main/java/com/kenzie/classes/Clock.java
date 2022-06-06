package com.kenzie.classes;

public class Clock {
    //properties
    private int hour;
    private int minute;
    private String period;
    private String timeZone;

    //constructor no arguments defaults 12:00 AM to Eastern time zone
    public Clock(){
        this.hour = 12;
        this.minute = 0;
        this.timeZone = "Eastern";
        this.period = "AM";
    }
    public Clock(int hour, int minute, String period, String timeZone) {
        //hour should be 1-12
        if (hour > 0 && hour <= 12) {
            this.hour = hour;
        } else { this.hour = 12;}
        //minute should be between 0-59
        if (minute >=0 && minute <= 59) {
            this.minute = minute;
        } else { this.minute = 00;}
        //period is AM or PM
        if (period.equals("AM") || period.equals("PM")) {
            this.period = period;
        } else { this.period = "AM";}
        //timezone is eastern, central, mountain, pacific
        if (timeZone.equals("Eastern") || timeZone.equals("Central") || timeZone.equals("Mountain") || timeZone.equals("Pacific")) {
            this.timeZone = timeZone;
        } else { this.timeZone = "Eastern";}
    }
        //public getter/setter methods for each property
        public int getHour(){
            return this.hour;
        }
        public int getMinute() {
            return this.minute;
        }
        public String getPeriod() {
            return this.period;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        //same checks for setter methods if value does not fit criteria return false else return true
    public boolean setHour(int hour) {
        if (hour > 0 && hour <= 12) {
            this.hour = hour;
            return true;
        } else {
            return false;
        }
    }
    public boolean setMinute(int minute) {
        if (minute >=0 && minute <= 59) {
            this.minute = minute;
            return true;
        } else {
            return false;
        }
    }
    public boolean setPeriod(String period) {
            if (period.equals("PM") || period.equals("AM") ) {
                this.period = period;
                return true;
            }
            else{
                return false;
            }
        }
        public boolean setTimeZone(String timeZone) {
            if (timeZone.equals("Eastern") || timeZone.equals("Central") || timeZone.equals("Mountain") || timeZone.equals("Pacific")) {
                this.timeZone = timeZone;
                return true;
            }
            else{
                return false;
            }


}






}
