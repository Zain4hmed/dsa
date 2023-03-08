import java.util.ArrayList;

/* *
* [1 1 0 0]
* [1 1 0 0]
* [0 0 1 1]
* [0 0 1 1]
*
* [1 1 1 0]
* [1 0 0 0]
* [0 0 1 0]
*  */
public class IslandProblemLeetCode {

    public static int numIslands(char[][] grid) {
        ArrayList<Character> alRows[]  = new ArrayList[grid.length];
        for(int i = 0 ; i < grid.length ; i++){
            alRows[i] = new ArrayList<Character>();
            for (int j = 0 ; j < grid[0].length ; j++) {
                alRows[i].add(grid[i][j]);
            }
        }

        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){
                System.out.print(alRows[i].get(j)+" , ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},
                         {'1','1','0','1','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'}};
        numIslands(grid);
    }
}
