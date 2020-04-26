package com.example.help_u_organize.logic;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;


/**
 * This class creates a list of reminder Objects for  the  UI to display.
 * The UI only displays the lsit from this class.
 * When a new Reminder is created, the UI transfers the data to this list and the list handles it.
 * The UI the updates its list.
 */
public class ReminderList {

    /**List of reminder*/
    private ArrayList<Reminder> reminders;

    /**
     * Reminder list. Essentially holds all reminders.
     */
    public ReminderList() {

        reminders = new ArrayList<>();

    }

    /**
     * returns list of reminders.
     */
    public List<Reminder> getReminders() {
        return reminders;
    }

    /**
     * adds a reminder object to the list based on the  time.
     * @param newReminder the new reminder that needs to be added
     */
    public void addReminder(Reminder newReminder) {

        for (int i  = 0; i < reminders.size() - 1; i++) {
            if (newReminder.isLater(reminders.get(i))
                && !newReminder.isLater(reminders.get(i + 1))) {
                reminders.add(i + 1, newReminder);
                return;
            }
        }

    }

}
