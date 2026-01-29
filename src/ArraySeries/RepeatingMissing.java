import java.util.List;

class RepeatingMissing {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int xor=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                xor ^= grid[i][j];
            }
        }
        for(int i=1;i<=(grid.length * grid.length);i++) {
            xor ^= i;
        }
        //x ^ y = xor

        int rmsb = xor & -xor; //xor & (~xor +1)
        System.out.println("rmsb: " + rmsb);
        int rm0=0, rm1=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if((rmsb & grid[i][j])!=0)
                    rm1 ^= grid[i][j];
                else
                    rm0 ^= grid[i][j];
            }
        } //1,3,2,2
        //rm0 - 1, rm1 - 3^2^2=3
        System.out.println("After grid rm0: " + rm0 + ", rm1: " + rm1);

        for(int i=1;i<=(grid.length * grid.length);i++) {
            if((rmsb & i)!=0)
                rm1 ^= i;
            else
                rm0 ^= i;
        }
        System.out.println("After 1 to n rm0: " + rm0 + ", rm1: " + rm1);
        int repeating=0, missing=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==rm0){
                    repeating = rm0;
                    missing =rm1;
                    break;
                } else if(grid[i][j] == rm1) {
                    repeating = rm1;
                    missing = rm0;
                    break;
                }
            }
        }
        System.out.println("repeating: " + rm1 + ", missing: " + rm0);

        return new int[]{repeating, missing};

    }

    public static void main(String args[]) {
        int[][] grid = {
                {1, 3},
                {2, 2}
        };
        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println("Repeating: " + result[0] + ", Missing: " + result[1]);
//        List<Integer> list = List.of(1,2,3,4,5);
//        list.fin
    }
}
