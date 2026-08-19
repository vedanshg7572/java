public class arrr {

    public static void main(String[] args) {

        int[] nums = {1, 232, 33, 456};

        int count = 0;


        // Array ke har number par loop
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];   // Current number
            int digit = 0;       // Digit count

            // Digits count karo
            while (num > 0) {
                num = num / 10;
                digit++;
            }

            // Agar digits even hain to count badhao
            if (digit % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even digit numbers = " + count);
    }
}