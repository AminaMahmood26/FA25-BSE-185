public class Movie{
	private String title;
	private String genre;
	private String showTime;
	private int duration;
	public Movie(String title, String genre, int duration, String showTime){
		this.title=title;
		this.genre=genre;
		this.duration=duration;
		this.showTime=showTime;
	}
	public String toString(){
		return title + " | " + genre + " | " + duration + " minutes | Show " + showTime;
	}	
	
}