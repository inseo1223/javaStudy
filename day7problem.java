
public class p1{
    public static void main(String[] args) {
        method5(new int[][]{
            {0, 1, 0, 1},
            {0, 1, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 0}
    });

        method5(new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 1, 1, 1},
        });

        method5(new int[][]{
                {1, 0, 1, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1}
        });

        method5(new int[][]{
                {0, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        });

    }
    static void method5(int arr[][]){
        final int COL = arr.length;
        final int ROW = arr[0].length;

        boolean Stalagmite = false;
        boolean Stalactite = false;
        
        for(int i = 0; i < ROW; i++){
            if(arr[0][i] == 1 && arr[COL-1][i] == 1){
                System.out.println("둘 다");
                return;
            }
            else if(arr[0][i] == 1)
                Stalagmite = true;
            else if(arr[COL-1][i] == 1)
                Stalactite = true;
        }
        // if(Stalagmite && Stalactite)
        //     System.out.println("둘 다");
        if(Stalagmite)
            System.out.println("석순");
        else if(Stalactite)
            System.out.println("종유석");
        else
            System.out.println("아무것도 아님");
        
    }
}