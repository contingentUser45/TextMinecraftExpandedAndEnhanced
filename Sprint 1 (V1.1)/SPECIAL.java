
public class SPECIAL{ //will rename to something less capslock
  
  public int strength;
  public int perception;
  public int endurance;
  public int charisma;
  public int intelligence;
  public int agility;
  public int luck;
  
  public SPECIAL (int strength,
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
  
  public int getStrength() {
      return this.strength;
   }
  
  public int getPerception() {
      return this.perception;
   }
  
  public int getEndurance() {
      return this.endurance;
   }
  
  public int getCharisma() {
      return this.charisma;
   }
  
  public int getIntelligence() {
      return this.intelligence;
   }
  
  public int getAgility() {
      return this.agility;
   }
  
   public int getLuck() {
      return this.luck;
   }
   
     public void buffup(){
      if(strength > 10){
         strength = 10;
      } else {
         strength++;
      }
   }
   
   public void snipedamage(){
      if(perception > 10){
         perception = 10;
      } else {
         perception++;
      }
   }

  
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
