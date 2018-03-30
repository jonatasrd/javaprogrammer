package useoperators.operators.exercicios;

class Teste2 {

    public static void main(String[] args) {
        //System.out.println(3 / 0); //java.lang.ArithmeticException: / by zero
        System.out.println(3 / 0.0); //Infinity
        System.out.println(3.0 / 0); //Infinity
        System.out.println(-3.0 / 0); //-Infinity
        System.out.println(3.0F / 0); //Infinity
    }
}