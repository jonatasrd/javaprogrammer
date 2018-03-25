package typeofdatas.garbagecollection.exercicios;

class B{
    
}
class Teste1{
    public static void main(String[] args) {
        B b;
        for(int i = 0;i < 10;i++)
            b = new B();
        System.out.println("end!");
    }
}