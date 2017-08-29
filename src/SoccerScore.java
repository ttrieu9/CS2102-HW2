
public class SoccerScore implements IScore {
	int goals1, goals2;
	boolean usedExtraTime;
	
	//constructor for SoccerScore
	public SoccerScore(int goals1, int goals2, boolean usedExtraTime){
		this.goals1 = goals1;
		this.goals2 = goals2;
		this.usedExtraTime = usedExtraTime;
	}
	
	//determines if score for a soccer match is valid
	public boolean isValid() {
		if(goals1 == goals2 && !usedExtraTime)
			return false;
		else
			return true;
	}
	
	//returns true if goal1 is larger than goal2, otherwise returns false
	public boolean winner(){
		return goals1 > goals2;
	}

}
