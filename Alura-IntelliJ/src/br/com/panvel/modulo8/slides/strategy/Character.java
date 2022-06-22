package br.com.panvel.modulo8.slides.strategy;

public class Character {
    public static float x, y;

    private MoveState moveState;
    private int energy;

    Character(){
        x = 0; y = 0;
        energy = 100;
        moveState = MoveState.ready;
    }

    public void move(float x, float y)
    {
        if(moveState == MoveState.cantMove)
            return;

        x = clamp(x, -1, 1);
        y = clamp(y, -1, 1);

        if(moveState == MoveState.ready) {
            energy--;
            x += x;
            y += y;
        }

        if(energy < 1)
        {
            moveState = MoveState.outOfEnergy;
        }
    }

    public void cantMove()
    {
        if(moveState != MoveState.cantMove)
            moveState = MoveState.cantMove;
        else if(energy > 0)
            moveState = MoveState.ready;
        else
            moveState = MoveState.outOfEnergy;
    }


    private float clamp(float val, float min, float max)
    {
        if(val > max)
            return max;

        if(val < min)
            return min;

        return val;
    }
}

enum MoveState {
    ready,
    outOfEnergy,
    cantMove
    }