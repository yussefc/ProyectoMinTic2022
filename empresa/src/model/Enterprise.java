package model;

import java.sql.Date;

public class Enterprise {
    //ATRIBUTOS
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private User[] users;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updateAt;
    //CONSTRUCTOR
    public Enterprise(long id, String name, String document, String phone, String address){
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
    }

    public Enterprise(long id, String name, String document, String phone, String address, User[] users, Transaction[] transactions,
            Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    //Estructura de la empresa
    @Override
    public String toString(){
        String info = "\n-------------"+name+"-------------\n";
        info += "Id: "+id;
        info += "\nNombre: "+name;
        info += "\nDocumento: "+document;
        info += "\nTelefono: "+phone;
        info += "\nDireccion: "+address;
        info += "\n------------------------------------------------\n";
        return info;
    }
    


    //CONSULTORES Y MODIFICADORES
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public User[] getUsers() {
        return users;
    }
    public void setUsers(User[] users) {
        this.users = users;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }
    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    } 
    //METODOS
    public void infoEmpresa(){
        System.out.println("El nombre de esta empresa es: "+getName()+"\nSu ID es: "+getId()+"\nEsta ubicada en la direccion: "+getAddress()+"\nSu linea de atencion es: "+getPhone());
    }


    
}


