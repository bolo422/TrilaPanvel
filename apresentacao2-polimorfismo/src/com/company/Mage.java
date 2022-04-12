package com.company;

public class Mage extends PlayableCharacter {

    private int magicShield;
    private int mana;

    public Mage(String name, int hp, int damage, Alignment alignment, String player, int magicShield, int mana)
    {
        super(name, hp, damage, alignment, player);
        this.magicShield = magicShield;
        this.mana = mana;
    }

    @Override
    public void Attack(Character target)
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

    public void CastSpell(Character target)
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
