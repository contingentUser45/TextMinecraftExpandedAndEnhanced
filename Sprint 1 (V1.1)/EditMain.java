/**
* Names: Shairahavan Selvachandran, Kevin Yao
* Class: ICS4U1-5A
* Date: April 29th, 2022
* Description: Basic Character to be controlled.
*/

import java.io.IOException;
import java.util.*;

class Main {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      String name;
      
      double distance;
      
        Location riftenBasic = new Location("Riften", 50,
    50, 100, 100, 100);
      
      Location SHB = new Location("Site Hotel Echo", 0,
    0, 0, 0, 0);
      
      
       SPECIAL character = new SPECIAL (5,
5, 5, 5, 5, 5, 5);
      
      // Create character
      
      System.out.print("Type Username: ");
      name = sc.nextLine();
      System.out.println();
      
      Character player1 = new Character(name, 100, 0, 0);
      
      
      //Spawn items
      Weapon[] weaponlist = new Weapon[3];
      weaponlist[0] = new Weapon("Default_WEAPON_IW", 274, 10, 10, 2, 20);
      weaponlist[1] = new Weapon("Steel Block", 271, 1, 1, 15, 20);
      weaponlist[2] = new Weapon("Stick", 272, 1, 1, 20, 20);
      //Spawn mobs
      Mob[] moblist = new Mob[5]
      moblist[0] = new Hostile_Mob("creeper", 100, 20, 29, "sword"); // create mob
      moblist[1] = new Passive_Mob ("pig", 5, 20, false); // create mob
      moblist[2] = new Hostile_Mob("Insurgent", 50, 20, 20, "C4 Vest"); // create mob
      moblist[3] = new Passive_Mob ("pig", 5, 20, false); // create mob
      moblist[4] = new Hostile_Mob("Insurgent", 50, 20, 20, "C4 Vest"); // create mob
      
      // create two different foods
      Food[] foodlist = new Food[2]
      foodlist[0] = new Food("A long thick object that has \"cum\" inside of it", 344, 12, 6, 0);
      foodlist[1] = new Food("chicken", 10, 5, 2, 0);
      
      Weapon weaponUsed = new Weapon ("Default Weapon", 261, 1, 5, 25, 20);

      //player will continually get hungrier
       while (player1.health > 0){
         System.out.println(player1.toString());
         int power = character.strength;
         int sight = character.perception;
         int selection;
         Scanner input = new Scanner(System.in);

         System.out.println("Input your action choice");
         System.out.println("-------------------------\n");
         System.out.println("1 - Travel to a Location");
         System.out.println("2 - Interact with NPC");
         System.out.println("3 - Eat a Snack");
         System.out.println("4 - Attack");
         System.out.println("5 - Cheats");
         System.out.println("6 - Change Weapon");
         System.out.println("7 - Take the easy way out");
         try{
         selection = input.nextInt();
         switch (selection) {
         case 1:
             System.out.println("Type x direction to travel to");
             int xDirection = input.nextInt();
             System.out.println("Type y direction to travel to");
             int yDirection = input.nextInt();
             player1.move(xDirection, yDirection);
             player1.becomeHungry(1);
             break;
         case 2:
             // to be implemented due to unsolvable issues 
             System.out.println("to be implemented due to unsolvable issues");
             break;
         case 3:
             System.out.println("Select a snack:");
             for (int i = 0; i < foodlist.length; i++) {
               System.out.println((i + 1) + " - " + foodlist[i].getName());
             }
             int consumption = input.nextInt();
             consumption = consumption - 1;
                 player1.eat(foodlist[consumption]);
                 player1.heal(2);
                 character.buffup();
                 character.snipedamage();
             break;
         case 4:
             System.out.println("Select Target:");
             System.out.println("1 - " + mob1.getName());
             for (int i = 0; i < moblist.length; i++) {
               System.out.println((i + 1) + " - " + moblist[i].getName());
             }
             int combat = input.nextInt();
             combat = combat - 1;
                 player1.attack(weaponUsed, moblist[combat]);
                  distance = Math.sqrt(Math.pow((player1.x-mob1.x),2) + Math.pow((player1.y-mob1.y),2));
                 if (distance <= weaponUsed.damageRadius){
                      if (sight < 6) {
                        player1.takeDamage(2);
                      }
                 }
                 player1.becomeHungry(1);
             break;
         case 5:
             System.out.println("All Cheats are at https://youtu.be/xvFZjo5PgG0");
             break;
         case 7:
             System.out.println("Quitting Game");
                 player1.takeDamage(20);
                 Condition DeathBySewerslide = new Condition(name, false, false, false);
                 System.out.println(DeathBySewerslide);
                 throw new IOException("User Quit Game");
         case 1337:
            System.out.println("You have found the cheat menu");
            System.out.println("Select a hack to go full out nuts!");
             System.out.println("1 - Equip CM901 Modular Rifle");
             System.out.println("2 - GodMode (Enable/Disable))");
             System.out.println("3 - Kill Yourself");
             System.out.println("4 - Max out SPECIAL stats");
             System.out.println("5 - Get Link to trailer");
             int selektion = input.nextInt();
                switch (selektion)
                case 1:
                    System.out.println("Vyberite slot dlya zameny oruzhiya na CM901:");
                    int cheat1 = input.nextInt();
                    weaponlist[cheat1] = new Weapon("CM901", 272, 10000, 10000, 347, 20);
                break;
                case 2:
                    System.out.println("Sike, You can't get godmode");
                break;
                case 3:
                    player1.takeDamage(20);
                    Condition DeathBySewerslide = new Condition(name, false, false, false);
                    System.out.println(DeathBySewerslide);
                break;
                case 4:
                        character = new SPECIAL (10, 10, 10, 10, 10, 10, 10);
                break;
                case 5:
                        System.out.println("https://www.youtube.com/watch?v=r72GP1PIZa0");
                break;
         case 6:
             System.out.println("Select a snack:");
             for (int i = 0; i < foodlist.length; i++) {
               System.out.println((i + 1) + " - " + foodlist[i].getName());
             }
             int consumption = input.nextInt();
             consumption = consumption - 1;
                 player1.eat(foodlist[consumption]);
                 player1.heal(2);
                 character.buffup();
                 character.snipedamage();
             break;
         default:
             System.out.println("Invalid input");    
         }
         }
         catch (Exception e){
            System.out.println("Invalid input");
         }
       }
      System.exit(0);
   }
}
