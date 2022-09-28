package br.com.panvel.modulo9.slides.adapter;

import br.com.panvel.modulo9.slides.adapter.httpAdapter.HttpAdapter;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Catalog {
    HttpAdapter http;
    Catalog(HttpAdapter http){
        this.http = http;
    }

    public void register(Product product) {
        String url = "http://api.external/catalog";
        Map<String, Object> data = Map.of(
                "name", product.getName(),
                "price", product.getPrice()
        );
        http.post(url, data);
    }
}
