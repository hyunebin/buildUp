package com.buildup.bu.Persist.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Table(uniqueConstraints = {
        @UniqueConstraint(name="email_phone_check",
            columnNames = {"email", "phone"})})
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String phone;
    String age;
    String email;
    String name;

    String verifyCode;
    boolean verify;


}
