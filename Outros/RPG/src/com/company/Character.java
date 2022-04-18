package com.company;

public abstract class Character{
    private String name;
    private int hp;
    private int damage;

    public Character(String name, int hp, int damage)
    {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public abstract void Attack(Character target);

    protected void Attack(Character target, int damage)
    {
        System.out.println(name + " atacou " + target.getName() + ", causando " + damage + " de dano!");
        target.TakeDamage(damage);
    }

    public void TakeDamage(int damage)
    {
        hp-=damage;

        if(hp<0) {
            hp = 0;
            Die();
        }
    }

    private void Die(){
        System.out.println(name + " está inconsciente e fora de combate!");
    }

    public void Heal(int value)
    {
        hp += value;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) { this.damage = damage;}




}
