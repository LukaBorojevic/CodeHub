//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0},
                {2, 1, 1, 0},
                {0, 0, 1, 3},
                {0, 0, 0, 0}
        };

        FindStart solver = new FindStart();
        int[] start = solver.findStart(maze);
        if(start != null) {
            solver.printMaze(maze);
            System.out.println("Start: " + start[0] + ", " + start[1]);
            if(solver.findPath(maze, start[0], start[1])) {
                solver.printMaze(maze);
                System.out.println("Path found!");
            } else {
                System.out.println("Path not found!");
            }
            solver.printMaze(maze);
        }
    }
}