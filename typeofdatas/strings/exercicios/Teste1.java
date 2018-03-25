package typeofdatas.strings.exercicios;

class Teste1{
    String msg;
    
    void imprime() {
        if (!msg.isEmpty())
            System.out.println(msg);
        else
                System.out.println("empty");
    }
    public static void main(String[] args) {
        new Teste1().imprime();
    }
}