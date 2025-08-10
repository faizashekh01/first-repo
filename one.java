class one {
    public static void main(String a[]) {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 5;
        nums[3] = 8;

        // Using enhanced for loop to print each element in the array
        for (int n : nums) {
            System.out.println(n);
        }
        
        System.out.println();  // This will print an empty line
    }
}
