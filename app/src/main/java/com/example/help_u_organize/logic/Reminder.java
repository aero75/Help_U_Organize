package com.example.help_u_organize.logic;


/**
 * This class describes the reminder Object.
 * Each reminder that the user wishes to create will be created here.
 */


public class Reminder {

    /**Remind message String.*/
    private String remind;

    /**hours value of time.*/
    private int hours;

    /**Minutes value of time.*/
    private int minutes;

    /**If it is in the AM or the PM.*/
    private boolean isItNoon;

    /**
     * Reminder Object. Creates a reminder with a specified thing to remind you about and the time of the message.
     * All input is provided by the uses and it will throw an illegal argument exception based on what the error is.
     * @param remind What needs to be reminded
     * @param hours the hour of the time
     * @param minutes the minutes of the time
     * @param isItNoon if it is AM or PM
     */

    public Reminder(final String remind, final int hours, final int minutes, final boolean isItNoon) {

        this.hours = hours;
        this.remind = remind;
        this.minutes = minutes;
        this.isItNoon = isItNoon;

    }


}
