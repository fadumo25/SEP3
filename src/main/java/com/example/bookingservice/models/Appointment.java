package com.example.bookingservice.models;

public class Appointment {
    private int id;
    private int userId; // ID of patient or doctor
    private String dateTime;
    private String description;

    public Appointment(int id, int userId, String dateTime, String description) {
        this.id = id;
        this.userId = userId;
        this.dateTime = dateTime;
        this.description = description;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getDateTime() { return dateTime; }
    public String getDescription() { return description; }
}
