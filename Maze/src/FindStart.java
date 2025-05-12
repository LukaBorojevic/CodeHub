public class FindStart {
    public int[] findStart(int[][] maze)
    {
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                if(maze[i][j]==2)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public boolean findPath (int[][] maze, int startX, int startY)
    {
        if(startX < 0 || startX >= maze.length || startY < 0 || startY >= maze[0].length )
            return false;

        if(maze[startX][startY] == 0 || maze[startX][startY] == 9)
            return false;

        if(maze[startX][startY] == 3)
            return true;

        maze[startX][startY] = 9; // visited

        if(findPath(maze, startX-1, startY) || findPath(maze, startX+1, startY) || findPath(maze, startX, startY-1) || findPath(maze, startX, startY+1)) {
            maze[startX][startY] = 8;
            return true;

        }
        return false;
    }

    public void printMaze(int[][] maze)
    {
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
