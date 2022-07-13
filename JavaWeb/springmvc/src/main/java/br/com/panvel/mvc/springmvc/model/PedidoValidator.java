package br.com.panvel.mvc.springmvc.model;

import java.util.ArrayList;
import java.util.List;

public class PedidoValidator {
    private List<String> errors;

    public PedidoValidator(List<String> errors){this.errors = errors;}
    public PedidoValidator(){this(new ArrayList<>());}

    public List<String> getErrors(){return errors;}
    public String getError(){
        StringBuilder str = new StringBuilder();
        errors.forEach(str::append);
        return str.toString();
    }
    public boolean hasError(){return !errors.isEmpty();}
    public void addError(String error){errors.add(error);}
}
