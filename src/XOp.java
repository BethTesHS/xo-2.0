import java.util.InputMismatchException;
import java.util.Scanner;

public class XOp {
    static char[] values = {};
    char a = '1', b = '2', c = '3', d = '4', e = '5', f = '6', g = '7', h = '8', i = '9';

    private XOp() {
        values[0] = a;
        values[1] = b;
    }
    public static char[] getXOperation() {
        if (values == null) {
            new XOp
        }
        return values;
    }
    // Letters are the position, Numbers are the current value, which will later
    // change to X or O

    // YN is Yes/No
    int YN = 0;
    Scanner yn = new Scanner(System.in);

    public void board(char letter, char value) {
        switch (letter) {
            // puts the value (X or O) based on the position selected (letters)
            case 'a':
                a = value;
                values[0] = value;
                break;
            case 'b':
                b = value;
                break;
            case 'c':
                c = value;
                break;
            case 'd':
                d = value;
                break;
            case 'e':
                e = value;
                break;
            case 'f':
                f = value;
                break;
            case 'g':
                g = value;
                break;
            case 'h':
                h = value;
                break;
            case 'i':
                i = value;
                break;
        }

        // display the board
        System.out.println("*******************");
        System.out.println("  " + a + "  |  " + b + "  |  " + c + "\n------------------");
        System.out.println("  " + d + "  |  " + e + "  |  " + f + "\n------------------");
        System.out.println("  " + g + "  |  " + h + "  |  " + i + "\n\n*******************\n");
    }

    public void board() {

        // display the board
        System.out.println("*******************");
        System.out.println("  " + a + "  |  " + b + "  |  " + c + "\n------------------");
        System.out.println("  " + d + "  |  " + e + "  |  " + f + "\n------------------");
        System.out.println("  " + g + "  |  " + h + "  |  " + i + "\n\n*******************");
    }

    public char Choice(char ans, int count) {

        char value = '\0'; // value for X or O

        if (count % 2 == 1) { // checks count to assign X or O
            value = 'X';
        } else {
            value = 'O';
        }
        switch (ans) {
            case '1': // --------------------------- player selected that number
                if (a == '1') { // ----------------- if slot is a number...
                    board('a', value); // --- to place the value on board and display board
                    ans = '\0'; // ----------------- ans is null
                } else { // ------------------------ if slot is X or O...
                    ans = '.'; // ------------------ '.' tells the code that the slot has already been selected
                    board(); // -------------------- justdisplay board
                    System.out.println("Already selected");
                }
                break;

            case '2':
                if (b == '2') {
                    board('b', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '3':
                if (c == '3') {
                    board('c', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '4':
                if (d == '4') {
                    board('d', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '5':
                if (e == '5') {
                    board('e', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '6':
                if (f == '6') {
                    board('f', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '7':
                if (g == '7') {
                    board('g', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '8':
                if (h == '8') {
                    board('h', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            case '9':
                if (i == '9') {
                    board('i', value);
                    ans = '\0';
                } else {
                    ans = '.';
                    board();
                    System.out.println("Already selected");
                }
                break;

            default: // when pressing other keys
                ans = '.';
                board();
                System.out.println("Wrong Input");

        }
        return ans;
    }

    public int[] Winner(int count) {

        // checking if there is a crossout
        if (a == b && b == c || d == e && e == f || g == h && h == i || a == d && d == g ||
            b == e && e == h || c == f && f == i || a == e && e == i || c == e && e == g) {
            // if count is 9, players are out of turns, game over!
            if (count == 9) {
                System.out.println("Game Over");
            }
            // if count is odd when crossout applies, P1 wins
            else if (count % 2 == 1) {
                System.out.println("Player One is the winner!!");
            }
            // if count is even when crossout applies, P1 wins
            else if (count % 2 == 0) {
                System.out.println("Player Two is the winner!!");
            }

            do { // wanna play again section
                System.out.println("Do you wanna play again?");
                System.out.println("1, Yes\n2, No");

                try { // just checking mismatched input
                    YN = yn.nextInt();
                } catch (InputMismatchException EX) {
                    yn.next();
                }

                // if 1, then yes start again (do... while loop)
                if (YN == 1) {
                    // count becomes 10 to finish up the game (for loop) and
                    count = 10;
                }
                // if 2, then no end (do... while loop)
                else if (YN == 2) {
                    // count becomes 10 to finish up the game (for loop)
                    count = 10;
                    System.out.println("Byeeeee!");
                }
                // player becomes an idiot and choose something else
                else {
                    System.out.println("You an IDIOT!! Choose the correct option");
                }
            } while (YN != 1 && YN != 2);

            if (YN == 1) {
                // reset the values
                a = '1';
                b = '2';
                c = '3';
                d = '4';
                e = '5';
                f = '6';
                g = '7';
                h = '8';
                i = '9';
            }
        }
        // return Yes/No and count
        int[] returns = { YN, count };
        return returns;
    }

}