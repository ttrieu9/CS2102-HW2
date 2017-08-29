
public class InitMatch implements ITournament {
	MatchData data;
	
	//Constructor for an InitMatch
	public InitMatch(MatchData data){
		this.data = data;
	}
	
	//returns true when checking if contestants were winners from previous matches
	public boolean winnerAlwaysAdvanced() {
		return true;
	}

	//determines if capacity of venue exceeds number of seats
	public boolean highCapacityVenue(int numSeats) {
		return this.data.getCapacity() > numSeats;
	}

	//determines if score for a match is valid
	public boolean allScoresValid() {
		return this.data.isScoreValid();
	}
	
	//determines who would be the winner of a match
	//scores and contestants are respective (e.g. contestant1's score is goal1 in soccer)
	public String victor(){
		return this.data.getWinner();
	}
}
