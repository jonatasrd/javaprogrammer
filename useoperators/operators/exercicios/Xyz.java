package useoperators.operators.exercicios;

class Xyz {
    public static void main(String[] args) {
        int y; //error: variable y might not have been initialized
        for (int x = 0; x < 10; ++x) {
            y = x % 5 + 2;
        }
        System.out.println(y);
    }
}

// doesnt compile, error: variable y might not have been initialized