package useoperators.equality;

class Teste1 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s"+"1";
        System.out.println(s1==s2);
        System.out.println(s1==(""+s2)); //cria um novo objeto que não está no pool pois está concatenando string com literal
    }
}