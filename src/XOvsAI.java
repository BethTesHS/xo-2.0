
// You got this...
// But...
// But what?
// You're not commenting your code
// I know!! I wish I did when I first made this code... Now I'm trying to figure out how it works
// pain
// I'll figure this out. THEN COMMENT IT ALL!!
import java.util.Scanner;

public class XOvsAI {
    
    public synchronized void Waiting() {
        try {
            wait(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        // getXOperation();
        XOperation xo = new XOperation();
        XO_AI ai = new XO_AI();
        ai.operation(xo);
        

        int YN;
        do {
            YN = 0;
            char ans = '\0';
            int count = 1;
            xo.board();

            // count represent players' turn
            for (count = 1; count < 10; count++) {
                // When count is odd, player 1 plays
                if (count % 2 == 1) {
                    System.out.println("\nAI making a move...");
                    new XOvsAI().Waiting();
                    ans = ai.AImove(count);
                }
                // When count is even, player 2 plays
                else {
                    System.out.println("\nPlayer two! Select a character!");
                    // takes answer
                    ans = sin.next().charAt(0);
                    // Choice's operation
                    ai.PlayerMove(ans);
                    ans = xo.Choice(ans, count);

                }

                // '.' shows that a slot was selected again or pressed wrong key
                if (ans == '.') {
                    // since the next turn hasn't occured, it deducts the count that was added
                    count--;
                    ans = '\0';
                }

                // Winner operation to check who won
                int[] returned = xo.Winner(count);
                // accepts reterned Yes/No answer
                YN = returned[0];
                // accepts reterned count
                count = returned[1];
            }

            // loop when YN = 1, therefore yes
        } while (YN == 1);
        sin.close();
    }
}