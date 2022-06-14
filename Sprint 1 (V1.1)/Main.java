/**
* Names: Shairahavan Selvachandran, Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

import java.util.*;

class Main {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      String name;
      
        Location riftenBasic = new Location("Riften", 50,
    50, 100, 100, 100);
      
      Location SHB = new Location("Site Hotel Echo", 0,
    0, 0, 0, 0);
      
      // Create character
      
      System.out.print("What is your name: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(name, 100, 0, 0);
      
      // Create overworld
      Overworld.createWorld(player1);
      
      // Spawn Inventory
      Inventory inv = new Inventory();
      
      //Spawn items
      Weapon pickaxe1 = new Weapon ("wood pickaxe", 274, 1, 1, 5, 20);  // make a melee weapon
      Weapon pickaxe2 = new Weapon ("diamond pickaxe", 278, 1, 5, 5, 20);  // make a melee weapon
      Weapon bow1 = new Weapon ("single shot rifle", 261, 1, 5, 25, 20);  // make a range weapon
      
      //add items to inventory
      inv.addItem(pickaxe1, 1, 0);
      inv.addItem(pickaxe2, 1, 1);
      inv.addItem(bow1, 1, 2);

      //player will continually get hungrier
       while (true == true){
         player1.becomeHungry(0.05);
         System.out.println(Character.tostring);
       }
      
      
      
      //Spawn mobs
      Mob mob1 = new Hostile_Mob("creeper", 5, 20, 29, "sword"); // create mob
      Mob mob2 = new Passive_Mob ("pig", 5, 20, false); // create mob
      Mob mob3 = new Hostile_Mob("creeper", 5, 20, 29, "sword"); // create mob
      player1.takeDamage(5);  // test damage taken
      

      
      player1.attack(pickaxe1, mob1);  // attack using melee (testing out of range feature)
      
      // attack using bow (4 times to kill mob)
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      player1.attack(bow1, mob1);
      
      // create two different foods and eat them
      Food food1 = new Food("egg", 344, 12, 1, 0);
      player1.eat(food1);
      Food food2 = new Food("chicken", 10, 5, 2, 0);
      player1.eat(food2);
      
      player1.heal(2);  // test healing feature
      System.out.println(player1.toString());   // test toString (show attributes after all changes
      
      
      //Killing the character
      //Death messages + conditions
      player1.takeDamage(20);  // test damage taken
      Boolean killedbymob = true;
       System.out.println(Condition(name, false, killedbymob, false));
     
      System.exit(0);
   }
   
   public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Input your action choice");
        System.out.println("-------------------------\n");
        System.out.println("1 - Travel to a Location");
        System.out.println("2 - Interact with NPC");
        System.out.println("3 - Eat a Snack");
        System.out.println("4 - Attack an enemy");
        System.out.println("4 - Quit");

        try{
        selection = input.nextInt();
        }
        catch {
           System.out.println("Invalid input");
        }
        
        switch (choice) {
        case 1:
            // Perform "original number" case.
            break;
        case 2:
            // Perform "encrypt number" case.
            break;
        case 3:
            System.out.println("Input a men");
            break;
        case 4:
            System.out.println("Quitting Game");
            break;
        case 4:
            System.out.println("Quitting Game");
                  throw new IOException("User Quit Game");   
            break;
        default:
            System.out.println("Invalid input");
         
        return selection;    
    }
}
