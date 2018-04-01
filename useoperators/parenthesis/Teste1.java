package useoperators.parenthesis;

class Teste1{
    public static void main(String[] args) {
        String result = ("division: " + 15) / 0.0;
        System.out.println(result);
    }
}

//doesnt compile, error: bad operand types for binary operator '/'