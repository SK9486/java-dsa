import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        // int[] nums = {2,4,6,8,5};
        // int tar = 10;
        int[] nums = {25,20,25,30,15,45,5};
        int tar = 50;
        Arrays.sort(nums);
        int p1  = 0;
        int p2 = nums.length -1;
        // for(int a : nums){
        //     System.out.print(a+" ");
        // }
        System.out.println();
        while(p1 < p2 && p1<nums.length && p2<nums.length){
            int sum = nums[p1]+nums[p2];
            // System.out.println("p1 : "+p1);
            // System.out.println("p2 : "+p2);
            // System.out.println("sum : "+sum);
            if(sum == tar){
                System.out.println(nums[p1]+" "+nums[p2]);
                p1++;
                p2--;
            }else if(sum > tar){
                p2--;
            }else{
                p1++;
            }
        }
    }
}