package sorts.insertionSort;

import sorts.AbstractSort;
import sorts.IPAddress;

public class InsertionSort extends AbstractSort{
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] addresses) {
		for(int i=0; i<addresses.length; i++) {
			for(int j=i; j>0; j--) {
				if(less(addresses[j], addresses[j-1])) {
					swap(addresses, j, j-1);
				} else {
					break;
				}
			}
		}
	}
}
