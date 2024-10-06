package flood_fill;

public class Solution {

    public static void main(String[] args) {
        int [][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        floodFill(image, 1, 1, 2);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];
        
        if (originalColor == color) return image;

        floodFillDFS(image, sr,  sc,  color, originalColor);
        return image;
    }

    private static void floodFillDFS(int[][] image, int sr, int sc, int color, int originalColor) {
        if(sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1 || originalColor != image[sr][sc])
            return;

        image[sr][sc] = color;

        floodFillDFS(image, sr - 1, sc, color, originalColor); //up
        floodFillDFS(image, sr + 1, sc, color, originalColor); //down
        floodFillDFS(image, sr, sc - 1, color, originalColor); //left
        floodFillDFS(image, sr, sc + 1, color, originalColor); //right
    }
}
