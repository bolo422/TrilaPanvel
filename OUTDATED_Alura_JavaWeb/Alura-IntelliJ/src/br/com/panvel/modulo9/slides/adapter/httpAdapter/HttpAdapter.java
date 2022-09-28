package br.com.panvel.modulo9.slides.adapter.httpAdapter;

import java.util.Map;

public interface HttpAdapter
{
    public void post(String url, Map<String, Object> data);
}
