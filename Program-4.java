Input:

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            System.out.println(i + ": " + count);
        }
    }
}


Output:

1: 11
2: 8
3: 4
4: 4
5: 3
6: 2
7: 0
8: 1
9: 1
