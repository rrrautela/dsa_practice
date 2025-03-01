
//1 March 2025
//reverse a string
public class Leet01 {
    public static void reverseString(StringBuilder s) {
        if(s.length() == 0) return;

        char ch  = s.charAt(0);
        s.deleteCharAt(0);
        reverseString(s);
        s.append(ch);
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("hello darkness my old friend");
        reverseString(s);
        System.out.println(s);
    }
}
