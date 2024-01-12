public class PrintNull {
    public static void main (String[] args) {
        String[] words = new String[5];
        words[0] = "hello";
        words[2] = "goodbye";

        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                System.out.println([i]);
                words[i] = words[i].toUpperCase();
            }
        }
    }
}
