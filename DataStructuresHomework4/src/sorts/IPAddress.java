package sorts;


public class IPAddress implements Comparable<IPAddress>{
	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	
	public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}
	
	@Override
	public int compareTo(IPAddress address) {
		if(this.ipFrom < address.ipFrom) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return "\"" + this.ipFrom + "\"" + "," + "\"" + this.ipTo + "\"" + "," + "\"" + this.countryCode + "\"" + "," + "\"" + this.countryName + "\"" + "," + "\"" + this.regionName + "\"" + "," + "\"" + this.cityName + "\"" ;
	}
}