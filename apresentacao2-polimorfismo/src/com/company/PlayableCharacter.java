package com.company;

public abstract class PlayableCharacter extends Character {
    private String name;
    private int hp;
    private int damage;

    public PlayableCharacter(String name, int hp, int damage)
    {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    protected void Attack(PlayableCharacter target, int damage) // melhorar esse método, muito procedural !!!!!!!!!
    {
        System.out.println(name + " atacou " + target.getName() + ", causando " + damage + " de dano!");
    }

    public void TakeDamage(int damage)
    {
        hp-=damage;

        if(hp<0)
            hp = 0;
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
