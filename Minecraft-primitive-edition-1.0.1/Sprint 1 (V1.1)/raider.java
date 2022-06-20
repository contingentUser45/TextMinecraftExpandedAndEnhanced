import java.util.Scanner;

public class raider {
    private int unhappy;

    
    /*
    *
    *
    *
    *
    */

    private static String DEFAULT_RESPONSE = "......";
    private static String ANGRY_RESPONSE = "Hell NO!";
    private static String UNINTEL_RESPONSE = "Hurrr";
    private static String EASTER_EGG_RESPONSE = "Good, now thats one less loose end";

    public static void morbius(int intelligence){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cass: Hello, can you hear me?");
        System.out.println("------------------------------");
			if (intelligence < 2) {
			     System.out.println("1 - " + UNINTEL_RESPONSE + "?");
			     System.out.println("2 - " + UNINTEL_RESPONSE + ".");
			}
			else{
			     System.out.println("1 - Who Are you and what why are you calling me for?");
			     System.out.println("2 - Wrong number. \"hang up\"");
			     System.out.println("3 - U tebya yest' DSM?");
			    }

             int snackSelect = sc.nextInt();
             switch (snackSelect) {
             case 1:
               System.out.println("Cass: Oh this isn't Mark Johnson's channel? Sorry for wasting your time");
                 break;
             case 2:
                 break;
             case 3:
            	 System.out.println("Cass: What did you say? I didn't get that.");
                 System.out.println("------------------------------------------");
                 System.out.println("1 - " + DEFAULT_RESPONSE);
                 snackSelect = sc.nextInt();
            	 switch (snackSelect) {
                 case 1:
                 break;
                 case 2187:
                	 System.out.println(EASTER_EGG_RESPONSE);
                 break;
                 default:
                	 System.out.println("Invalid input");
            	 }
                break;
             default:
                 System.out.println("Invalid input");
             }
        }

}