import java.util.*;

class MinDifferenceInMinutes{
    private int findMinDifference(List<String> tp){
        int min = Integer.MAX_VALUE;
        List<Integer> timeInMinutes = new ArrayList<>();

        //converting time into integers
        for(String time : tp){
            int hours = (10 * (time.charAt(0) - '0') + (time.charAt(1) - '0'));  //taking hours from string
            int minutes = (10* (time.charAt(3)-'0')+(time.charAt(4) - '0')); //taking minutes from string
            timeInMinutes.add(60*hours + minutes); //calculating total minutes and adding them into list
        }

        Collections.sort(timeInMinutes);  // sorting list

        int size = timeInMinutes.size();  
        //checking the difference between subsequent elements and returning least difference.
        for(int i = 1 ; i < size ; i++){
            min = Math.min(timeInMinutes.get(i) - timeInMinutes.get(i-1), min);
        }
        //checking first and last elements in list to satisfy the edge case
        min = Math.min(min, 1440 - timeInMinutes.get(size-1) - timeInMinutes.get(0));
        return min;
    }
    public static void main(String args[]){
        List<String> timePoints = new ArrayList<>();
        timePoints.add("01:01");
        timePoints.add("02:01");
        timePoints.add("03:00");

        MinDifferenceInMinutes obj = new MinDifferenceInMinutes();
        int difference = obj.findMinDifference(timePoints);

        System.out.println("the minimum difference between in minutes of any given two time is "+ difference + " minutes");
    }
}