
public class XO_AI {

    XOperation xo;
    public void operation(XOperation XO) {
        xo = XO;
    }
    

    char[] PlayerAns = { '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0' };
    int[] cnt = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    char AIans = '1';
    int i = 0;

    public void PlayerMove(char ans) {
        PlayerAns[i] = ans;
        i++;
    }

    public char AImove(int count) {
        char ans = '\0';
        cnt[count] = count;
        int ran = 1;
        if (ran == 1) {
            if (cnt[1] == 1) {
                ans = xo.Choice('1', count);
            }
            if (cnt[3] == 3) {
                if (PlayerAns[0] == '2') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('7', count);
                    else {
                        if (PlayerAns[1] == '4') {
                            if (cnt[7] != 7)
                                ans = xo.Choice('9', count);
                            else {
                                if (PlayerAns[2] == '8')
                                    ans = xo.Choice('5', count);
                                else
                                    ans = xo.Choice('8', count);
                            }
                        } else if (PlayerAns[1] != '4') {
                            ans = xo.Choice('4', count);
                        }
                    }
                }
                if (PlayerAns[0] == '3') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('9', count);
                    else {
                        if (PlayerAns[1] == '5') {
                            if (cnt[7] != 7)
                                ans = xo.Choice('7', count);
                            else {
                                if (PlayerAns[2] == '8')
                                    ans = xo.Choice('4', count);
                                else
                                    ans = xo.Choice('8', count);
                            }
                        } else if (PlayerAns[1] != '5') {
                            ans = xo.Choice('5', count);
                        }
                    }
                }
                if (PlayerAns[0] == '4') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('3', count);
                    else {
                        if (PlayerAns[1] == '2') {
                            if (cnt[7] != 7)
                                ans = xo.Choice('9', count);
                            else {
                                if (PlayerAns[2] == '6')
                                    ans = xo.Choice('5', count);
                                else
                                    ans = xo.Choice('6', count);
                            }
                        } else if (PlayerAns[1] != '2') {
                            ans = xo.Choice('2', count);
                        }
                    }
                }
                if (PlayerAns[0] == '5') {
                    // write
                }
                if (PlayerAns[0] == '6') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('5', count);
                    else {
                        if (PlayerAns[1] == '9') {
                            if (cnt[7] != 7)
                                ans = xo.Choice('3', count);
                            else {
                                if (PlayerAns[2] == '2')
                                    ans = xo.Choice('7', count);
                                else
                                    ans = xo.Choice('2', count);
                            }
                        } else if (PlayerAns[1] != '9') {
                            ans = xo.Choice('9', count);
                        }
                    }
                }
                if (PlayerAns[0] == '7') { // Player makes first move
                    if (cnt[5] != 5)
                        ans = xo.Choice('9', count); // AI makes second move
                    else {
                        if (PlayerAns[1] == '5') { // Player makes second move
                            if (cnt[7] != 7)
                                ans = xo.Choice('3', count); // AI makes third move
                            else { 
                                if (PlayerAns[2] == '6') 
                                    ans = xo.Choice('2', count); // AI makes third move
                                else
                                    ans = xo.Choice('6', count); // AI makes third move
                            }
                        } else if (PlayerAns[1] != '5') { // Player makes second move
                            ans = xo.Choice('5', count);
                        }
                    }
                }
                if (PlayerAns[0] == '8') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('5', count); // AI makes second move
                    else {
                        if (PlayerAns[1] == '9') { // Player makes second move
                            if (cnt[7] != 7)
                                ans = xo.Choice('7', count); // AI makes third move
                            else { 
                                if (PlayerAns[2] == '3') 
                                    ans = xo.Choice('4', count); // AI makes third move
                                else
                                    ans = xo.Choice('3', count); // AI makes third move
                            }
                        } else if (PlayerAns[1] != '9') { // Player makes second move
                            ans = xo.Choice('9', count);
                        }
                    }
                }
                if (PlayerAns[0] == '9') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('3', count); // AI makes second move
                    else {
                        if (PlayerAns[1] == '2') { // Player makes second move
                            if (cnt[7] != 7)
                                ans = xo.Choice('7', count); // AI makes third move
                            else { 
                                if (PlayerAns[2] == '5') // Player makes third move
                                    ans = xo.Choice('4', count); // AI makes third move
                                else
                                    ans = xo.Choice('5', count); // AI makes third move
                            }
                        } else if (PlayerAns[1] != '2') { // Player makes second move
                            ans = xo.Choice('2', count); // AI makes third move
                        }
                    }
                }
            }
        }
        if (ran == 2) {
            if (cnt[1] == 1) {
                ans = xo.Choice('2', count);
            }
            if (cnt[3] == 3) {
                if (PlayerAns[0] == '2') {
                    if (cnt[5] != 5)
                        ans = xo.Choice('7', count);
                    else {
                        if (PlayerAns[1] == '4') {
                            if (cnt[7] != 7)
                                ans = xo.Choice('9', count);
                            else {
                                if (PlayerAns[2] == '8')
                                    ans = xo.Choice('5', count);
                                else
                                    ans = xo.Choice('8', count);
                            }
                        } else if (PlayerAns[1] != '4') {
                            ans = xo.Choice('4', count);
                        }
                    }
                }
                if (PlayerAns[0] == '3') {
                    // write
                }
                if (PlayerAns[0] == '4') {
                    // write

                }
                if (PlayerAns[0] == '5') {
                    // write
                }
                if (PlayerAns[0] == '6') {
                    // write
                }
                if (PlayerAns[0] == '7') { // Player makes first move
                    // write
                }
                if (PlayerAns[0] == '8') {
                    // write
                }
                if (PlayerAns[0] == '9') {
                    // write
                }
            }
        }
        return ans;
    }
}
