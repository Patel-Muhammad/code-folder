
import java.util.*;


public class s1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(12);
        s.push(23);
        s.push(56);
        s.push(66);
        s.push(99);
        s.push(0);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
    }
}
