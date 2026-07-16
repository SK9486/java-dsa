import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        String str = "-4--5";
        int shift = 1;
        boolean toShift = shift == 0 ? false : true;
        int[] nums = new int[2];
        char[] oprs = new char[3];
        int i =0;
        int j = 0;
        String num = "";
        for(char ch:str.trim().toCharArray()){
            if(Character.isDigit(ch)){
                num += ch;
            }else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){
                oprs[j++] = ch;
                if(num != ""){
                    System.out.println("num : "+num);
                    nums[i++] = Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if(num != ""){
            nums[i++] = Integer.parseInt(num);
            num ="";
        }
        int a = nums[0];
        int b = nums[1];
        if(j == 1){
            System.out.println("j ===1");
            System.out.println(shiftAndResult(oprs[0], a,b, toShift));
        }else if(j == 2){
            System.out.println("j == 2");
            if(str.charAt(0) == oprs[0]){
                if(oprs[0] == '-'){
                    a = -a;
                }
                System.out.println(shiftAndResult(oprs[1],a,b, toShift));
            }else{
                if(oprs[1] == '-'){
                    b = -b;
                }
                System.out.println(shiftAndResult(oprs[0], a,b, toShift));
            }
        }else{
            System.out.println("j == 3");
            if(oprs[0] == '-'){
                a = -a;
            }
            if(oprs[2] == '-'){
                b = -b;
            }
            System.out.println(shiftAndResult(oprs[1], a,b, toShift));
        }
    }

    public static int shiftAndResult(char opr,int a,int b,boolean toShift){
        if(toShift){
            if(opr == '+'){
                opr = '-';
            }else if(opr == '-'){
                opr = '+';
            }else if(opr == '*'){
                opr = '/';
            }else{
                opr = '*';
            }
        }
        if(opr == '+'){
            return a + b;
        }else if(opr == '-'){
            return a - b;
        }else if(opr == '*'){
            return a * b;
        }else{
            return a / b;
        }
    }
}