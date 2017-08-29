
public class BaseballScore implements IScore {
	int runs1, runs2, innings;
	boolean rainShortened;
	
	//constructor for BaseballScore
	public BaseballScore(int runs1, int runs2, int innings, boolean rainShortened){
		this.runs1 = runs1;
		this.runs2 = runs2;
		this.innings = innings;
		this.rainShortened = rainShortened;
	}
	
	//determines if score for a baseball match is valid
	public boolean isValid() {
		if(runs1 != runs2){
			if(rainShortened){
				if(innings >= 5)
					return true;
				else
					return false;
			}
			else 
				if (innings >=9)
					return true;
				else 
					return false;
		}
		else
			return false;
	}
	
	//returns true if runs1 is larger than runs2, otherwise returns false
	public boolean winner(){
		return this.runs1 > runs2;
	}
	
}
