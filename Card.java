import java.util.*;

public class Card
{
    private String name,type;
    private int health, chakra;
    private ArrayList<String> moves = new ArrayList<String>();
    private ArrayList<Integer> damages = new ArrayList<Integer>();

    Card(String name)
    {
        this.name = name;

        chakra = 250;
        health = 175;

        if(name == "Naruto")
        {
            type = "wind";
            moves.add("\n(0)Rasengan -15hp");
            damages.add(-15);
            moves.add("\n(1)Wind Rasengan -25hp");
            damages.add(-25);
            moves.add("\n(2)Nine tails mode +10dp to all moves, lasts 2 turn");
            damages.add(-10);
            moves.add("\n(3)Substitution evades all damage on next turn (can only be used 3 times)");
            damages.add(0);
            moves.add("\n(4)Shadow clone -10hp and 25% chance of damage evasion");
            damages.add(-15);
            moves.add("\n(5)Infuse chakra +50 cp");
            damages.add(50);
        }
        else if(name == "Sauske")
        {
            type = "lightning";
            moves.add("\n(0)Chidori -15hp");
            damages.add(-15);
            moves.add("\n(1)Ametarasu -10hp can last up to 3 turns");
            damages.add(-10);
            moves.add("\n(2)Susanoo mode +10dp to all moves, lasts 2 turns");
            damages.add(-10);
            moves.add("\n(3)Substitution evades all damage on next turn (can only be used 3 times)");
            damages.add(0);
            moves.add("\n(4)Sharingan -5hp and 45% chance other player cannot attack on next turn");
            damages.add(-5);
            moves.add("\n(5)Infuse chakra +50cp");
            damages.add(50);
        }
    }

    public int getHealth()
    {
        return this.health;
    }

    public int getChakra()
    {
        return this.chakra;
    }

    public void setChakra(int chakra)
    {
        this.chakra = chakra;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public ArrayList<Integer> getdamages()
    {
        return this.damages;
    }

    public String getMove(int num)
    {
        return moves.get(num);
    }

    public ArrayList<String> getMoves()
    {
        return moves;
    }

    @Override
    public String toString()
    {
        return "Card" +
                "\nname: " + name +
                "\ntype: " + type +
                "\nhealth: " + health +
                "\nchakra: "+ chakra +
                "\nmoves" + moves;
    }
}
