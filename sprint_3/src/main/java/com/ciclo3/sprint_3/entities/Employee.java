package com.ciclo3.sprint_3.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

enum Enum_RolName{
    ADMIN,OPERARIO
}
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "profile")
    private Profile profile;

    private Enum_RolName rol;
    @ManyToOne
    private Enterprise enterprise;
    @OneToMany
    @JoinColumn(name = "id_transaction", insertable = false, updatable = false)
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    @Column(name = "updateAt")
    private Date updatedAt;
    @Column(name = "createAt")
    private Date createdAt;

    public Employee() {
    }

    public Employee(long id, String email, Enum_RolName rol, Date updatedAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.rol = rol;///MIRAR///
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RolName getRol() {
        return rol;
    }

    public void setRol(Enum_RolName rol) {
        this.rol = rol;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction transaction) {
        transactions.add(transaction);
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
