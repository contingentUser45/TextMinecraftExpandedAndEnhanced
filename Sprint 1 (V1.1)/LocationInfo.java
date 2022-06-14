
public class Location {
  
  private int difficulty;
  private String locationName;
  private int pointGoodRep;
  private int pointBadRep;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  
  
   // constants
   private static String SETTLEMENT_TYPE = Settlement;
   public static int MAX_REPUTATION = 100;
   public static int DEFAULT_REP = 0;
  
   public Location (int difficulty, locationName, String type, int pointGoodRep, 
                     int pointBadRep, nt x1, int y1, int x2 int y2){
      this.difficulty = difficulty;
      this.locationName = locationName;
      this.pointGoodRep = DEFAULT_REP;
      this.pointBadRep = DEFAULT_REP;
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }
  
   public String getName() {
      return this.name;
   }
   
   public int getHealth() {
      return this.health;
   }
   
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
}
