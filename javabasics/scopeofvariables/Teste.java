package javabasics.scopeofvariables;

class Teste{

    public void m1(String s){
        System.out.print(s);
    }
    
    public void m2(){
        System.out.print(s); não compila com essa linha
    }
}