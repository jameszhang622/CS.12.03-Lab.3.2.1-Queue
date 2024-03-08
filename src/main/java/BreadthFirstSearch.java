
public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {

        // Create a Queue and add the first node (0) to it. Use your Queue class that you just created!
        CISQueue<Integer> queue = new CISQueue<Integer>(0);

        // Create a visited array. This array will track whether we have visited a specific node.
        int length = graph.length;
        boolean[] visited = new boolean[length];

        // Create a bfs path array and a bfs path index. This array will track the order that the nodes were visited.
        int[] bfsPath = new int[length];
        int bfsPathIndex = 0;

        // Add the first node (0) to the queue. --> done in constructor

        // Record the first node (0) as visited.
        visited[0] = true;

        // Time to traverse the graph! While the queue is not empty ...

        // Dequeue (poll) the queue and store this value in a variable called currentNode.

        // Record this node as visited.

        // Add this node to the path and update the path index.

        // Obtain an array of this node's neighbouring/adjacent nodes.

        // Explore the current nodes neighbouring nodes. For each neighbouring node ...

        // If a neighbour hasn't been visited before ...

        // Record the neighbour as visited.

        // Add the neighbour to the queue.

        while (!queue.isEmpty()) {
            int currentNode = queue.dequeue();
            bfsPath[bfsPathIndex++] = currentNode;
            int[] neighbors = graph[currentNode];
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.enqueue(neighbor);
                }
            }
        }

        // Return bfs path.
        return bfsPath;
    }
}