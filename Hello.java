import java.util.ArrayList;

class Hello{
    public static void main(String[] args) {
        int n = 7;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        System.out.println(arr);
        int i =0;
        int si = arr.size();
        System.out.println("si : "+si);
        while(arr.size() > 1){
            if(i == 0){
                arr= removeOdd(arr);
                System.out.println(arr);
            }else{
                break;
            }
            i++;
        }
    }
    public static ArrayList<Integer> removeOdd(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            if(i % 2 != 0){
                arr.remove(i);
            }
        }
        return arr;
    }
}