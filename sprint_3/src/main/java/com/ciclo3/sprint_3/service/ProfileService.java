package com.ciclo3.sprint_3.service;

import com.ciclo3.sprint_3.entities.Profile;
import com.ciclo3.sprint_3.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    public Profile insertar(Profile profile){
        return profileRepository.save(profile);
    }
    public Profile actualizar(Profile profile){
        return profileRepository.save(profile);
    }
    public List<Profile> listar(){
        return profileRepository.findAll();
    }
    public void eliminar(Profile profile){
        profileRepository.delete(profile);
    }
}
