package arrays.multidimensional;

class WeirdArray{
    public static void main(String[] args) {
        int [][] weird = new int[2][];

        weird[0] = new int[20];
        weird[1] = new int[10];

        for(int i = 0; i < weird.length; i++){
            System.out.println(weird[i].length);
        }
    }
}