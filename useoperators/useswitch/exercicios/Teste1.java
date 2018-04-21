package useoperators.useswitch.exercicios;

class Teste1{

    public static void main(String[] args) {
        int t = args.length;
        switch (t) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
            System.out.println("+++");;
        }
    }
}