package com.company;

enum Alignment{
    good,
    evil,
    neutral
        }

public abstract class PlayableCharacter extends Character {

    private Alignment alignment;
    private String player;

    public PlayableCharacter(String name, int hp, int damage, Alignment alignment, String player)
    {
        super(name, hp, damage);
        this.alignment = alignment;
        this.player = player;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public String getPlayer() {
        return player;
    }
}
