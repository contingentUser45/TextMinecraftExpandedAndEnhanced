
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
     this.intelligence = intelligence;
     this.agility = agility;
     this.luck = luck;
   }
}
