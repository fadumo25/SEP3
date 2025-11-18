package com.example.bookingservice.services;

import com.example.bookingservice.models.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceClient {

    private final String USER_SERVICE_URL = "http://localhost:5213/users";

    public List<User> getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        User[] users = restTemplate.getForObject(USER_SERVICE_URL, User[].class);
        return Arrays.asList(users);
    }
}
