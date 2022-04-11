package com.company;

public class Barbarian extends PlayableCharacter {

    boolean rage;

    public Barbarian(String name, int hp, int damage)
    {
        super(name, hp, damage);
        rage = false;
    }

    public void Attack(PlayableCharacter target) // melhorar esse método, muito procedural !!!!!!!!!
    {
        if(rage)
        {
            super.Attack(target, getDamage() * 3);
            rage = false;
        }
        else
            super.Attack(target, getDamage());
    }


    @Override
    public void TakeDamage(int damage)
    {
        rage = true;
        super.TakeDamage(damage);
    }

}
