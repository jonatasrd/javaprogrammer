package typeofdatas.initializevariables.exercicios;

class Test1 {
    public static void main(String[] args) {
        int age;
        if(args.length > 0) {
            age = Integer.parseInt(args[0]);
        } else {
            System.err.println("???");
        }
        System.out.println(age);
    }
}

//não compila