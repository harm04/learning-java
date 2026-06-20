/*Question:
Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
*/


package IPA;

import java.util.Scanner;

class Inventory {
    int inventoryId;
    int maxQuantity;
    int currentQuantity;
    int threshhold;

    Inventory(int inventoryId, int maxQuantity, int currentQuantity, int threshhold) {
        this.inventoryId = inventoryId;
        this.maxQuantity = maxQuantity;
        this.currentQuantity = currentQuantity;
        this.threshhold = threshhold;
    }

    int getInventoryId() {
        return inventoryId;
    }

    void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    int getMaxQuantity() {
        return maxQuantity;
    }

    void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    int getCurrentQuantity() {
        return currentQuantity;
    }

    void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    int getThreshhold() {
        return threshhold;
    }

    void setThreshhold(int threshhold) {
        this.threshhold = threshhold;
    }
}


class InventorySolutions {
    public static Inventory[] Replenish(Inventory[] inventory, int limit) {
        int size = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (limit >= inventory[i].getThreshhold()) {
                size++;
            }
        }
        Inventory[] newInventory = new Inventory[size];
        int index = 0;
        for (int i = 0; i < inventory.length; i++) {
            if (limit >= inventory[i].getThreshhold()) {
                newInventory[index] = inventory[i];
                index++;
            }
        }
        return newInventory;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < inventories.length; i++) {
            int inventoryId = Integer.parseInt(sc.nextLine());
            int maxQuantity = Integer.parseInt(sc.nextLine());
            int currentQuantity = Integer.parseInt(sc.nextLine());
            int threshhold = Integer.parseInt(sc.nextLine());
            inventories[i] = new Inventory(inventoryId, maxQuantity, currentQuantity, threshhold);
        }
        int limit = Integer.parseInt(sc.nextLine());
        Inventory[] result = Replenish(inventories, limit);

        for (int i = 0; i < result.length; i++) {
            if (result[i].getThreshhold() > 75) {
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            } else if (result[i].getThreshhold() >= 50) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }
    }
}