/**
 * LinearSearch
 */
import java.util.*;
public class LinearSearch {

    public void search(List<Integer> list, int num){
        for(int element: list){
            if(element == num){
                System.out.println("The number is present in the list at "+ list.indexOf(element)+" index");
                return;
            }
        }
        System.out.println("The number is not present in the list");
    }

    public static void main(String args[]){
        LinearSearch obj = new LinearSearch();

        List<Integer> list = new ArrayList<>();

        list.add(63);
        list.add(43);
        list.add(6);
        list.add(8);
        list.add(12);
        list.add(9);

        System.out.println("Enter the number to be sorted : ");

        Scanner sc = new Scanner(System.in);

        int ItemToSearch = sc.nextInt();

        obj.search(list, ItemToSearch);


    }
}