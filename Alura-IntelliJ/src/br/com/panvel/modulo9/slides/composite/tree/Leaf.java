package br.com.panvel.modulo9.slides.composite.tree;

public class Leaf implements Component{
    private String name;
    private double price;

    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice(String addAtBeggining) {
        System.out.println(addAtBeggining + name + " : " + price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}