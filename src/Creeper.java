public class Creeper extends Enemy
{
    boolean isAgressive = true;
    int lives = 0, health = 0;
    String name, weapon;

    public Creeper(String name, String weapon, int lives, int health, boolean isAgressive)
    {
        super(name, weapon, lives, health);
        this.isAgressive = isAgressive;
    }

    public String getName()
    {
        return name;
    }

    public String getWeapon()
    {
        return weapon;
    }

    @Override
    public void Attack(int damage)
    {
        if(isAgressive)
            health -= damage;
        else
            System.out.println("Your cat saved you");
    }

    @Override
    public String toString()
    {
        return "Creeper{" +
                "isAgressive=" + isAgressive +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
