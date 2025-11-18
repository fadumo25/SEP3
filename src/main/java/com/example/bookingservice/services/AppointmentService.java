package com.example.bookingservice.services;

import com.example.bookingservice.models.Appointment;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class AppointmentService {
    public List<Appointment> getAppointments() {
        // Tiny in-memory data for proof-of-concept
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment(1, 2, "2025-11-05T10:00", "Checkup with Dr. Smith"));
        appointments.add(new Appointment(2, 2, "2025-11-06T11:30", "Dental appointment"));
        return appointments;
    }
}
