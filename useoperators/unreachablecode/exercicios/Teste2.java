package useoperators.unreachablecode.exercicios;

class B{
    final boolean valor = false;
}

class Teste2{
    public static void main(String[] args) {
        B b = new B();
        if(b.valor = true){
            System.out.println("uhu true");
        }
    }
}