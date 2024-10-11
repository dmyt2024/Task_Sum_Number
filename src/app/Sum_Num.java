package app;

import java.util.Arrays;
import java.util.Random;

public class Sum_Num {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100_000) + 11;
        System.out.println("Рандомне число: " + num);

        int num_len = String.valueOf(Math.abs(num)).length();
        int temp = num;
        int sum = 0;
        int[] nums = new int[num_len];

        for (int i =  num_len-1; i > -1; i--) {
            nums[i] = temp % 10;
            temp -= (temp % 10);
            temp /= 10;
            sum += nums[i];
            System.out.println(temp);


        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Сума числа: " + sum);
    }
}
