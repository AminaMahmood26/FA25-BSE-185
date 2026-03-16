public class Seat{
	String seatID;
	SeatType seatType;
	String row;
	boolean isAvailable=true;
	static int counter=1;

	Seat(SeatType type, String row){
		seatID=row+String.format("%02d",counter++);
		this.seatType=type;
		this.row=row;
	}
	public String getSeatID(){
	return seatID;
	}
	public SeatType getSeatType(){
	return seatType;
	}
	public String getRow(){
	return row;
	}
	public boolean isAvailable(){
	return isAvailable;
	}
	public void bookSeat(){
		if (isAvailable){
		    isAvailable=false;
		    System.out.println("Seat " + seatID +" booked successfully.");
		}
		else{
		    System.out.println("Seat already booked.");
		}
	}
	public String toString(){
		return String.format("%s %s %s %.2f %b", seatID,seatType,row,seatType.price,isAvailable);
	}
}
enum SeatType{
	VIP(20), Premium(15), Regular(10);
	double price;
	SeatType(double price){
		this.price=price;
	}
}
