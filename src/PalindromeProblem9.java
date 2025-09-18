public class PalindromeProblem9 {
    public static boolean palindrome(int x) {
        int duplicate = x;
        int rev=0;
        if(x>=0){
        while(x!=0) {
            int ls = x%10;
            x=x/10;
            rev = (rev*10) + ls;
        }
            return (rev == duplicate ? true : false);}
        else{
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(palindrome(-121));

    }
}
