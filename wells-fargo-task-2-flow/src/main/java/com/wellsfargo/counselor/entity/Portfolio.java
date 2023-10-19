package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String Portname;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private int risk_factor;
    
    protected Portfolio() {

    }

    public Portfolio(String Portname, int total, int risk_factor) {
        this.Portname = Portname;
        this.total = total;
        this.risk_factor = risk_factor;
        
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return Portname;
    }

    public void setName(String Portname) {
        this.Portname = Portname;
    }

    public int total(){
        return total;
    }

    public int risk_factor(){
        return risk_factor;
    }

    public Long getClientId(Client clie){
        return clie.getClientId();
    }

}


