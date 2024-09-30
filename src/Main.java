import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5]; // I am lazy so i will use array :P
        for (int i = 0; i < 5; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}