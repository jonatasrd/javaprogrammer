package useoperators.condition;

class TestandoIfElse {
    public static void main(String[] args) {
        int valor = 100;
        if (valor > 200)
            if (valor < 400)
                if (valor > 300)
                    System.out.println("a");
                else
                    System.out.println("b");
            else
                System.out.println("c");
    }
}