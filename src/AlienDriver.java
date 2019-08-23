public class AlienDriver
{
    public static void main(String[] args)
    {
        Fighter joe = new Fighter("Captain", "Joe", "Spork" ,2,100, true);
        Creeper creepie = new Creeper("Creepie", "TNT", 1, 20, true);
        Klingon worf = new Klingon("Worf", "Phaser", 1,1000, true );
        Klingon burtog = new Klingon("burtog", "Phaser", 1,1000, false );


        Actor[] cast = {creepie,worf,burtog};
        for (Actor e: cast)
            System.out.println(e);

        System.out.println();


    System.out.println(joe);
    joe.setName("New Joe");
    System.out.println(joe);
        joe.Attack(10);
        System.out.println();

       System.out.println(creepie);
        creepie.Attack(10 );
        System.out.println(creepie);
        System.out.println();
//hello
     System.out.println(worf);
     worf.setWeapon("Spork");
        System.out.println(worf);



    }//end of main class
}//end of driver
