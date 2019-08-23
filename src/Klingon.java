public class Klingon extends Enemy
{
    boolean isFriendly = false;
    int lives = 0, health = 0;
    String name, weapon;

    public Klingon(String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(name, weapon, lives, health);
        this.isFriendly = isFriendly;
    } //end of full constructor

    public String getName()
    {
        return name;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public void Attack(int damage)
    {
        if(isFriendly)
            System.out.println("You can't attack your friend");
        else
        health -= damage;
    }

    @Override
    public String toString()
    {
        return "Klingon{" +
                "isFriendly=" + isFriendly +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    } //end of toString
}
