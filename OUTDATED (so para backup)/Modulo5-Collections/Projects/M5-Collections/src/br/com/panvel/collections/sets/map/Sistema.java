package br.com.panvel.collections.sets.map;

import br.com.panvel.collections.sets.Usuario;

import java.util.*;

public class Sistema {

    final private Map<Integer, Usuario> map = new HashMap<>();
    final private Collection<Usuario> usuarios = new HashSet<>();

    void add(Usuario u)
    {
        usuarios.add(u);


        map.put(u.getId(), u);
    }



    Usuario getByID_Collection(int id)
    {
        for(Usuario u : usuarios)
        {
            if(u.getId() == id)
                return u;
        }
        return null;
    }



    Usuario getByID_Map(int id)
    {
        return map.get(id);
    }


    public Map<Integer, Usuario> getMap() {
        return map;
    }
}
