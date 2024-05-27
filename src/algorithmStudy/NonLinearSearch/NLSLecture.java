package algorithmStudy.NonLinearSearch;

import java.util.*;

class Node{
    String name;
    List<Node> links;
    boolean visited;


    public Node(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
    void link(Node node){
        links.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void visit(){
        this.visited = true;
    }
    boolean isVisited(){
        return this.visited;
    }
}
public class NLSLecture {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        a.link(b);
        a.link(d);
        a.link(a);
        a.link(c);
        a.link(e);
        a.link(b);
        a.link(d);
        a.link(a);
        a.link(c);
        a.link(e);
        a.link(b);
        a.link(d);

        Node target = e;
        //DFS stack 사용
        Stack<Node> stack = new Stack<>();
        stack.push(a);
        //BFS queue 사용
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(a);
        while (!stack.isEmpty()) {
//            Node n = queue.poll();
            Node n = stack.pop();
            n.visit();
            System.out.println(n);
            if (n.equals(target)) {
                System.out.println("find"+n);
                break;
            }
            for(Node l : n.links){
                if(l.isVisited()) continue;
                if(stack.contains(l)) continue;
//                queue.offer(l);
                stack.push(l);
            }
//            n.links.stream()
//                    .filter(l->queue.contains(l))
//                    .forEach(queue::offer);
        }
    }
}
