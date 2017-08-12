package superfight;

public class Battle
{
    public static void main(String[] args)
    {
        System.out.println("Super Fight!!!");
        SuperHero batman = new SuperHero("Batman", "I am BATMAN KPOW", 10, 9, false);
        SuperHero superman = new SuperHero("Superman", "For justice BOOM", 25, 20, true);

        while(batman.alive() && superman.alive())
        {
            batman.defend(superman.attack());
            superman.defend(batman.attack());
        }
    }

}
