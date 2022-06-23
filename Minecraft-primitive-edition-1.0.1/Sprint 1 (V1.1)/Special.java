/**
* Names: Cyrus Yang
* Class: ICS4U1-5A
* Date: June 19th, 2022
* Description: Statistical Stats that change how gameplay works
* 
*/

public class Special{ 
  
  /** the statistics of the user based on SPECIAL*/
  public int strength;
  public int perception;
  public int endurance;
  public int charisma;
  public int intelligence;
  public int agility;
  public int luck;
  
  //constructor
  
  /**
   Special
   Creates the stats for the user
   @param strength - strength of the user
   @param perception - perception of the user
   @param endurance - endurance of the user
   @param charisma - charisma of the user
   @param intelligence - intelligence of the user
   @param agility - agility of the user
   @param luck - luck of the user
   */
  public Special(int strength,
int perception, int endurance, int charisma, int intelligence,
int agility, int luck){
     this.strength = strength;
     this.perception = perception;
     this.endurance = endurance;
     this.charisma = charisma;
     this.intelligence =
       intelligence;
     this.agility = agility;
     this.luck = luck;
   }
  
  //Getter
  
     /**
   * Gets the strength of the player
   * @return the strength value
   */
  public int getStrength() {
      return this.strength;
   }
  
       /**
   * Gets the perception of the player
   * @return the perception value
   */
  public int getPerception() {
      return this.perception;
   }
  
       /**
   * Gets the endurance of the player
   * @return the endurance value
   */
  public int getEndurance() {
      return this.endurance;
   }
  
         /**
   * Gets the charmisma of the player
   * @return the charisma value
   */
  public int getCharisma() {
      return this.charisma;
   }
  
         /**
   * Gets the endurance of the player
   * @return the endurance value
   */
  public int getIntelligence() {
      return this.intelligence;
   }
  
         /**
   * Gets the agility of the player
   * @return the agility value
   */
  public int getAgility() {
      return this.agility;
   }
  
           /**
   * Gets the luck of the player
   * @return the luck value
   */
   public int getLuck() {
      return this.luck;
   }
   
     // Methods
  
    /**
    * When Executed, increases strength
    */
     public void buffup(){
      if(strength > 10){
         strength = 10;
      } else {
         strength++;
      }
   }
  
       /**
    * When Executed, increases perception
    */
   public void snipedamage(){
      if(perception > 10){
         perception = 10;
      } else {
         perception++;
      }
   }

     // Returns a string with all the attributes of the armor
     public String toString(){
      String output = "S.P.E.C.I.A.L Stats: ";
      output += "\nStrength: ";
      output += strength;
      output += "\nPerception: ";
      output += perception;
      output += "\nEndurance: ";
      output += endurance;
      output += "\nCharisma: ";
      output += charisma;
      output += "\nIntelligence: ";
      output += intelligence;
      output += "\nAgility: ";
      output += agility;
      output += "\nLuck: ";
      output += luck;
      
      return output;
     }
}
