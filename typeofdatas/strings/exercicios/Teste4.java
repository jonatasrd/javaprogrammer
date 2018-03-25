package typeofdatas.strings.exercicios;

class Teste4{
    String empty;
    public static void main(String[] args) {
        String full = "Welcome " + empty;
        System.out.println(full);
    }
}

//nao compila pois o metodo main esta tentando acessar a variavel non static