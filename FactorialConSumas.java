public class FactorialConSumas {
    
    // Método para multiplicar dos números usando solo sumas
    public static int multiplicar(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado= resultado+a;
        }
        return resultado;
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = multiplicar(resultado, i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 4;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}