public class LongestSubstring {

    public static int checkpalindrome(String s,int midpoint1,int midpoint2){
        int i,j;
        i = midpoint1;
        j = midpoint2;
        if(s.length()<1)
            return 0;
        while(i >=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }

    public static void main(String[] args){
        int start = 0,end = 0;
        String s = "abccbadracecar";
        for(int i =0;i<s.length();i++){
            int len1 = checkpalindrome(s,i,i);
            int len2 = checkpalindrome(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start) {
                start = (i - ((len - 1) / 2));
                end = (i + (len / 2));
            }
        }

        s = s.substring(start,end+1);
        System.out.println(s);

    }

}
