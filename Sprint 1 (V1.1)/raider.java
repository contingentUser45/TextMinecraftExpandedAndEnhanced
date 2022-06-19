
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
            System.out.println("1 - Who Are you and what why are you calling me for?");
             System.out.println("2 - Wrong number. \"hang up\");
        }
        else{
             System.out.println("1 - " + UNINTEL_RESPONSE + "?");
             System.out.println("2 - " + UNINTEL_RESPONSE + ".");
            }
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
    }

}