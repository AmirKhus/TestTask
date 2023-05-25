package com.example.demo.controller;

import com.example.demo.entity.InformationForUser;
import com.example.demo.entity.Post;
import com.example.demo.resource.InformationForUserResource;
import com.example.demo.service.iml.InformationForUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/informationForUser")
public class InformationForUserController {
    @Autowired
    InformationForUserService information;

    @RequestMapping(value = "/getInf", method = RequestMethod.GET)
    public ResponseEntity<InformationForUserResource> saveUser() {
        List<InformationForUserResource> informations = this.information.getAll();
        return new ResponseEntity(informations, HttpStatus.OK);
    }
}
