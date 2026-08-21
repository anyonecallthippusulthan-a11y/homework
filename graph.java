import java.util.*;

 class GraphRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        int[][] matrix = new int[vertices][vertices];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("Enter edges:");

        for (int i = 0; i < edges; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            matrix[v][u] = 1;

            list.get(u).add(v);
            list.get(v).add(u);
        }

        System.out.println("\nAdjacency Matrix:");

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nAdjacency List:");

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int node : list.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}