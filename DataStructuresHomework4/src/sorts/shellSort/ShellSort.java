package sorts.shellSort;

import sorts.AbstractSort;
import sorts.IPAddress;

public class ShellSort extends AbstractSort{
	
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] addresses) {
		int h = 1;
		while(h < addresses.length/3) {
			h = 3 * h + 1;
		}
		while(h >= 1) {
			for(int i=h; i<addresses.length; i++) {
				for(int j=i; j>=h; j-=h) {
					if(less(addresses[j], addresses[j-h])) {
						swap(addresses, j, j-h);
					} else {
						break;
					}
				}
			}
			h = h / 3;
		}
	}
	
}
