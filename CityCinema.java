public class CityCinema{
	String cinemaName;
	CinemaScreen []screens;
	String city;

	CityCinema(String cinemaName, int screenCount, String city){
		this.cinemaName=cinemaName;
		this.city=city;
		screens= new CinemaScreen[screenCount];
		for(int i=0;i<screens.length;i++){

		    Movie movie=new Movie("Movie" + (i+1), "Action", 120, " 7:00 PM");
		    screens[i] =new CinemaScreen("Cinema Screen" , "Screen " + (i+1) , "3D ", movie );
		}
	}

	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nCinema: ").append(cinemaName);
        	stringBuilder.append("\nCity: ").append(city);
		for(int i=0;i<screens.length;i++)
		    stringBuilder.append("\n").append(screens[i]);		    
		return stringBuilder.toString();
	}
}