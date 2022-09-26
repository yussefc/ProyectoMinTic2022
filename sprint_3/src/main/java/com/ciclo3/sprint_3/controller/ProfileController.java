package com.ciclo3.sprint_3.controller;

import com.ciclo3.sprint_3.entities.Profile;
import com.ciclo3.sprint_3.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;
    @GetMapping
    public List<Profile>listar(){
        return profileService.listar();
    }
}
