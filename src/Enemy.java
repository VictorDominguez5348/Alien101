public class Enemy implements Actor
{
    int lives = 0, health = 0;
    String name, weapon;


    public Enemy()
    {
        name = "bob";
        weapon = "none";
    }
    public Enemy(String name, String weapon, int lives, int health)
    {
        this.name = name;
        this.weapon = weapon;
        this.lives = lives;
        this.health = health;


    }//end of 5 constructor
    @Override
    public void Attack(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "Enemy{" +
                "lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
