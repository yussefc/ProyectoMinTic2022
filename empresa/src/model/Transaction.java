package model;

import java.sql.Date;

public class Transaction {
    //ATRIBUTOS
    private long id;
    private String concept;
    private Float amount;
    private User user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updateAt;
    //CONSTRUCTOR
    public Transaction(long id, String concept, Float amount, User user, Enterprise enterprise, Date createdAt,
            Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
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

    public String getConcept() {
        return concept;
    }
    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Float getAomunt() {
        return amount;
    }
    public void setAomunt(Float aomunt) {
        this.amount = aomunt;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
    public void infoMov(){
        System.out.println("El usuario: "+getUser()+"\nMovimiento realizado: "+getConcept()+"\nPor un valor: "+getAomunt());
    }

    

    

}
