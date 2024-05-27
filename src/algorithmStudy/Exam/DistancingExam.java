package algorithmStudy.Exam;

import java.util.*;

public class DistancingExam {
    class Point{
        Point(int r, int c, int d){
            row = r;
            col = c;
            dist = d;
        }
        int row, col, dist;
    }
    int[][] D = {{1,0},{-1,0},{0,1},{0,-1}};
    boolean bfs(String[] place , int row, int col){
        boolean[][] visited = new boolean[5][5];
        Stack<Point> q = new Stack<>();
        visited[row][col] = true;
        q.push(new Point(row,col,0));
        while(!q.isEmpty()){
            Point curr = q.pop();
            if(curr.dist > 2) continue;
            if(curr.dist !=0 && place[curr.row].charAt(curr.col)=='P') return false;

            for(int i = 0 ; i < 4; i++){
                int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
                if(nr < 0 || nr > 4 || nc < 0 || nc > 4) continue;
                if(visited[nr][nc])continue;
                if(place[nr].charAt(nc)=='X') continue;
                visited[nr][nc] = true;
                q.push(new Point(nr,nc,curr.dist+1));
            }
        }
        return true;
    }
    boolean check(String[] place){
        for (int r =0; r<5;r++){
            for(int c= 0; c<5; c++){
                if(place[r].charAt(c)=='P'){
                   if(bfs(place,r,c)==false) return false;
                }
            }
        }
        return true;
    }
    public int[] solution(String[][] places){
        int[] answer = new int[5];
        for(int i = 0;i <5; i++){
            if (check(places[i])){
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DistancingExam de = new DistancingExam();
        String[][]  str = new String[][]{{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                                         {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                                         {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                                         {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                                         {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};
        ;
        System.out.println(Arrays.toString(de.solution(str)));
    }
}
