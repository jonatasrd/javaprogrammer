package typeofdatas.readwritefields.exercicios;

class B{
    int c;
    void c(int c) {
        c = c;
    }
}
class Teste1 {
    public static void main(String[] args) {
        B b = new B();
        b.c = 10;
        System.out.println(b.c);
        b.c(30);
        System.out.println(b.c);
    }
}