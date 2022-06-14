
public class Location {
  
  private String locationName;
   private String reputation;
  private int pointGoodRep;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  
  
   // constants
   public static int MAX_REPUTATION = 100;
   public static int DEFAULT_REP = 50;
  
   public Location (String locationName, String type, int pointGoodRep,
    int x1, int y1, int x2 int y2){
      this.locationName = locationName;
      this.pointGoodRep = DEFAULT_REP;
      this.pointBadRep = DEFAULT_REP;
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
   }
  
   public String getLocationName() {
      return this.locationName;
   }
   
   public String getReputation() {
      if (pointGoodRep <= 0){
         return "Hated";
      }
         else if ((pointGoodRep > 0) && (pointGoodRep <= 50)){
         return "Suspicious";
      }
          else if ((pointGoodRep > 50) && (pointGoodRep <= 75)){
         return "Welcomed";
      }
            else if ((pointGoodRep > 75) && (pointGoodRep <= 100)){
         return "Well Liked";
      }
      else {
         return "Idolized";
      }
   }
   
   public String getlocationName() {
      return this.getlocationName;
   }
   
   public String getReputation() {
      return this.reputation;
   }

   public void changeReputation(int change){
      int orig = pointGoodRep;
      pointGoodRep = pointGoodRep - change
      System.out.print( "/n Reputation: " + orig);
      if ((orig == pointGoodRep) || ( orig < pointGoodRep)){
         System.out.print( "Increased to " + pointGoodRep);
      }
      if ((orig == pointGoodRep) || ( orig < pointGoodRep)){
         System.out.print( "Decreased to " + pointGoodRep);
      }
   }

   // toString method
   public String toString(){
      String output = "";
      output += "\nLocation Name: ";
      output += locationName;
      output += "\nReputation: ";
      output += reputation;

      return output;
   }
}
