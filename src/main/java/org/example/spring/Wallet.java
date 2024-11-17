package org.example.spring;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;

@Entity
@Table(name="Buy")
public class Wallet implements Serializable {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable=false)
    String purpose;

    @ColumnDefault("0")
    Integer quantity;



    public Wallet(String p, Integer q) {
        this.purpose = p;
        this.quantity = q;
    }

    public Wallet() {

    }

    public String getPurpose() {
        return purpose;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public boolean isIncome() {
        return quantity > 0;
    }

    public void setPurpose(String p) {
        this.purpose = p;
    }

    public void setQuantity(Integer q) {
        this.quantity = q;
    }
}
