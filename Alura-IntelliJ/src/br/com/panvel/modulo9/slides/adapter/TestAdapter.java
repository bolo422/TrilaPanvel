package br.com.panvel.modulo9.slides.adapter;

import br.com.panvel.modulo9.slides.adapter.httpAdapter.JavaHttp;

public class TestAdapter {
    public static void main(String[] args) {
        Product shampoo = new Product("Sampoo Dove", 12.50);
        Catalog catalog = new Catalog(new JavaHttp());
        catalog.register(shampoo);
    }
}
