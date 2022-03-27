package Examples;

import java.util.Random;

public class DiceRolling {

    public void simulate(int rolls) {
        Random random = new Random();
        int[] counts = new int[13];// zərlərin nəticəsinin cəminin sayı

        for (int k = 0; k < rolls; k++) {
            int d1 = random.nextInt(6) + 1;
            int d2 = random.nextInt(6) + 1;
            counts[d1 + d2] += 1;
        }

        for (int k = 2; k <= 12; k++) {
            System.out.println(k + " : " + counts[k] + " : " + 100.00 * counts[k]/rolls + "%");
        }
    }

    public static void main(String[] args) {
        DiceRolling diceRolling = new DiceRolling();
        diceRolling.simulate(10000);
    }
}
