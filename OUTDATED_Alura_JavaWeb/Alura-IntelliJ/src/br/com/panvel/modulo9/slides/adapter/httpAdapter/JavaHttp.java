package br.com.panvel.modulo9.slides.adapter.httpAdapter;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttp implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> data){
        try {
            URL apiUrl = new URL(url);
            URLConnection connection = apiUrl.openConnection();
            connection.connect();
            data.forEach((key, value) -> connection.addRequestProperty(key, value.toString()));
        } catch (Exception e) {
            throw  new RuntimeException("Erro ao conectar", e);
        }
    }
}
