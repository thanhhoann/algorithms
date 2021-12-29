public class Dijkstra {
     public static void dijkstra(int[][] graph, int source) {
          int count = graph.length;
          boolean[] visited_vertices = new boolean[count];
          int[] distance = new int[count];

          for (int i = 0; i < count; i++) {
               visited_vertices[i] = false;
               distance[i] = Integer.MAX_VALUE;
          }

          distance[source] = 0;

          for (int i = 0; i < count; i++) {
               // update the distance between NEIGHBOURING vertex and SOURCE vertex
               int u = find_minDistance(distance, visited_vertices);
               visited_vertices[u] = true;

               // update all the NEIGHBOURING vertices' distances
               for (int v = 0; v < count; v++) {
                    if (!visited_vertices[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                         distance[v] = distance[u] + graph[u][v];
                    }
               }
          }

          for (int i = 0; i < distance.length; i++)
               System.out.println(String.format("%s -> %s | d = %s", source, i, distance[i]));

     }

     private static int find_minDistance(int[] distance, boolean[] visited_vertices) {
          int minDistance = Integer.MAX_VALUE;
          int minDistance_vertex = -1;

          for (int i = 0; i < distance.length; i++) {
               if (!visited_vertices[i] && distance[i] < minDistance) {
                    minDistance = distance[i];
                    minDistance_vertex = i;
               }
          }

          return minDistance_vertex;
     }

     public static void main(String[] args) {
          int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
                    { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 },
                    { 0, 0, 0, 1, 0, 1, 0 } };
          Dijkstra.dijkstra(graph, 0);
     }
}
