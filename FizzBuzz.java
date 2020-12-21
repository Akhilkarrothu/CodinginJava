import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args){
        int n=15;
        List<String> result = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%5==0 && i%3==0)
                result.add("FizzBuzz");
            else if(i%5==0)
                result.add("Buzz");
            else if(i%3==0)
                result.add("Fizz");
            else
                result.add(Integer.toString(i));
        }
        System.out.println(result);
    }
}
