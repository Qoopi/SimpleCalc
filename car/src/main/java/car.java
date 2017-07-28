/**
 *
 * Created by oGGi on 21.07.2017.
 */
public class car {

    // slak tests
    public static void main (String [] args) {
        for (int i = 0; i < 100; i++) {
            int rand = (int) (Math.random() * 10 + 1);
            switch (rand) {
                case 1:
                    System.out.println("1");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 9:
                    System.out.println("9");
                    break;
            }

        }
    }
}
