/*

https://www.codechef.com/SNCKQL17/problems/SAMESNAK

Consider a 2d-grid. That is, each cell is identified by (i,j). You have received reports of two snake-sightings on this grid. 
You want to check whether they could be partial sightings of the same snake or not.

Each of the snake sightings correspond to a straight, axis-parallel line segment in the grid, and the starting 
and ending cells for each are given to you. Now consider a graph, where each cell in the 2d-grid is a vertex. 
And there is an edge between 2 vertices if and only if the cells corresponding to these two vertices are consecutive 
cells in at least one of the two snakes. That is, at least in one of the snakes, when you go from one end point to the
other end point, these two cells should occur consecutively.

The two sightings/snakes are said to be same, if both these conditions are satisfied:

The union of the set of cells in the first snake and the set of cells in the second snake, should form a 
connected component in this graph.
No vertex should have degree more than 2 in the graph.
In other words, the induced subgraph on the union set must be a path graph.

Input
	The first line contains a single integer, T, which is the number of testcases. The description of each testcase follows.

	The first line of each testcase contains four integers: X11, Y11, X12, Y12. This represents the fact 
	that the first snake's end points are (X11, Y11) and (X12, Y12).

	The second line of each testcase contains four integers: X21, Y21, X22, Y22. This represents the fact 
	that the second snake's end points are (X21, Y21) and (X22, Y22).
Output
	For each testcase, output "yes" if the snakes are the same, as per the definition given above. Output "no" otherwise.
	Constraints
		1 ≤ T ≤ 10^5
		-109 ≤ Xij,Yij ≤ 10^9

	The two end points of every snake is guaranteed to be either on the same row or on the same column. 
	Thus, the snake occupies all the cells between these cells, including the end points.
	 

Example
	Input:
		4
		2 1 8 1
		11 1 7 1
		2 1 8 1
		11 1 9 1
		2 1 8 1
		3 1 3 -2
		2 1 8 1
		2 1 2 -2
	Output:
		yes
		no
		no
		yes
*/

import java.io.*;
import java.util.*;
 
class SameSnake {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
 
		int noOfCases = stdin.nextInt();
		String output[] = new String[noOfCases];
 
		for(int testcase = 0; testcase < noOfCases; testcase++) {
			int x11 = stdin.nextInt();
			int y11 = stdin.nextInt();
 
			int x12 = stdin.nextInt();
			int y12 = stdin.nextInt();
 
			int x21 = stdin.nextInt();
			int y21 = stdin.nextInt();
 
			int x22 = stdin.nextInt();
			int y22 = stdin.nextInt();
 
 
			if(y11 == y12) {
				if((x11 <= x21 && x12 >= x21) || (x11 <= x22 && x12 >= x22)) {
					if(y21 == y11 && y22 == y11) {
						output[testcase] = "yes";
					} else {
						if(x11 == x21 || x12 == x21) {
							if((y21 == y11 || y22 == y11)) {
								output[testcase] = "yes";
							} else {
								output[testcase] = "no";
							}
						} else {
							output[testcase] = "no";
						}
					}
				} else {
					output[testcase] = "no";
				}
			} else {
				if((y11 <= y21 && y12 >= y21) || (y11 <= y22 && y12 >= y22)) {
					if(x21 == x11 && x22 == x11) {
						output[testcase] = "yes";
					} else {
						if(y11 == y21 || y12 == y21) {
							if((x21 == x11 || x22 == x11)) {
								output[testcase] = "yes";
							} else {
								output[testcase] = "no";
							}
						} else {
							output[testcase] = "no";
						}
					}
				} else {
					output[testcase] = "no";
				}
			}
		}
 
		for(int testcase = 0; testcase < noOfCases; testcase++) { 
			System.out.println(output[testcase]);
		}
	}
} 