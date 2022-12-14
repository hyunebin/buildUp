package com.buildup.bu.Model.User;

import com.buildup.bu.Persist.Entity.Users;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {
    String phone;
    String password;
    String email;
    String name;
    String type;
    String verifyCode;


    public static Users of(SignUp signUp){
        return Users.builder()
                .phone(signUp.getPhone())
                .password(signUp.getPassword())
                .email(signUp.getEmail())
                .type("Email")
                .name(signUp.getName())

                .build();
    }

}