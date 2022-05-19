package br.com.panvel.modulo6.concorrencia;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class test_collectionThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        //region Lists
        List<String> unsafeList = new ArrayList<>();
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        List<String> vector = new Vector<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new Adiciona(unsafeList, "unsafeList[" + i + "]")).start();
            new Thread(new Adiciona(syncList, "syncList[" + i + "]")).start();
            new Thread(new Adiciona(vector, "vector[" + i + "]")).start();
        }

        Thread.sleep(5000);
        System.out.println("\nList Interface:");
        print("unsafeList", unsafeList);
        print("syncList", syncList);
        print("vector", vector);
        //endregion

        //region Sets
        Set<String> unsafeSet = new HashSet<>();
        Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0; i < 10; i++) {
            new Thread(new Adiciona(unsafeSet, "unsafeSet[" + i + "]")).start();
            new Thread(new Adiciona(syncSet, "syncSet[" + i + "]")).start();
        }

        Thread.sleep(5000);
        System.out.println("\nSet Interface:");
        print("unsafeSet", unsafeSet);
        print("syncSet", syncSet);
        //endregion

        //region Maps
        Map<String, String> unsafeMap = new HashMap<>();
        Map<String, String> hashtable = new Hashtable<>();
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        for (int i = 0; i < 10; i++) {
            new Thread(new Adiciona(unsafeMap, "unsafeMap[" + i + "]")).start();
            new Thread(new Adiciona(hashtable, "hashtable[" + i + "]")).start();
            new Thread(new Adiciona(concurrentHashMap, "concurrentHashMap[" + i + "]")).start();
        }

        Thread.sleep(5000);
        System.out.println("\nMap Interface:");
        print("unsafeMap", unsafeMap);
        print("hashtable", hashtable);
        print("concurrentHashMap", concurrentHashMap);
        //endregion

    }



    static void print(String name, Object obj)
    {
        StringBuilder str = new StringBuilder(name);

        if(obj instanceof Collection collection)
        {
            str.append(" - Size[").append(collection.size()).append("]");

            if(collection instanceof List list)
            {
                str.append("- Last[").append(list.get(list.size() - 1)).append("]");
                str.insert(0, "{L} ");
            }
            else
                str.insert(0, "{C} ");
        }
        else if(obj instanceof Map map)
        {
            str.append(" - Size[").append(map.size()).append("]");
            str.insert(0, "{M} ");
        }

        System.out.println(str);
    }
}

class Adiciona implements Runnable
{
    Collection<String> collection;
    String name;

    Map<String, String> map;

    Adiciona(Collection<String> collection, String name)
    {
        this.collection = collection;
        this.name = name;
    }

    Adiciona(Map<String, String> map, String name)
    {
        this.map = map;
        this.name = name;
    }

    @Override
    public void run() {
        if(map == null && collection != null) // Collection block
        {
            for (int i = 0; i < 100; i++) {
                collection.add(name + " - " + i);
            }
        }
        else if (map != null) // Map block
        {
            for (int i = 0; i < 100; i++) {
                map.put(name+i, name + " - " + i);
            }
        }
    }
}


/*
String str = name;

        try // Collection block
        {
            Collection collection = (Collection)obj;
            str += " - Size[" + collection.size() + "]";

            try // List block
            {
                List list = (List)collection;
                str += "- Last[" + list.get(list.size()-1) + "]";
            }
            catch (ClassCastException ex)
            {

            }
        }
        catch (ClassCastException ex) // Map block
        {
            Map map = (Map) obj;
            str += " - Size[" + map.size() + "]";

        }
 */