package day2_arrays;

public class BettingGame {

    public static void main(String[] args) {
        String input1 = "WL";
        String input2 = "WWWLLLWWL";
        String input3 = "WLWLLLWWLW";
        String input4 = "WLWLLWW";

        int result1 = bettingGame(input1);
        int result2 = bettingGame(input2);
        int result3 = bettingGame(input3);
        int result4 = bettingGame(input4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static int bettingGame(String result) {
        /*
            Rules ->
                1) Initial balance is 4
                2) For every win, amount is added in bet balance and bet is reset to 1
                3) For every lose, amount is deducted from balance and next bet will be twice of previous
                4) If bet balance < bet amount, then return -1
            Pseudo Code ->
                 Step 0: Initialize 2 variable betBalance -> 4 and betAmount -> 1, and read each character in result and perform the following:
                    Step 0.1: If L -> check if betBalance < betAmount, return -1, else betBalance-- and betAmount *= 2
                    Step 0.2: If W -> betBalance += betAmount, betAmount = 1
         */
        int betBalance = 4;
        int betAmount = 1;
        for(int i=0; i<result.length(); i++) {
            char ch = result.charAt(i);
            if(betBalance < betAmount) return -1;
            else if(ch == 'W') {
                betBalance += betAmount;
                betAmount = 1;
            } else if(ch == 'L') {
                betBalance -= betAmount;
                betAmount *= 2;
            }
        }
        return betBalance;
    }

}
