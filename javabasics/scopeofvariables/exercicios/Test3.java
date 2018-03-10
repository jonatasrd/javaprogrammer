package javabasics.scopeofvariables.exercicios;

class Test3{

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            System.out.println(i);
        }
        int i = 15;
        System.out.println(i);
    }
}

//imprime de 0 a 19 e then 15