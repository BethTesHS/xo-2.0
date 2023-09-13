
import java.util.InputMismatchException;
import java.util.Scanner;

public class XO {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        Scanner yn = new Scanner(System.in);

        int YN = 0;
        do {
            YN = 0;
            char a = '1', b = '2', c = '3', d = '4', e = '5', f = '6', g = '7', h = '8', i = '9';
            char ansX = '\0';
            char ansO = '\0';
            int count = 1;

            for (count = 1; count <= 10; count++) {

                System.out.println("*******************");
                System.out.println("  " + a + "  |  " + b + "  |  " + c + "\n------------------");
                System.out.println("  " + d + "  |  " + e + "  |  " + f + "\n------------------");
                System.out.println("  " + g + "  |  " + h + "  |  " + i + "\n\n*******************");

                if (count % 2 == 1) {
                    System.out.println("\nPlayer one! Select a character!");
                    ansX = sin.next().charAt(0);
                }

                else {
                    System.out.println("\nPlayer two! Select a character!");
                    ansO = sin.next().charAt(0);
                }

                switch (ansX) {
                    case '1':
                        if (a == '1') {
                            a = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '2':
                        if (b == '2') {
                            b = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '3':
                        if (c == '3') {
                            c = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '4':
                        if (d == '4') {
                            d = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '5':
                        if (e == '5') {
                            e = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '6':
                        if (f == '6') {
                            f = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '7':
                        if (g == '7') {
                            g = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '8':
                        if (h == '8') {
                            h = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '9':
                        if (i == '9') {
                            i = 'X';
                            ansX = '\0';
                        } else {
                            ansX = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '\0':
                        break;

                    default:
                        ansX = '.';
                        System.out.println("Wrong Input");

                }

                switch (ansO) {
                    case '1':
                        if (a == '1') {
                            a = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '2':
                        if (b == '2') {
                            b = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '3':
                        if (c == '3') {
                            c = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '4':
                        if (d == '4') {
                            d = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '5':
                        if (e == '5') {
                            e = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '6':
                        if (f == '6') {
                            f = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '7':
                        if (g == '7') {
                            g = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '8':
                        if (h == '8') {
                            h = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '9':
                        if (i == '9') {
                            i = 'O';
                            ansO = '\0';
                        } else {
                            ansO = '.';
                            System.out.println("Already selected");
                        }
                        break;

                    case '\0':
                        break;

                    default:
                        ansO = '.';
                        System.out.println("Wrong Input");
                }

                if (ansO == '.' || ansX == '.') {
                    count--;
                    ansX = '\0';
                    ansO = '\0';
                }
                if (a == b && b == c || d == e && e == f || g == h && h == i || a == d && d == g ||
                        b == e && e == h || c == f && f == i || a == e && e == i || c == e && e == g) {
                    if (count % 2 == 1) {
                        System.out.println("Player One is the winner!!");
                        do {
                            System.out.println("Do you wanna play again?");
                            System.out.println("1, Yes\n2, No");

                            try {
                                YN = yn.nextInt();
                            } catch (InputMismatchException EX) {
                                yn.next();
                            }

                            if (YN == 1) {
                                count = 11;
                            } else if (YN == 2) {
                                System.out.println("Byeeeee!");
                                count = 11;
                            } else {
                                System.out.println("You an IDIOT!! Choose the correct option");
                            }
                        } while (YN != 1 && YN != 2);

                    } else if (count % 2 == 0) {
                        System.out.println("Player Two is the winner!!");
                        do {
                            System.out.println("Do you wanna play again?");
                            System.out.println("1, Yes\n2, No");

                            try {
                                YN = yn.nextInt();
                            } catch (InputMismatchException EX) {
                                yn.next();
                            }

                            if (YN == 1) {
                                count = 11;
                            } else if (YN == 2) {
                                System.out.println("Byeeeee!");
                                count = 11;
                            } else {
                                System.out.println("You an IDIOT!! Choose the correct option");
                            }
                        } while (YN != 1 && YN != 2);

                    }
                }

                else if (count == 9) {
                    System.out.println("Noone wins");

                    do {

                        System.out.println("Do you wanna play again?");
                        System.out.println("1, Yes\n2, No");

                        try {
                            YN = yn.nextInt();
                        } catch (InputMismatchException EX) {
                            yn.next();
                        }

                        if (YN == 1) {
                            count = 11;
                        } else if (YN == 2) {
                            System.out.println("Byeeeee!");
                            count = 11;
                        }

                        else {
                            System.out.println("You an IDIOT!! Choose the correct option");
                        }
                    } while (YN != 1 && YN != 2);
                }
            }
        } while (YN == 1);
        sin.close();
        yn.close();
    }
}