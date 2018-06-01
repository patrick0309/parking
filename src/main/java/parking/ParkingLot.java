package parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private int size;
	public int parked;
	private Vehicle Parkedvehicle;
	public Map space = new HashMap(); 
	
	public ParkingLot(Integer size) {
		this.size = size;
	}
	
	public int getAvailable() {
		return (size - parked);
	}
	
	
}


