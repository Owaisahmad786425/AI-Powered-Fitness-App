package com.fitness.gateway.user;

import lombok.Data;

@Data
public class RegisterRequest {
    private String keycloackId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
