
public class ReverseString {

    public static void main(String[] args) {
        String A = reverseString("Hello World!");
        System.out.println(A);
    }

    public static String reverseString(String A) {
        A = A.trim();
        String[] words = A.split("\\s+"); // Split by one or more spaces
        String reversed = "";

        // Loop backwards
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i != 0) {
                reversed += " ";
            }
        }

        return reversed;
    }

}
