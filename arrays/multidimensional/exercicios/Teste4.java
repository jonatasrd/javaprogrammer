package arrays.multidimensional.exercicios;

class Teste4{
    public static void main(String[] args) {
        int[] id = new int[10];
        id[0] = 1.0; //doesn't compile, error: incompatible types: possible lossy conversion from double to int

        int [10][10] tb = new int[10][10]; //doesn't compile, error: tamanho passado na declaracao da variavel
        int [][][] cb = new int[][][]; //doesn't compile, error: array dimension missing. passar pelo menos um tamanho
    }
}