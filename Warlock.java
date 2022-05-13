public class Warlock extends Character {
    
    Warlock(String name) 
    {
        super(name);
    }

    public void earthquake(Character mainCharacter)
     {
        System.out.println(super.characterName + " attacks " + mainCharacter.characterName + " with Earthquake ( Damage - 70)");
        int damagep = 70;
        int manacost = 25;
        damageTarget(mainCharacter, damagep, manacost);
    };

    public void recover(Character enemyCharacter)
     {
        System.out.println(super.characterName + " recover increase HP and Mana");
        int addhpoints = 40;
        int addmana = 20;
        increase(enemyCharacter, addhpoints, addmana);
    }
}