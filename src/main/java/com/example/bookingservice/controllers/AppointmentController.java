package com.example.bookingservice.controllers;

import com.example.bookingservice.models.Appointment;
import com.example.bookingservice.models.User;
import com.example.bookingservice.services.AppointmentService;
import com.example.bookingservice.services.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("/appointments")
    public List<Appointment> getAppointments() {
        return appointmentService.getAppointments();
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userServiceClient.getUsers();
    }
}
