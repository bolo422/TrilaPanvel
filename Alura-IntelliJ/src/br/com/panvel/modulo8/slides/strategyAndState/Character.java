package br.com.panvel.modulo8.slides.strategyAndState;

public class Character {
    public static float x, y;

    private SpecialState special;

    Character(){
        x = 0; y = 0;
        special = SpecialState.recharging;
    }

    public void useSpecialAttack()
    {
        if(special == SpecialState.ready)
        {
            System.out.println("Special Attack!");
            special = SpecialState.recharging;
        }
        else if(special == SpecialState.rechargingComplete)
        {
            special = SpecialState.ready;
            useSpecialAttack();
        }
    }

    public void rechargeSpecial(int rechargeValue)
    {
        if(special == SpecialState.recharging && rechargeValue == 100)
        {
            special = SpecialState.rechargingComplete;
        }
    }
}

enum SpecialState {
    ready,
    recharging,
    rechargingComplete,
    unavailable
    }