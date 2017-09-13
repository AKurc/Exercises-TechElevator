//package com.techelevator;
//
//public class Airplane {
//
//	private String planeNumber;
//    private int totalFirstClassSeats;
//    private int bookedFirstClassSeats = 0;
//    private int totalCoachSeats;
//    private int bookedCoachSeats = 0;
//
//    /**
//     * Creates a new airplane 
//     * @param totalFirstClassSeats Total number of first class seats that can be booked
//     * @param totalCoachSeats Total number of coach seats that can be booked
//     */
//    public Airplane(int totalFirstClassSeats, int totalCoachSeats) {
//        this.totalFirstClassSeats = totalFirstClassSeats;
//        this.totalCoachSeats = totalCoachSeats;            
//    }
//
//    /**
//     * 6-Character Plane Number 
//     * @return planeNumber
//     */
//    public String getPlaneNumber() {
//        return planeNumber;            
//    }
//
//    /**
//     * Number of already booked first class seats 
//     * @return bookedFirstClassSeats
//     */
//    public int getBookedFirstClassSeats() {
//        return bookedFirstClassSeats;            
//    }
//
//    /**
//     * Available number of first class seats 
//     * @return availableFirstClassSeats
//     */
//    public int getAvailableFirstClassSeats() {
//        return bookedFirstClassSeats;
//    }
//
//    /**
//     * Total number of first class seats 
//     * @return totalFirstClassSeats
//     */
//    public int getTotalFirstClassSeats() {
//        return totalFirstClassSeats;        
//    }
//
//    /**
//     * Number of already booked coach seats 
//     * @return bookedCoachSeats
//     */
//    public int getBookedCoachSeats() {
//        return bookedCoachSeats;
//    }
//
//    /**
//     * Available number of coach seats 
//     * @return availableCoachSeats
//     */
//    public int getAvailableCoachSeats() {
//        return totalCoachSeats;
//    }
//
//    /**
//     * Total number of coach seats 
//     * @return totalCoachSeats
//     */
//    public int getTotalCoachSeats() {
//        return totalCoachSeats;
//    }
//
//    /**
//     * Reserves a first class or coach seat. Algorithm checks for reservation possiblity before making reservation. 
//     * @param firstClass True if the reservation is for first class, false for coach
//     * @param totalNumberOfSeats Total number of seats to reserve
//     * @return True if reservation was successful, false otherwise
//     */
//    public boolean Reserve(boolean firstClass, int totalNumberOfSeats) {       
//        if (firstClass) {
//            bookedFirstClassSeats += totalNumberOfSeats;
//            if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
//                return false;
//            }
//        }
//        else {
//            bookedCoachSeats += totalNumberOfSeats;
//            if (totalNumberOfSeats > getAvailableCoachSeats()) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//}
package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass && totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
			bookedFirstClassSeats += totalNumberOfSeats;
			return true;
		}
		else if( !forFirstClass && totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
			bookedCoachSeats += totalNumberOfSeats;
			return true;
		}
		return false;
		
	}

	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	
}
