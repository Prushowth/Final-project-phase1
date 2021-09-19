package lockedMe.com;

public class LinearSearch {
	
	 public  int search(String arr[], StringBuffer x){
	        int n = arr.length;
	        for (int i = 0; i < n; i++) {
	            if (arr[i].equals(x.toString())) {
	                return i;
	        }
	        }
	        return -1;
	 }
}

