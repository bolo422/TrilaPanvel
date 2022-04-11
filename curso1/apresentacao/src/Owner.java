public class Owner {
    private String name;
    private String adress;

    Owner(String name, String adress)
    {
        this.name = name;
        this.adress = adress;
    }

    Owner(){}

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setName(String name) {
        this.name = name;
    }
}
