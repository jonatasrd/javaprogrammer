package javabasics.scopeofvariables.exercicios;

class Test1{

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            System.out.print(i);
        }
        System.out.print(i);
    }
}

//não compila