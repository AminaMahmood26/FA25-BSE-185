public class CinemaScreen{
	String name;
	String id;
	String type;
	Seat seats[][];
	private Movie movie;
	public CinemaScreen(String name , String id , String type, Movie movie){
		this.name=name;
		this.id=id;
		this.type=type;
		this.movie=movie;
		seats=new Seat[5][];
		seats[0]=new Seat[8];
		seats[1]=new Seat[10];
		seats[2]=new Seat[12];
		seats[3]=new Seat[14];
		seats[4]=new Seat[14];
		for(int i=0;i<seats.length;i++){
		   for(int j=0; j<seats[i].length;j++){
		       SeatType typeSeat;

			if(i>=4)
			   typeSeat=SeatType.VIP;
			else if(i>=2)
			   typeSeat=SeatType.Premium;
			else
			   typeSeat=SeatType.Regular;
		      seats[i][j]=new Seat(typeSeat ," R " + i);
		   }

		}
	}

	public String toString(){

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nScreen: ").append(name);
     		stringBuilder.append("\nType: ").append(type);
        	stringBuilder.append("\nMovie: ").append(movie).append("\n");
		for(int i=0;i<seats.length;i++){
		    stringBuilder.append("\nRow").append(i).append(": ");
		    for(int j=0; j<seats[i].length;j++){
			stringBuilder.append(String.format("%-25s", seats[i][j]));
		    }
		    stringBuilder.append("\n");

		}
		return stringBuilder.toString();
	}
}
