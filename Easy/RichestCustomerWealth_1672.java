public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(arr));
    }
    
    public static int maximumWealth(int[][] accounts) {
        int money[] = new int[accounts.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            money[i] = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                money[i] += accounts[i][j];
            }
        }

        for (int i = 0; i < money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
        }

        return max;
    }
}
