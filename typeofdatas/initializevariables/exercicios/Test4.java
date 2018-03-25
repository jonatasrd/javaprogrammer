package typeofdatas.initializevariables.exercicios;

class Test4 {
    public static void main(String[] args) {
        boolean array = new boolean[300]; //não compila 
        System.out.println(array[3]);
    }
}

// nao compila, criando array de boolean em uma variavel normal