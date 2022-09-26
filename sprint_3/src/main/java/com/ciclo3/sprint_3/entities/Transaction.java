package com.ciclo3.sprint_3.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private long id;
    @Column(name = "concept")
    private String concept;
    @Column(name = "amount")
    private float amount;
    @ManyToOne
    @JoinColumn(name = "id_employee", insertable = false, updatable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "id_enterprise", insertable = false, updatable = false)
    private Enterprise enterprise;
    @Column(name = "cretedAt")
    private Date createdAt;
    @Column(name = "updatedAt")
    private Date updateAt;

    public Transaction(long id, String concept, float amount, Date createdAt, Date updateAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
}