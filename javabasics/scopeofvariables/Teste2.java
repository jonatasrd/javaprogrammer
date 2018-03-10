package javabasics.scopeofvariables;

class Teste2{

    static public String s;

    public static void main(String[] args) {
        System.out.print(s);
    }

    public void m(String s){
        s = s; //permitido porem não atribui a variavel de instancia
    }
}