package br.com.panvel.modulo9.slides.composite.tree;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;
    private List<Component> components;

    public Composite(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void showPrice(String addAtBeggining) {
        System.out.println(addAtBeggining + name);
        components.forEach(c -> c.showPrice("   " + addAtBeggining));
    }

    @Override
    public double getPrice()
    {
        return components.stream().mapToDouble(Component::getPrice).sum();
    }

    public void addComponent(Component c)
    {
        components.add(c);
    }

    public void removeComponent(Component c)
    {
        components.remove(c);
    }
}
