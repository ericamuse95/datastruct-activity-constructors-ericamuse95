package com.kenzie.classes;

public class Wallet {
    //properties
    private int numCreditCards;
    private String owner;
    private double totalCash;

    //constructor, defaults to zero
    public Wallet(){
        this.numCreditCards = 0;
        this.totalCash = 0.00;
        this.owner = "";
    }
    //constructor that takes owner name and sets property
    public Wallet(String owner){
        this.owner = owner;
    }
    //constructor that takes numCreditCards, owner, totalCash and sets all the properties
    public Wallet(int numCreditCards, String owner,double totalCash){
        this.numCreditCards = numCreditCards;
        this.owner = owner;
        this.totalCash = totalCash;
    }
    //public getter/setter methods for each property
    //setters will have a void return
    public void setNumCreditCards(int numCreditCards){
        this.numCreditCards = numCreditCards;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setTotalCash(double totalCash){
        this.totalCash = totalCash;
    }

    //getters will return data type they are getting
    public int getNumCreditCards(){
        return this.numCreditCards;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getTotalCash(){
        return this.totalCash;
    }



}
