
public class raider {
    private int unhappy;

    /*
    *
    *
    *
    *
    */

    private DEFAULT_RESPONSE = "......";
    private ANGRY_RESPONSE: "HEll NO!";
    private UNINTEL_RESPONSE: "Hurrr";
    private EASTER_EGG_RESPONSE: "Good, now thats one less loose end";

    public void morbius(){
        System.out.println("Cass: Hello, can you hear me?");
        if (intelligence < 2) {
             System.out.println("1 - " + UNINTEL_RESPONSE + "?");
             System.out.println("2 - " + UNINTEL_RESPONSE + ".");
        }
        else{
             System.out.println("1 - Who Are you and what why are you calling me for?");
             System.out.println("2 - Wrong number. \"hang up\"");
             System.out.println("3 - U tebya yest' dsm?");
            }
             int snackSelect = input.nextInt();
             switch (snackSelect) {
             case 1:

                 break;
             case 2:

                 break;
             default:
                 System.out.println("Invalid input");
             }
    }

}