package com.made.api_jwt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Entity
@Table(name = "USER_JWT")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String roles; //USER,ADMIN

    public List<String> getRoleList(){
        if(this.roles.length() >0){
            return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
    }
}
