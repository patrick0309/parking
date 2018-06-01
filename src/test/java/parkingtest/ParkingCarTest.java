package parkingtest;

import org.junit.Assert;
import org.junit.Test;

import parking.ParkingBoy;
import parking.ParkingLot;
import parking.Vehicle;

public class ParkingCarTest {

	 @Test
	    public void getNumber_test() {
	    	Vehicle car = new Vehicle("aaa");
	    	
	    	Assert.assertEquals("aaa", car.getNumber());
	    }
	    
	    @Test
	    public void create_parking_lot_test() {
	    	ParkingLot parkinglot = new ParkingLot(10);
	    	
	    	Assert.assertEquals(10, parkinglot.getAvailable());

	    }   
	  
	    @Test
	    public void park_car_with_available_lot() {
	    	ParkingLot parkinglot = new ParkingLot(10);
	    	Vehicle car = new Vehicle("aaa");
	    	ParkingBoy boy = new ParkingBoy();

	    	Assert.assertEquals("Parked", boy.parkCar(car.getNumber(), parkinglot));
	    } 
	    
	    @Test
	    public void park_car_without_available_lot() {
	    	ParkingLot parkinglot = new ParkingLot(0);
	    	Vehicle car = new Vehicle("aaa");
	    	ParkingBoy boy = new ParkingBoy();
	    	
	    	Assert.assertEquals("No space", boy.parkCar(car.getNumber(), parkinglot));
	    }   
//	    @Test
//	    public void return_ab_combination_when_input_ab_ba() {
//	    	
////	        String expected = "a";
//	        ArrayList<String> result = new ArrayList<String>();
//	        result.add("ab");
//	        result.add("ba");
//	        System.out.println(Anagrams.of("ab"));
//	        Assert.assertEquals(result, Anagrams.of("ab"));
//	    }
	//    
//	    @Test
//	    public void return_6_elements_when_given_abc() {
//	    	
//	        ArrayList<String> result = new ArrayList<String>();
//	        result.add("abc");
//	        result.add("acb");
//	        result.add("bac");
//	        result.add("bca");
//	        result.add("cab");
//	        result.add("cba");
//	        System.out.println(Anagrams.of("abc"));
//	        Assert.assertEquals(result, Anagrams.of("abc"));
//	    }
	//    
//	    @Test
//	    public void return_24_elements_when_given_abcd() {
//	    	
//	        ArrayList<String> result = new ArrayList<String>();
//	        System.out.println(Anagrams.of("abcd"));
//	        Assert.assertEquals(24, Anagrams.of("abcd").size());
//	        
//	    }
}
