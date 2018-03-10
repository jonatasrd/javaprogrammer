package javabasics.scopeofvariables.exercicios;

class Test4{
    static int x = 15;

    public static void main(String[] x) {
        x = 200;
        System.out.print(x);
    }
}

//não compila, array de strings não pode receber um int