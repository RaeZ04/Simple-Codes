public class practicaArrays3 {

    public static void main (String [] args){

        int [][] array = new int [4][5];

        array [0] [0] = 15;
        array [0] [1] = 32;
        array [0] [2] = 45;
        array [0] [3] = 16;
        array [0] [4] = 4;

        array [1] [0] = 12;
        array [1] [1] = 43;
        array [1] [2] = 23;
        array [1] [3] = 54;
        array [1] [4] = 33;

        array [2] [0] = 1;
        array [2] [1] = 4;
        array [2] [2] = 57;
        array [2] [3] = 87;
        array [2] [4] = 11;

        array [2] [0] = 31;
        array [2] [1] = 10;
        array [2] [2] = 5;
        array [3] [3] = 44;
        array [3] [4] = 95;

        for (int i=0; i<4; i++){

            for(int z=0; z<5; z++){

                System.out.print(array[i][z] + " ");

            }

        }

    }
    
}
