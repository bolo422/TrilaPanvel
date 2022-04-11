enum Type{
    dog,
    cat,
    fish,
    other
}

public class Pet {

    private String name;
    private Type type;
    private double speed;
    private  Owner owner;

    Pet(String name, Type type, double speed, Owner owner)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
        this.owner = owner;
    }

    Pet(Type type, double speed, Owner owner)
    {
        this("Unknown", type, speed, owner);
    }

    Pet(Pet pet)
    {
        this(pet.getName(), pet.getType(), pet.getSpeed(), pet.getOwner());
    }

    Pet(Type type, double speed) // feito para forçar owner = null
    {
        this.type = type;
        this.speed = speed;
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

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }
}

