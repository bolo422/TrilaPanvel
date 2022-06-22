package br.com.panvel.modulo10.solid;

import java.util.List;

public class Invoice {
    List<Product> products;
    private List<Integer> quantity;
    private double taxRate;
    private double total;

    Invoice(List<Product> products, List<Integer> quantity, double taxRate){
        this.products = products; this.quantity = quantity; this.taxRate = taxRate;
        total = calculateTotal();
    }

    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getValue() * quantity.get(i);
        }
        return total;
    }

    public void printInvoice()
    {
        InvoicePrinter.printInvoice(this);
    }

    public void saveInvoiceToFile(String path, String filename, String format){
        InvoicePersistence.saveInvoiceToFile(path,filename,format);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }


}

class InvoicePrinter{
    public static void printInvoice(Invoice inv){
        System.out.println("ITEM | CÓDIGO | DESCRIÇÃO | QTD | VALOR UNIT. | VALOR ITEM");
        for (int i = 0; i < inv.getProducts().size(); i++) {
            Product p = inv.getProducts().get(i);
            StringBuilder print = new StringBuilder();
            print.append(i+1).append(" | ")
                    .append(p.getId()).append(" | ")
                    .append(p.getName()).append(" | ")
                    .append(inv.getQuantity().get(i)).append(" | ")
                    .append(p.getValue()).append(" | ")
                    .append(p.getValue() * inv.getQuantity().get(i));
            System.out.println(print);
        }
        System.out.println("TOTAL: " + inv.getTotal() + "\nVolte sempre!");
    }
}

class InvoicePersistence{
    public static void saveInvoiceToFile(String path, String filename, String format){
        //Implementação omitida
    }
}

class Product{
    private double value = 1;
    private String name;
    private String id;

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}