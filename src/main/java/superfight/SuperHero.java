package superfight;

public class SuperHero
{
    String name;
    String battleCry;
    boolean fly;
    int strength;
    int speed;
    int health;

    SuperHero(String superName, String superCry, int superStrength, int superSpeed, boolean superFly)
    {
        name = superName;
        battleCry = superCry;
        strength = superStrength;
        speed = superSpeed;
        fly = superFly;
        health = 100;
    }

    boolean alive()
    {
        return health > 0;
    }

    int attack()
    {
        if(alive())
        {
            System.out.println(name + " yells " + battleCry + " with a strength of " + strength);
            return strength;
        }
        return 0;
    }

    boolean defend(int attackStrength)
    {
        health = health - attackStrength;
        if(health > 0)
        {
            if(fly)
            {
                System.out.print("But " + name + " can fly...\n");
                return true;
            }
            else
            {
                System.out.print("If only " + name + " could fly...\n");
            }
            return true;
        }
        return false;
    }
}
