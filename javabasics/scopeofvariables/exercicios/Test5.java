package javabasics.scopeofvariables.exercicios;

class Test5{
    static int i = 3;

    public static void main(String[] a) {
        for(new Test5().i = 10; new Test5().i < 100; new Test5().i++){
            System.out.println(i);
        }
    }
}

//compila e imprime de 10 a 99
//Isso porque o acesso à variável estática pode ser feito através da instância da classe, 
//sou diretamente caso seja uma variável estática sendo acessada por um método estático.”

