public class ArrayPairsDivisibleByk_1497 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 };
        // int arr[] = {1,2,3,4,5,6};
        System.out.println(canArrange(arr, 5));
    }

    public static boolean canArrange(int[] arr, int k) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((arr[i] != arr[j]) && (arr[i] + arr[j]) % k == 0) {
                    System.out.println(arr[i] + "" + arr[j]);
                    counter++;
                }
            }
        }

        System.out.println(counter);
        if (counter == arr.length / 2) {
            return true;
        }

        return false;
    }
}
