/*Create a class Player with below attributes:

playerId - int
playerName - String
runs - int
playerType - String
matchType - String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods - findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.

findPlayerWithLowestRuns method:
This method will take array of Player objects and a String value as input parameters.
The method will return the least runs of the Player from array of Player objects for the given player type.
(String parameter passed). If no Player with the above condition are present in array of Player objects,
then the method should return 0.

findPlayerByMatchType method:
This method will take array of Player objects and String value as input parameters and return the array of Player objects
belonging to the match type passed as input parameter in Descending order of playerId.
If no Player with the above condition are present in the array of Player objects, then the method should return null.

Note : No two Players will have the same playerId and runs.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findPlayerWithLowestRuns  method - The main method should print the returned runs as it is
if the returned value is greater than 0 or it should print "No such player".

Eg: 25
where 25 is the lowest runs of the Player.

For findPlayerByMatchType method - The main method should print the playerId from the returned Player array for each
Player if the returned value is not null.
If the returned value is null then it should print "No Player with given matchType".


Eg:
13
11
where 13 and 11 are the playerId's.

Before calling these static methods in main, use Scanner object to read the values of four Player
objects referring attributes in the above mentioned attribute sequence.
Next, read the value of two String parameter for capturing player type and match Type.

Consider below sample input and output:

Input1:
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day

Output:
67
14
11


Input2:
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
District
T20


Output:
No such player
No Player with given matchType

*/

package IPA;

import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    //constructor
    Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    //getters
    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    //setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

class PlayerSolution {
    //findPlayerWithLowestRuns
    static int findPlayerWithLowestRuns(Player[] player, String playerType) {
        int minRuns = Integer.MAX_VALUE;
        for (int i = 0; i < player.length; i++) {
            if (player[i].getPlayerType().equalsIgnoreCase(playerType)) {
                if (player[i].getRuns() < minRuns) {
                    minRuns = player[i].getRuns();
                }
            }
        }
        if (minRuns != Integer.MAX_VALUE) {
            return minRuns;
        } else {
            return 0;
        }
    }

    //findPlayerByMatchType
    static Player[] findPlayerByMatchType(Player[] player, String matchType) {
        int count = 0;
        for (int i = 0; i < player.length; i++) {
            if (player[i].getMatchType().equalsIgnoreCase(matchType)) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Player[] newArr = new Player[count];
        int index = 0;
        for (int i = 0; i < player.length; i++) {
            if (player[i].getMatchType().equalsIgnoreCase(matchType)) {
                newArr[index] = player[i];
                index++;
            }
        }
        Arrays.sort(newArr, Comparator.comparingInt(Player::getPlayerId).reversed());
        return newArr;
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            int playerId = Integer.parseInt(sc.nextLine());
            String playerName = sc.nextLine();
            int runs = Integer.parseInt(sc.nextLine());
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }
        String playerType=sc.nextLine();
        String matchType=sc.nextLine();

        int result=findPlayerWithLowestRuns(players, playerType);
        if(result>0){
            System.out.println(result);
        }else{
            System.out.println("No such player");
        }

        Player[] newArr=findPlayerByMatchType(players, matchType);
        if(newArr==null){
            System.out.println("No Player with given matchType");
        }
       else{
            for(int i=0; i<newArr.length;i++){
                System.out.println(newArr[i].getPlayerId());
            }
        }
    }
}
