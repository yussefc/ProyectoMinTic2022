package domain.entities;

public class User {
    //ATRIBUTOS
    private String user;

    //CONSTRUCTOR
    public User(String user){
        this.user = user;
    }

    //METODOS Y CONSULTORES
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    //METODOS
    public void apodo(){
        System.out.println("El apodo del usuario es: "+getUser());
    }
}
