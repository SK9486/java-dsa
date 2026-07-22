public class Main{
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int p1 = 0;
        int p2 = arr.length -1;
        int maxArea = Integer.MIN_VALUE;
        while(p1<=p2){
            int breath = p2 - p1;
            System.out.println("breath : "+breath);
            int height = Math.min(arr[p1], arr[p2]);
            System.out.println("height : "+height);
            int area = breath * height;
            if(area > maxArea){
                maxArea = area;
            }
            System.out.println("area : "+area);
            System.out.println("max Area : "+maxArea);
            if(arr[p2] < arr[p1]){
                p2--;
            }else{
                p1++;
            }
        }
    }
}