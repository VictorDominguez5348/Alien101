public class Fighter implements Actor
{
    //Instance variables
    boolean isInDanger = true;
    int level = 0, xp = 0;
    String rank = "";
    int lives = 0, health = 0 , enemyHealth;
    String name = "" , weapon = "";
    final int NUMLIVES = 3;


    //Constructor
    public Fighter()
    {
        level = 0;
        xp = 0;
        lives = NUMLIVES;
        rank = "none";
        name = "John Doe";
        weapon = " pool noodle";
    }
    public Fighter(String rank, String name, String weapon, int level, int xp, boolean isInDanger )
    {
        this.rank = rank;
        this.name = name;
        this.weapon = weapon;
        this.level = level;
        this.xp = xp;

    }
    //Getters

    public String getRank()
    {
        return rank;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public String getName()
    {
        return name;
    }
    //Setters

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    //Brain Methods
    @Override
    public void Attack(int damage)
    {
        if (isInDanger)
        {
            enemyHealth = 100 - damage;
            System.out.println("I need to attack");
            System.out.println(enemyHealth);
        }
        else
            System.out.println("Im safe");
    }

    // toString


    @Override
    public String toString()
    {
        return "Fighter{" +
                "level=" + level +
                ", xp=" + xp +
                ", rank='" + rank + '\'' +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", NUMLIVES=" + NUMLIVES +
                '}';
    }
}//end of Fighter class
