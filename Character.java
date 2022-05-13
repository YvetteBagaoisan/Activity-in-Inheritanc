public class Character {

    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName
     * and mana
     */
    Character(String name, int newHealth, int newLevel, int newMana) 
    {
        characterName = name;
        level = newLevel;
        healthPoints = newHealth;
        manaPoints = newMana;

    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    Character(String name)
     {
        characterName = name;
    }

    /**
     * Create a method to Damage Target Character
     */

    public void damageTarget(Character enemyCharacter, int damagePoints, int manacost)
     {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints -= manacost;
        System.out.println("enemy character HP left  " + enemyCharacter.healthPoints + " and mana left  "
                + enemyCharacter.manaPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if (enemyCharacter.healthPoints <= 0)
         {
            System.out.println("\nCharacter " + enemyCharacter.characterName + " is defeated");
        }

    }

    public void damageGet(Character mainCharacter, int dp, int manacost) 
    {
        mainCharacter.healthPoints -= dp;
        mainCharacter.manaPoints -= manacost;
        System.out.println("enemy character HP left  " + mainCharacter.healthPoints + " and Mana Left  "
                + mainCharacter.manaPoints);

        if (mainCharacter.healthPoints <= 0) {
            System.out.println("\nCharacter " + mainCharacter.healthPoints + " is Defeated");
        }
    }

    public void increase(Character enemyCharacter, int addhp, int addmana) 
    {
        enemyCharacter.healthPoints += addhp;
        enemyCharacter.manaPoints += addmana;
        System.out.println("increase HP  " + addhp + " and also mana is increase  " + addmana);

        if (enemyCharacter.healthPoints <= 20)
         {
            System.out.println("increase HP " + enemyCharacter.healthPoints);
        }
    }

    public static int levelup = 10;
    Character(int levels)
     {
        if (levelup > level)
            level = levelup;
    }

}