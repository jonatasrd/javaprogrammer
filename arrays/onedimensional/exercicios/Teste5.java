package arrays.onedimensional.exercicios;

class Teste5{

    public static void main(String[] args) {
        int x[] = new int[3];
        for(x[1]=x.length-1;x[0]==0;x[1]--){
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
    }   

}