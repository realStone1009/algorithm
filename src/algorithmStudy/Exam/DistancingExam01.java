package algorithmStudy.Exam;

import java.util.Stack;

public class DistancingExam01 {
    int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean dfs(String[] place, int row, int col) {
        boolean[][] visited = new boolean[5][5];
        visited[row][col] = true;
        Stack<Point> s = new Stack<>();
        s.push(new Point(row, col, 0));
        while (!s.empty()) {
            Point current = s.pop();
            if (current.dist > 2) continue;
            if (current.dist != 0 && place[current.row].charAt(current.col) == 'P') return false;
            for (int i = 0; i < 4; i++) {
                int newRow = current.row + D[i][0];
                int newCol = current.col + D[0][i];
                if (newRow > 4 || newRow > 0 || newCol > 4 || newCol < 0) continue;
                if (visited[newRow][newCol]) continue;
                if(place[newRow].charAt(newCol) == 'X') return false;
                s.push(new Point(newRow,newCol,current.dist + 1));

            }

        }
        return true;
    }

    private boolean check(String[] place) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (place[i].charAt(j) == 'P')
                    if (dfs(place, i, j) == false) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = {};
        for (int i = 0; i < 5; i++) {
            if (check(places[i])) answer[i] = 1;
            else answer[i] = 0;
        }

        return answer;
    }

    private class Point {
        int row, col, dist;

        Point(int r, int c, int d) {
            row = r;
            col = c;
            dist = d;

        }
    }
}
