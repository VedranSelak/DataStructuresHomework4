package sorts.selectionSort;

import sorts.AbstractSort;
import sorts.IPAddress;

public class SelectionSort extends AbstractSort{
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] addresses) {
		for(int i=0; i<addresses.length; i++) {
			int min = i;
			for(int j=i+1; j<addresses.length; j++) {
				if(less(addresses[j],addresses[min])) {
					min = j;
				}
			}
			swap(addresses,i,min);
		}
	}
}
