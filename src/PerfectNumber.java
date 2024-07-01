public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6, soma = 0;
        boolean b = false;

        if (n == 0){
            System.out.println(b);
        } else{
            for (int i = 1; i<n; i++){
                if(n%i == 0){
                    soma = soma + i;        
                }
            }
            if(soma == n){
                b = true;
            }
            System.out.println(b);
        }
    }
}
