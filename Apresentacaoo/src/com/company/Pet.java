package com.company;

enum Type{
    dog,
    cat,
    fish,
    other
}

public class Pet {

    private String name;
    private Type species;
    private double speed;
    private Owner owner;

    public Pet(String name, Type type, double speed)
    {
        this.name = name;
        this.species = type;
        this.speed = speed;
    }

    public Pet(String name, Type type, double speed, Owner owner)
    {
        this(name, type, speed);
        this.owner = owner;
    }

    public Pet(Pet pet)
    {
        this(pet.getName(), pet.getType(), pet.getSpeed());

        if(pet.getOwner() != null)
            owner = pet.getOwner();
    }

    public Pet()
    {

    }



    static Pet Race(Pet pet1, Pet pet2)
    {
        if(pet1.getSpeed() == pet2.getSpeed())
            return null;
        else if(pet1.getSpeed() > pet2.getSpeed())
            return pet1;
        return pet2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return species;
    }

    public Owner getOwner() {
        return owner;
    }
}


