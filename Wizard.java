public class Wizard extends Character {
    
    Wizard(String name) 
    {
        super(name);
    }

    public void HydroCannon(Character enemyCharacter)
     {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with HydroCannon (Damage - 25)");
        int manacost = 70;
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints, manacost);
    };
}