package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private int purchasedDate;
    
    ;

    protected Security() {

    }

    public Security(String symbol, String type, int quantity, int price, int total, int purchasedDate) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.purchasedDate = purchasedDate;
        this.type = type;
    }

    public Long getSecurityId(){
        return securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public int quantity() {
        return quantity;
    }

    public int getPrice(){
        return price;
    }

    public int getTotal(){
        return total;
    }

    public int getPurchasedDate(){
        return purchasedDate;
    }
    
    public String getType(){
        return type;
    }
}
