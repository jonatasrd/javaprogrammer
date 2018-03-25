package typeofdatas.strings.exercicios;

class Teste1{
    
    void imprime() {
        String msg;
        if (!msg.isEmpty())
            System.out.println(msg);
        else
                System.out.println("empty");
    }
    public static void main(String[] args) {
        new Teste1().imprime();
    }
}