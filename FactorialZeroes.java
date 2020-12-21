public class FactorialZeroes {
    public static void main(String[] args){
        int n = 25, count = 0;
        while (n > 0) {
            n = n/5;
            System.out.println(n);
            count += n;
        }
        System.out.println(count);
    }
}
