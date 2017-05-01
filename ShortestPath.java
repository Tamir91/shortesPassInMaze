package Examin;

/**
 * This method recive array and found length shortes pass from left upper corner to right downer corner of this array. When
 * all numbers in cells in pass in growing order.
 * 
 * @author (Tamir Yurovskiy) 
 * @version 20/03/13
 */
public class ShortestPath
{
    public static int shortP(int[][] mat)
    {
        return shortP(mat,0, 0, 1);
    }

    /*This recursive method with backtracking.
     *@param int[][] mat - aray
     *       int x - koordinat x
     *       int y - koordinat y
     *       int path - distance from start
     *@return path - shortes pass from left upper corner to right downer corner.
     */
    
    private static int shortP(int[][] mat, int x, int y, int path)
    {
        if(x == mat.length - 1 && y == mat[0].length - 1)
        {
            System.out.println(path);
            return path;
        }

        if(x < mat.length - 1 && mat[x][y] < mat[x + 1][y])
        {
            path +=1;
            System.out.println(mat[x][y]);
            return shortP(mat, x + 1, y, path);
        }
        else if(y < mat[0].length - 1 && mat[x][y] < mat[x][y + 1])
        {
            path +=1;
            System.out.println(mat[x][y]);
            return shortP(mat, x, y + 1, path);
        }
        else if(x > 0 && mat[x][y] < mat[x - 1][y])
        {
            path +=1;
            System.out.println(mat[x][y]);
            return shortP(mat, x - 1, y, path);
        }else if(y > 0 && mat[x][y] < mat[x][y - 1])
        {
            path +=1;
            System.out.println(mat[x][y]);
            return shortP(mat, x, y - 1, path);
        }
        return path;

    }

    public static void main(String[] args) {
        int [][] mat ={{3,13,15,28,30},
                       {40,51,52,29,30},
                       {28,10,53,54,30},
                       {53,12,55,53,60},
                       {70,62,56,20,80},
                       {80,81,90,95,100}};
        shortP(mat);
    }

}

