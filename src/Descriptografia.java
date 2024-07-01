public class Descriptografia {
    public static void main(String[] args) {
        String message = "khoor", messagedescriptografada = "";
        int key = 3;
        char[] c = message.toCharArray();

        for(int i=0; i<message.length(); i++){
            char letra = c[i];
            char letraKey = (char) ((letra - 'a' - key + 26) % 26 + 'a');
            messagedescriptografada += letraKey;
        }
        System.out.println((messagedescriptografada));
    }
}
