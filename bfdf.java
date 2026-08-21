import java.util.*;

public class GraphTraversal {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    static void BFS(int start) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    static void DFS(int current) {

        visited[current] = true;

        System.out.print(current + " ");

        for (int neighbour : graph.get(current)) {

            if (!visited[neighbour]) {
                DFS(neighbour);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < edges; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        System.out.print("Enter starting node: ");
        int start = sc.nextInt();

        visited = new boolean[vertices];
        BFS(start);

        visited = new boolean[vertices];

        System.out.print("DFS Traversal: ");
        DFS(start);

        sc.close();
    }
}