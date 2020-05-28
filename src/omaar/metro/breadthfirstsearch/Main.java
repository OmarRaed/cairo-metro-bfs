package omaar.metro.breadthfirstsearch;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Omar Raed 
 * 
 * A class to test the Breadth First Search Algorithm
 * 
 */
public class Main {

	public static void main(String[] args) {

		// Initialize a Breadth First Search class
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

		// Initialize Scanner to accept input from user
		Scanner sc = new Scanner(System.in);

		// Accept the start and end stations from the user and close the scanner
		System.out.println("Please enter the Start Station code : ");
		int startCode = sc.nextInt();
		System.out.println("Please enter the end Station code : ");
		int endCode = sc.nextInt();
		sc.close();

		//Print the start and end stations
		System.out.println("Start Station : " + StationsUtil.getStationName(startCode));
		System.out.println("End Station : " + StationsUtil.getStationName(endCode));

		// Search and get the results of the algorithm 
		Stack<MetroStation> stationsPath = breadthFirstSearch.runBreadthFirstSearch(startCode, endCode);

		// Print the stations Number
		System.out.println("\nStations Number : " + stationsPath.size());

		// Loop and print the solution path
		while (!stationsPath.isEmpty()) {
			System.out.println(stationsPath.pop().getStationName());
		}
	}

}
