package typeofdatas.initializevariables.exercicios;

class Test3 {
    public static void main(String[] args) {
        int age;
        if(args.length > 0) {
            age = Integer.parseInt(args[0]);
        } else {
            System.err.println("???");
            return;
        }
        System.out.println(age);
    }
}

//inesperadamente compila ...