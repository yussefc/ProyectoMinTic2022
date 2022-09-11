package view;

import java.util.Scanner;


public class Home {
    //ATRIBUTOS
    private EnterpriseView eView;

    //CONTRUCTOR
    public Home(){
        this.eView = new EnterpriseView();
    }

    //Crear MENU
    public void crearMenu(){
        String info = "----------------MENU EMPRESAS----------------\n";
        info += "1) Crear EMPRESA\n";
        info += "2) Mostrar todas las EMPRESAS\n";
        info += "3) Consultar EMPRESAS x ID\n";        
        info += "4) Actualizar EMPRESAS x ID\n";
        info += "5) Eliminar EMPRESAS\n";
        info += "0) Salir\n";
        info += ">> ";
        int opc = -1;
        Scanner sc = new Scanner(System.in);
        try {            
            while(opc != 0){
                System.out.print(info);
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        eView.crearUniversidad(sc);
                        break;
                    case 2:
                        eView.mostrarEmpresas();
                        break; 
                    case 3:
                        eView.consultarEmpresa(sc);
                        break;
                    case 4:
                        eView.actualizarEmpresa(sc);
                        break;
                    case 5:
                        eView.eliminarEmpresa(sc);
                        break;
                    default:
                        break;
                }                
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("\nPor favor ingrese valores numericos en el menu\n");
        }
    }
}
