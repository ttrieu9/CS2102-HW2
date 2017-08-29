
public class AdvancedMatch implements ITournament {
	MatchData data;
	ITournament feeder1, feeder2;
	
	//constructor for AdvancedMatch
	public AdvancedMatch(MatchData data, ITournament feeder1, ITournament feeder2){
		this.data = data;
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
	}
	
	//determines if a match's contestants were winners of previous matches and if that match's contestants
	//were also winners of previous matches
	public boolean winnerAlwaysAdvanced() {
		if(((this.feeder1.victor().equals(this.data.contestant1) && this.feeder2.victor().equals(this.data.contestant2)) ||
			(this.feeder1.victor().equals(this.data.contestant2) && this.feeder2.victor().equals(this.data.contestant1))) &&
			feeder1.winnerAlwaysAdvanced() && feeder2.winnerAlwaysAdvanced())
			return true;
		else
			return false;
	}

	//returns true if any venue's capacity in a tournament exceeds the number of seats
	public boolean highCapacityVenue(int numSeats) {
		return 	this.data.getCapacity() > numSeats || 
				feeder1.highCapacityVenue(numSeats) || 
				feeder2.highCapacityVenue(numSeats);
	}

	//determines if every score in a tournament was valid
	public boolean allScoresValid() {
		return 	this.data.isScoreValid() && 
				feeder1.allScoresValid() && 
				feeder2.allScoresValid();
	}
	
	//determines the victor of a match
	public String victor(){
		return this.data.getWinner();
	}
	
}
