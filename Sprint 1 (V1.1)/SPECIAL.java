
public class SPECIAL extends Character{
  
  public int strength;
  public int perception;
  public int endurance;
  public int charisma;
  public int intelligence;
  public int agility;
  public int luck;
  
  public Character (String name, int xp, int x, int y, int strength,
int perception, int endurance, int charisma, int intelligence,
int agility, int luck){
      super(name, xp, x, y);
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
      return this.hunger;
   }
  
  public int getAgility() {
      return this.agility;
   }
  
   public int getLuck() {
      return this.luck;
   }
  
     public String toString(){
      String output = "S.P.E.C.I.A.L Stats: ";
      output += "\nName: ";
      output += name;
      output += "\nHealth: ";
      output += health;
      output += "\nHunger: ";
      output += hunger;
      output += "\nXP: ";
      output += xp;
      output += "\nCoordinates: (";
      output += x + ", " + y + ")";
      
      return output;
}
