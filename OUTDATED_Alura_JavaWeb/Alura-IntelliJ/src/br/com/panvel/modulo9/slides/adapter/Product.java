package br.com.panvel.modulo9.slides.adapter;

public class Product {
    private String name;
    private double price;
    Product(String nome, double price){
        this.name = nome;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
