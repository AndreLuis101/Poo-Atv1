public class Criptografia {
    public static void main(String[] args) {
        String message = "hello", messagecriptografada = "";
        int key = 3;
        char[] c = message.toCharArray();

        for(int i=0; i<message.length(); i++){
            char letra = c[i];
            char letraKey = (char) ((letra - 'a' + key) % 26 + 'a');
            //Transforma a letra em um indice default do java;
            //soma a key a esse indice mantendo ele dentro do intervalo [0,25] do alfabeto;
            //Retorna o indice para um valor de char
            messagecriptografada += letraKey;
        }
        System.out.println((messagecriptografada));
    }
}

