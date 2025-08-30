import java.lang.*;
import java.util.*;

public class array_leaders {
	
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n= arr.length;
        int leader= arr[n-1];
        result.add(leader);
        for(int i = n-2; i>=0; i--){
            if(arr[i]> leader){
                leader=arr[i];
                result.add(leader);
            }
        }
        Collections.reverse(result);
        return result;
    }
}

