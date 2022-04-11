package com.company;

public class Mage extends PlayableCharacter {

    int magicShield;
    int mana;

    public Mage(String name, int hp, int damage, int magicShield, int mana)
    {
        super(name, hp, damage);
        this.magicShield = magicShield;
        this.mana = mana;
    }

    public void Attack(PlayableCharacter target) // melhorar esse método, muito procedural !!!!!!!!!
    {
        if(mana > 0)
        {
            CastSpell(target);
        }
        else
        {
            super.Attack(target, getDamage());
        }
    }

    public void CastSpell(PlayableCharacter target)
    {
        mana--;
        System.out.println(getName() + " lancou uma magia em " + target.getName() + ", causando " + getDamage()*2 + " de dano!");
    }

    @Override
    public void TakeDamage(int damage)
    {
        damage-=magicShield;
        super.TakeDamage(damage);
    }

}
