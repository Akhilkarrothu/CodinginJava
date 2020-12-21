public class Palindrome {
     static boolean ispalindrome(String num){
        int i = 0, j = num.length()-1;
        while( i < j){
            if(num.charAt(i) != num.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
    int n = -1221;
    String s = Integer.toString(n);
        System.out.println(s);
    if(ispalindrome(s))
        System.out.println("Palindrome");
    else
        System.out.println("Not a Palindrome");

    }
}
