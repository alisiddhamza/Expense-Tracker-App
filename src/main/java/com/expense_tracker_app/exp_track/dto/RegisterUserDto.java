package com.expense_tracker_app.exp_track.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;

}
