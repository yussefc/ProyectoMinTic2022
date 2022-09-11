package view;

import java.util.Scanner;

import controller.EnterpriseController;

public class EnterpriseView {
    //ATRIBUTOS
    private EnterpriseController eController;

    //CONSTRUCTOR
    public EnterpriseView(){
        this.eController = new EnterpriseController();
    }

    //CREAR UNIVERSIDAD
    public void crearUniversidad(Scanner sc){
        try {
            System.out.println("\n\n---------------CREAR EMPRESA---------------\n");
            System.out.print("ID: ");
            long id = sc.nextShort();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Document: ");
            String document = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            //Crear Uniersidad
            eController.crearEmpresa(id, name, document, phone, address);
            System.out.println("\n---------------------------");
            System.out.println("----Empresa Creada, exito!-----");
            System.out.println("---------------------------\n"); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n---------------------------");
            System.out.println("--Ha ocurrido un problema--");
            System.out.println("---------------------------\n");
        } 
    }

    //MOSTRAR EMPRESAS
    public void mostrarEmpresas(){
        System.out.println("\n\n--------------Listado EMPRESAS--------------");
        String info = eController.mostrarEmpresas();
        System.out.println(info);
    }

    //MOSTRAR UNA SOLA EMPRESA
    public void consultarEmpresa(Scanner sc){
        System.out.println("---------------CONSULTAR EMPRESA X ID---------------");
        try {
            System.out.print("Por favor ingrese el ID: ");
            long id = sc.nextShort();
            sc.nextLine();
            String info = eController.consultarEmpresa(id);
            System.out.println(info);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ACTUALIZAR EMPRESA
    public void actualizarEmpresa(Scanner sc){
        try {
            System.out.println("---------------ACTUALIZAR EMPRESA---------------");
            System.out.print("ID: ");
            long id = sc.nextShort();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Document: ");
            String document = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            eController.crearEmpresa(id, name, document, phone, address);
            System.out.println("\n---------------------------------");
            System.out.println("---Empresa Actualizada, exito!---");
            System.out.println("---------------------------------\n"); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n---------------------------");
            System.out.println("--Ha ocurrido un problema--");
            System.out.println("---------------------------\n");
        }
    }

    //ELIMINAR EMPRESA
    public void eliminarEmpresa(Scanner sc){
        System.out.println("\n\n-----------------Eliminar EMPRESA x ID-----------------\n");
        System.out.print("Ingrese el ID de la EMPRESA a eliminar: ");
        long id = sc.nextShort();
        sc.nextLine();
        eController.eliminarEmpresa(id);
        System.out.println("\n---------------------------------");
        System.out.println("---Empresa Eliminada, exito!---");
        System.out.println("---------------------------------\n"); 
    }







}
