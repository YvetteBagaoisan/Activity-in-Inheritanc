public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and
         * Mana Points
         * 
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP
         * and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In
         * Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the
         * current status of the Characters
         * - Create a method to display details for better readability
         */

        Wizard lyn = new Wizard("Lhyn");
        Warlock Yve = new Warlock("Yves");
        
        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
        System.out.println("HP left is " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
        System.out.println("HP left is " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        Yve.earthquake(lyn);
        System.out.println("\n" + lyn.characterName);
        System.out.println("HP left is " + lyn.healthPoints);
        System.out.println("Mana left is " + lyn.manaPoints);
        System.out.println(" ");

        Yve.earthquake(lyn);
        System.out.println("\n" + lyn.characterName);
        System.out.println("HP left is " + lyn.healthPoints);
        System.out.println("Mana left is " + lyn.manaPoints);
        System.out.println(" ");

        Yve.earthquake(lyn);
        System.out.println("\n" + lyn.characterName);
        System.out.println("HP left is " + lyn.healthPoints);
        System.out.println("Mana left is " + lyn.manaPoints);
        System.out.println(" ");

        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
        System.out.println("HP left is " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
        System.out.println("HP left is " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        Yve.recover(lyn);
        System.out.println(Yve.characterName + " has total HP of " + Yve.healthPoints + " and your total Mana is " + Yve.manaPoints);
        System.out.println(" ");
        System.out.println(Yve.characterName);
        System.out.println("HP left is  " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
        System.out.println("HP left is " + Yve.healthPoints);
        System.out.println("Mana left is " + Yve.manaPoints);
        System.out.println(" ");

        Yve.earthquake(lyn);
        System.out.println("\n" + lyn.characterName);
        System.out.println("HP left is " + lyn.healthPoints);
        System.out.println("Mana left is " + lyn.manaPoints);
        System.out.println(" ");

        lyn.HydroCannon(Yve);
        System.out.println("\n" + Yve.characterName);
    }
       
}
    