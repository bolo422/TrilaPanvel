package com.company;

public class Barbarian extends PlayableCharacter {

    boolean rage;
    boolean trickDeath;

    public Barbarian(String name, int hp, int damage, Alignment alignment, String player)
    {
        super(name, hp, damage, alignment, player);
        rage = false;
        trickDeath = true;
    }

    @Override
    public void Attack(Character target)
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
        if(trickDeath && damage >= super.getHp())
        {
            super.Heal((damage - getHp()) + 1);
            trickDeath = false;
            System.out.println(getDamage() + " ativou Enganar a Morte!");
        }
        super.TakeDamage(damage);
    }

}

