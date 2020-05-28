package omaar.metro.breadthfirstsearch;

import java.util.*;
import java.util.List;

/**
 * @author Omar Raed 
 *
 *A class that calculates the path between two stations using Breadth First Search Algorithm
 */
public class BreadthFirstSearch {

    //an empty Stations Queue that will holds stations to visit
    public Queue<TreeNode> stationsQueue = new LinkedList<>();

    //an empty String list that will holds all the visited stations
    public List<Integer> visitedStations = new ArrayList<>();

    //a flag that indicates if the algorithm found a solution
    private boolean isSolved = false;

    //a Tree that will hold the final node
    private TreeNode finalTreeNode;

    /**
     * A method called to explore (Visit) a tree node searching for end station
     */
    private void explore(TreeNode treeNode, int endStation) {

        //check is this station is the end station
        if (treeNode.getStation().isEndStation(endStation)) {

            //set the isSolved flag to true
            isSolved = true;

            //set the final tree node to this one
            finalTreeNode = treeNode;

            return;

        }

        //loop for all neighbour stations for this station
        for (int i = 0; i < treeNode.getStation().neighboursAvailable(); i++) {

            //get the i neighbour station
            MetroStation metroStation = new MetroStation(treeNode.getStation().getNeighbourStations()[i]);

            //continue for loop if this station is already visited
            if (metroStation.isVisited(visitedStations))
                continue;

            //if not visited create a new Tree Node and add it to the Queue
            stationsQueue.add(new TreeNode(metroStation, treeNode));

            //add this station to the visited stations
            visitedStations.add(metroStation.getStationCode());
        }

    }

    /**
     * Method called to find a solution using Breadth First Search algorithm
     */
    public Stack<MetroStation> runBreadthFirstSearch(int startStation, int endStation) {

        //create a new Station (root station)
        MetroStation rootStation = new MetroStation(startStation);

        //create a new tree node and add it to the queue (root tree)
        TreeNode root = new TreeNode(rootStation);
        stationsQueue.add(root);

        //add this station to the visited list
        visitedStations.add(rootStation.getStationCode());

        //loop till the end station is reached
        while (!isSolved) {
            //visit the first station in the queue
            explore(Objects.requireNonNull(stationsQueue.poll()), endStation);
        }

        //initialize a stack of Stations that will holds the solution path
        Stack<MetroStation> stationsPath = new Stack<>();

        //add the final station to the path stack
        stationsPath.add(finalTreeNode.getStation());

        //loop till the tree node has no parent (reach the root node)
        while (finalTreeNode.getParent() != null) {

            //get the parent tree
            finalTreeNode = finalTreeNode.getParent();

            //add this station to the path stack
            stationsPath.add(finalTreeNode.getStation());
        }

        //return the result in stack
        return stationsPath;

    }
}
