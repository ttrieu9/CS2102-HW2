
public class MatchData {
	String contestant1, contestant2;
	IScore score;
	Venue matchVenue;
	
	//constructor for MatchData
	public MatchData(String contestant1, String contestant2, IScore score, Venue matchVenue){
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.score = score;
		this.matchVenue = matchVenue;
	}
	
	//determines if the score for a match is valid
	public boolean isScoreValid(){
		return this.score.isValid();
	}
	
	//returns the capacity of the Venue of a match
	public int getCapacity(){
		return this.matchVenue.capacity;
	}
	
	//determines the winner of a match
	public String getWinner(){
		if(score.winner())
			return contestant1;
		else
			return contestant2;
	}
}
