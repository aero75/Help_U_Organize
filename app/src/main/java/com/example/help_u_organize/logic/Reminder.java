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

    /**
     * returns hours.
     * @return this.hours the hours unit
     */
    public int getHours() {
        return this.hours;
    }

    /**
     * returns minutes.
     * @return this.mintes the hours unit
     */
    public int getMinutes() {
        return this.minutes;
    }

    /**
     * returns the message.
     * @return this.remind the hours unit
     */
    public String getRemind() {
        return this.remind;
    }

    /**
     * returns if it is noon.
     * @return this.isItNoon the hours unit
     */
    public boolean getIsItNoon() {
        return this.isItNoon;
    }

    /**
     * changes hours.
     * @param hours the hours unit
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * returns hours.
     * @param minutes the hours unit
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * returns hours.
     * @param remind the hours unit
     */
    public void setRemind(String remind) {
        this.remind = remind;
    }

    /**
     * returns hours.
     * @param noon the hours unit
     */
    public void setItNoon(boolean noon) {
        this.isItNoon = noon;
    }

}
