package model;

import java.sql.Date;

public class Employee {
    //ATRIBUTOS
    private long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise enterprise;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updateAt;
    //CONSTRUCTOR
    public Employee(long id, String email, Profile profile, Enum_RoleName role, Enterprise enterprise, Transaction[] transactions,
            Date createdAt, Date updateAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
    //CONSULTORES Y MODIFICADORES
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }
    public void setRole(Enum_RoleName role) {
        this.role = role;
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
    public void infoEmpleado(){
        System.out.println("El ID del empleado es: "+getId()+"\nSu correo electronico es: "+getEmail()+"\nPertenece a la empresa: "+getEnterprise()+"\nEl rol que desempeña es: "+getRole());
    }

    

    
    
    
}
