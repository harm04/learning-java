/*
Question: 1
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can
have more than one package type. Travel agency and package type combination is unique. All the searches should
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000
*/


package IPA;


import java.util.Scanner;

class TravelAgencies {
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    int getRegNo() {
        return regNo;
    }

    void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    String getAgencyName() {
        return agencyName;
    }

    void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    String getPackageType() {
        return packageType;
    }

    void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    boolean isFlightFacility() {
        return flightFacility;
    }

    void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

class TravelAgencySolution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agency) {
        int maxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < agency.length; i++) {
            if (agency[i].getPrice() > maxPrice) {
                maxPrice = agency[i].getPrice();
            }
        }
        return maxPrice;
    }

    public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] agency, int regNo, String packageType) {
        for (int i = 0; i < agency.length; i++) {
            if (agency[i].getRegNo() == regNo && agency[i].getPackageType().equalsIgnoreCase(packageType) && agency[i].isFlightFacility()) {
                return agency[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgencies[] agencies = new TravelAgencies[4];
        for (int i = 0; i < 4; i++) {
            int regNo = Integer.parseInt(sc.nextLine());
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean flightFacility = Boolean.parseBoolean(sc.nextLine());
            agencies[i] = new TravelAgencies(
                    regNo, agencyName, packageType, price, flightFacility
            );

        }

        int regNo = Integer.parseInt(sc.nextLine());

        String packageType = sc.nextLine();
        int highestPrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPrice);
        TravelAgencies result = agencyDetailsforGivenIdAndType(agencies, regNo, packageType);
        if (result != null) {
            System.out.println(result.getAgencyName() + ":" + result.getPrice());
        } else {
            System.out.println("No agency found");
        }
    }
}
