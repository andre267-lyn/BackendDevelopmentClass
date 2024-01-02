package com.andre.backendday3.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private String userResume;
}
