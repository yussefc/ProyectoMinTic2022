package controller;

import java.util.ArrayList;

import model.Enterprise;

public class EnterpriseController {
    //ATRIBUTOS
    private ArrayList<Enterprise> enterprise;
    //CONSTRUCTOR
    public EnterpriseController(){
        this.enterprise = new ArrayList<Enterprise>();
    }

    //CREAR EMPRESA
    public void crearEmpresa(long id, String name, String document, String phone, String address){
        //Crear objeto universidad
        Enterprise empresa = new Enterprise(id, name, document, phone, address);
        //Agregar la empresa al Array
        enterprise.add(empresa);
    }

    //MOSTRAR TODAS LAS EMPRESAS
    public String mostrarEmpresas(){
        String info = "";
        for (Enterprise empresas : enterprise) {
            info += empresas.toString();            
        }   
        return info;
    }

    //CONSULTAR EMPRESA
    public String consultarEmpresa(long id){
        String info = "";
        for (Enterprise empresas : enterprise) {
            if(empresas.getId() == id)
            info = empresas.toString();            
        }   
        return info;
    }

    //ACTUALIZAR EMPRESA
    public void actualizarEmpresa(long id, String name, String document, String phone, String address ){
        for (Enterprise empresas : enterprise) {
            if(empresas.getId() == id)
            empresas.setName(name);
            empresas.setDocument(document);  
            empresas.setPhone(phone);
            empresas.setAddress(address);          
        }
    }

    //ELIMINAR EMPRESA
    public void eliminarEmpresa(long id){
        for (int i = 0; i < enterprise.size(); i++) {
            if(enterprise.get(i).getId() == id){
                enterprise.remove(i);
                break;
            }            
        }
    }



}
