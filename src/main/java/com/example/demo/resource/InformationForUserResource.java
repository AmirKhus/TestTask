package com.example.demo.resource;

import com.example.demo.entity.InformationForUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformationForUserResource extends BaseResource {
    private Long id;
    private String fio;
    private Date birthday;
    private String email;
    private String phoneNumber;
    private String post;
}
