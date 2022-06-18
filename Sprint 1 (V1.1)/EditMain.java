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
      Weapon pickaxe1 = new Weapon ("wood pickaxe", 274, 1, 1, 5, 20);  // make a melee weapon
      
      //Spawn mobs
      Mob[] moblist = new Mob[5]
      moblist[1] = new Hostile_Mob("creeper", 100, 20, 29, "sword"); // create mob
      moblist[2] = new Passive_Mob ("pig", 5, 20, false); // create mob
      moblist[3] = new Hostile_Mob("Insurgent", 50, 20, 20, "C4 Vest"); // create mob
      moblist[4] = new Passive_Mob ("pig", 5, 20, false); // create mob
      moblist[5] = new Hostile_Mob("Insurgent", 50, 20, 20, "C4 Vest"); // create mob
      
      // create two different foods
      Food food1 = new Food("Toilet Bowl", 344, 12, 6, 0);
      Food food2 = new Food("chicken", 10, 5, 2, 0);
      
      Weapon weaponUsed = new Weapon ("Default Weapon", 261, 1, 5, 25, 20);

      //player will continually get hungrier
       while (player1.health > 0){
         System.out.println(player1.toString());
         
         int power = character.strength;
         int sight = character.perception;
         if ((power > 5) && (sight > 5)){
               weaponUsed = new Weapon ("QuickScope 2000", 261, 1, 63, 25, 20);
          }
             else if (sight > 5) {
               weaponUsed = new Weapon ("single shot rifle", 261, 1, 5, 25, 20);
          }
             else {
               weaponUsed = new Weapon ("Stick", 278, 1, 1, 5, 20);
          }
         
         int selection;
         Scanner input = new Scanner(System.in);

         System.out.println("Input your action choice");
         System.out.println("-------------------------\n");
         System.out.println("1 - Travel to a Location");
         System.out.println("2 - Interact with NPC");
         System.out.println("3 - Eat a Snack");
         System.out.println("4 - Attack");
         System.out.println("5 - Cheats");
         System.out.println("6 - Take the easy way out");

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
             System.out.println("1 - Eat Snack from Snack Slot 1");
             System.out.println("2 - Eat Snack from Snack Slot 2");
             int snackSelect = input.nextInt();
             switch (snackSelect) {
             case 1:
                 player1.eat(food1);
                 player1.heal(2);
                 character.snipedamage();
                 break;
             case 2:
                 player1.eat(food2);
                 player1.heal(2);
                 character.buffup();
                 break;
             default:
                 System.out.println("Invalid input");
             }
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
                        Boolean killedbymob = true;
                        Condition DeathByBomb = new Condition(name, false, killedbymob, false);
                        System.out.println(DeathByBomb);
                      }
                 }
                 player1.becomeHungry(1);
             break;
         case 5:
             System.out.println("All Cheats are at https://youtu.be/xvFZjo5PgG0");
             break;
         case 6:
             System.out.println("Quitting Game");
                 player1.takeDamage(20);
                 Condition DeathBySewerslide = new Condition(name, false, false, false);
                 System.out.println(DeathBySewerslide);
                 throw new IOException("User Quit Game");   
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
