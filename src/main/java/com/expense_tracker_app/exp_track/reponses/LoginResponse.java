package com.expense_tracker_app.exp_track.reponses;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginResponse {
    private String token;

    private long expiresIn;
}