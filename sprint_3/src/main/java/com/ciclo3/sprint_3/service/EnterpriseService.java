package com.ciclo3.sprint_3.service;

import com.ciclo3.sprint_3.entities.Enterprise;
import com.ciclo3.sprint_3.repositories.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository enterpriseRepository;
    public Enterprise insertar(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
    }
    public Enterprise actualizar(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
    }
    public List<Enterprise> listar(){
        return enterpriseRepository.findAll();
    }
    public void eliminar(Enterprise enterprise){
        enterpriseRepository.delete(enterprise);
    }
}
