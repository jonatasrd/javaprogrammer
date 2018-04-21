package useoperators.useswitch;

class TestaSwitch{
    public static void main(String[] args) {
        int option = 4;
        switch (option) {
            case 1: System.out.println("1");
            case 2: System.out.println("2");
            default: System.out.println("default"); break;
            case 3: System.out.println("3");
        }
    }
}