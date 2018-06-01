package parking;

public class ParkingBoy {
	
	public String parkCar(String number, ParkingLot parkingLot) {
		if (parkingLot.getAvailable() == 0) {
			return "No space";
		}
	
		parkingLot.space.put(number, parkingLot.parked++);
		return "Parked";
		
	}
}
