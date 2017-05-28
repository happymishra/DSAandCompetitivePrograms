/*
    https://www.codechef.com/SNCKPA17/problems/TEAMFORM
    
There are n people who want to take part in SnackDown. In the competition in this problem, a team should 
consist of exactly two people (as opposed to the real contest, where single-member teams are allowed). Of course, 
a person can only participate in a single team. Out of these, 2 * m people have already formed their teams, i.e. 
there are m teams already formed. The remaining people want to participate and make teams amongst themselves. 
Can you please tell whether it is possible to divide them into teams so that all the n people can participate?

Input
    The first line of the input contains an integer T denoting the number of test cases. The description of T 
    test cases follows.

    The first line of each test case contains two space separated integers n, m.

    The i-th of the next m lines contains two space separated integers ui, vi denoting that the pair of people ui, 
    and vi have decided to form a team.

Output
    For each test case, output "yes" or "no" (without quotes) corresponding to the answer of the problem.

Constraints
    1 ≤ T ≤ 100
    2 ≤ n ≤ 100
    1 ≤ m ≤ n / 2
    1 ≤ ui, vi ≤ n

    The m already formed teams will be valid.

Example
    Input
        4
        2 1
        1 2
        4 1
        1 3
        5 2
        1 2
        4 5
        5 1
        1 4

    Output
        yes
        yes
        no
        no
    Explanation

        Example 1. Persons 1 and 2 have already formed the team. No other person is left. So, the answer is yes.

        Example 2. Persons 1 and 3 have already formed the team. Persons 2 and 4 can form their own team. No other person is left. So, the answer is yes.

        Example 3. Persons 1 and 2 have already formed the team. Persons 4 and 5 have also formed their own team. 
        Only person 3 is left. A single person can't form a team. So, the answer is no.

        Example 4. Persons 1 and 4 have already formed the team. Persons 2, 3 and 5 cannot all participate, 
        because at least one person will be left out. So, the answer is no.
*/

import java.io.*;

class SnakeForm {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int noOfCases = Integer.parseInt(br.readLine());
        String [] output = new String[noOfCases];

        for(int i = 0; i < noOfCases; i++) {
            String [] totalPeopleAndTeams = br.readLine().split(" ");

            int totalPeople = Integer.parseInt(totalPeopleAndTeams[0]);
            int totalFormedTeams = Integer.parseInt(totalPeopleAndTeams[1]);

            for(int j = 0; j < totalFormedTeams; j++) {
                String a = br.readLine();
            }

            if((totalPeople - totalFormedTeams*2) % 2 == 0) {
                output[i] = "yes";
            } else {
                output[i] = "no";
            }
        }

        for(int i = 0; i < noOfCases; i++) {
            System.out.println(output[i]);
        }
    }
}
