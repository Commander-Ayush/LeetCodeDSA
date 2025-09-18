public class ReverseNumberProblem7 {
    //Improvement Left
    public static int reverse(int x) {
        int rev=0;
        if(x >= 0 && x < Math.pow(2, 31)){
            while(x>0){
                int ls = x%10;
                x=x/10;
                rev = (rev*10) + ls;
            }
            return rev;
        }else if( x < 0 && x >= Math.pow(-2, 31)){
            while(x<0){
                int ls = -x%10;
                x=x/10;
                rev = (rev*10) - ls;
            }
            return rev;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(reverse(-98));

    }
}
