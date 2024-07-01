public class sqrtbabilonico {
    public static void main(String[] args) {
        int n = 100; //Valor teste
        double xn, n0 = n/2, epsilon = 0.001;

        if(n==0 || n==1){
            System.out.println(n);
        } else{ 
            while (true) {
                xn = 0.5*(n0 + n/n0);
                double diferenca = xn - n0;
                diferenca = Math.abs(diferenca);
    
                if (diferenca < epsilon){
                    break;
                }
                n0 = xn;
            }
            System.out.println(n0);
        }
    }
}
