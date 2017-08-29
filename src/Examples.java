import tester.Tester;

public class Examples {
	Examples(){}
	
	Venue ven = new Venue("Random Place", 9001);
	
	BaseballScore baseballScore1 = new BaseballScore(4, 4, 5, true);
	BaseballScore baseballScore2 = new BaseballScore(4, 5, 6, true);
	BaseballScore baseballScore3 = new BaseballScore(5, 4, 3, true);
	BaseballScore baseballScore4 = new BaseballScore(4, 5, 10, true);
	BaseballScore baseballScore5 = new BaseballScore(4, 4, 5, false);
	BaseballScore baseballScore6 = new BaseballScore(4, 5, 5, false);
	BaseballScore baseballScore7 = new BaseballScore(5, 4, 9, false);
	BaseballScore baseballScore8 = new BaseballScore(6, 5, 15, false);
	
	MatchData bMatch1 = new MatchData("Jason", "Shayla", baseballScore2, ven);
	MatchData bMatch2 = new MatchData("Jeffrey", "Trevor", baseballScore8, ven);
	MatchData bMatch3 = new MatchData("Eric", "Justin", baseballScore2, ven);
	MatchData bMatch4 = new MatchData("Mya", "Tommy", baseballScore8, ven);
	MatchData bMatch5 = new MatchData("Shayla", "Jeffrey", baseballScore8, ven);
	MatchData bMatch6 = new MatchData("Justin", "Mya", baseballScore8, ven);
	MatchData bMatch7 = new MatchData("Shayla", "Justin", baseballScore8, ven);
	MatchData bMatch8 = new MatchData("Ryan", "Mya", baseballScore8, ven);
	
	InitMatch bInit1 = new InitMatch(bMatch1);
	InitMatch bInit2 = new InitMatch(bMatch2);
	InitMatch bInit3 = new InitMatch(bMatch3);
	InitMatch bInit4 = new InitMatch(bMatch4);
	
	AdvancedMatch bAdvanced1 = new AdvancedMatch(bMatch5, bInit1, bInit2);
	AdvancedMatch bAdvanced2 = new AdvancedMatch(bMatch6, bInit3, bInit4);
	AdvancedMatch bAdvanced3 = new AdvancedMatch(bMatch7, bAdvanced1, bAdvanced2);
	AdvancedMatch bAdvanced4 = new AdvancedMatch(bMatch8, bInit3, bInit4);
	AdvancedMatch bAdvanced5 = new AdvancedMatch(bMatch7, bAdvanced1, bAdvanced4);

	SoccerScore soccerScore1 = new SoccerScore(1, 1, true);
	SoccerScore soccerScore2 = new SoccerScore(2, 1, true);
	SoccerScore soccerScore3 = new SoccerScore(1, 1, false);
	SoccerScore soccerScore4 = new SoccerScore(1, 2, false);
	
	MatchData sMatch1 = new MatchData("Tommy", "Jason", soccerScore2, new Venue("WeHa", 5));
	MatchData sMatch2 = new MatchData("Eric", "Shayla", soccerScore2, new Venue("WeHa", 234));
	MatchData sMatch3 = new MatchData("Tommy", "Jason", soccerScore3, new Venue("WeHa", 5));
	MatchData sMatch4 = new MatchData("Tommy", "Eric", soccerScore4, new Venue("WeHa", 60));
	MatchData sMatch5 = new MatchData("Tommy", "Eric", soccerScore4, new Venue("WeHa", 60));
	MatchData sMatch6 = new MatchData("Tommy", "Trevor", soccerScore2, new Venue("WeHa", 1));
	MatchData sMatch7 = new MatchData("Mya", "Jason", soccerScore4, new Venue("WeHa", 12));
	MatchData sMatch8 = new MatchData("Jeffrey", "Justin", soccerScore4, new Venue("Philly", 20));
	
	InitMatch sInit1 = new InitMatch(sMatch1);
	InitMatch sInit2 = new InitMatch(sMatch2);
	InitMatch sInit3 = new InitMatch(sMatch3);
	InitMatch sInit4 = new InitMatch(sMatch6);
	InitMatch sInit5 = new InitMatch(sMatch7);
	InitMatch sInit8 = new InitMatch(sMatch8);

	AdvancedMatch sAdvanced0 = new AdvancedMatch(sMatch1, sInit4, sInit5);
	AdvancedMatch sAdvanced1 = new AdvancedMatch(sMatch4, sAdvanced0, sInit2);
	AdvancedMatch sAdvanced2 = new AdvancedMatch(sMatch5, sAdvanced1, sInit3);
	AdvancedMatch sAdvanced3 = new AdvancedMatch(sMatch1, sInit4, sInit8);
	AdvancedMatch sAdvanced4 = new AdvancedMatch(sMatch4, sAdvanced3, sInit2);
	AdvancedMatch sAdvanced5 = new AdvancedMatch(sMatch4, sAdvanced3, sAdvanced2);
	
	//tests method isValid() on soccerScores
	boolean testSoccerScoreIsValid(Tester t){
		return 	t.checkExpect(soccerScore1.isValid(), true) &&
				t.checkExpect(soccerScore2.isValid(), true) &&
				t.checkExpect(soccerScore3.isValid(), false) &&
				t.checkExpect(soccerScore4.isValid(), true);
	}
	
	//tests method isValid() on baseballScores
	boolean testBaseballScoreIsValid(Tester t){
		return 	t.checkExpect(baseballScore1.isValid(), false) &&
				t.checkExpect(baseballScore2.isValid(), true) &&
				t.checkExpect(baseballScore3.isValid(), false) &&
				t.checkExpect(baseballScore4.isValid(), true) &&
				t.checkExpect(baseballScore5.isValid(), false) &&
				t.checkExpect(baseballScore6.isValid(), false) &&
				t.checkExpect(baseballScore7.isValid(), true) &&
				t.checkExpect(baseballScore8.isValid(), true);
	}
	
	//tests method allScoresValid() on InitMatches and AdvancedMatches
	boolean testAllScoresValid(Tester t){
		return 	t.checkExpect(sInit1.allScoresValid(), true) &&
				t.checkExpect(sAdvanced1.allScoresValid(), true) &&
				t.checkExpect(sInit3.allScoresValid(), false) &&
				t.checkExpect(sAdvanced2.allScoresValid(), false) &&
				t.checkExpect(sAdvanced5.allScoresValid(), false) &&
				t.checkExpect(bAdvanced2.allScoresValid(), true) &&
				t.checkExpect(bAdvanced3.allScoresValid(), true);
	}
	
	//tests method highCapacityVenue() on InitMatches and AdvancedMatches
	boolean testHighCapacityVenue(Tester t){
		return 	t.checkExpect(sInit1.highCapacityVenue(10), false) &&
				t.checkExpect(sInit2.highCapacityVenue(10), true) &&
				t.checkExpect(sAdvanced1.highCapacityVenue(10), true) &&
				t.checkExpect(sAdvanced1.highCapacityVenue(1000), false) &&
				t.checkExpect(bAdvanced4.highCapacityVenue(1000), true) &&
				t.checkExpect(bAdvanced1.highCapacityVenue(10000), false);
	}
	
	//tests method winner() on SoccerScores and BaseballScores
	boolean testWinner(Tester t){
		return	t.checkExpect(soccerScore2.winner(), true) &&
				t.checkExpect(soccerScore4.winner(), false) &&
				t.checkExpect(baseballScore2.winner(), false) &&
				t.checkExpect(baseballScore7.winner(), true);
	}
	
	//tests method getWinner() on Matches
	boolean testGetWinner(Tester t){
		return	t.checkExpect(sMatch1.getWinner(), "Tommy") &&
				t.checkExpect(sMatch2.getWinner(), "Eric") &&
				t.checkExpect(sMatch4.getWinner(), "Eric") &&
				t.checkExpect(bMatch2.getWinner(), "Jeffrey") &&
				t.checkExpect(bMatch5.getWinner(), "Shayla") &&
				t.checkExpect(bMatch8.getWinner(), "Ryan");
	}
	
	//tests method victor() on InitMatches and AdvancedMatches
	boolean testVictor(Tester t){
		return	t.checkExpect(sInit1.victor(), "Tommy") &&
				t.checkExpect(sAdvanced1.victor(), "Eric") &&
				t.checkExpect(bAdvanced3.victor(), "Shayla") &&
				t.checkExpect(bAdvanced2.victor(), "Justin") &&
				t.checkExpect(bAdvanced4.victor(), "Ryan");
	}
	
	//tests method winnerAlwaysAdvanced on InitMatches and AdvancedMatches
	boolean testWinnerAlwayssAdvanced(Tester t){
		return	t.checkExpect(sAdvanced1.winnerAlwaysAdvanced(), true) &&
				t.checkExpect(sInit1.winnerAlwaysAdvanced(), true) &&
				t.checkExpect(sAdvanced3.winnerAlwaysAdvanced(), false) &&
				t.checkExpect(sAdvanced4.winnerAlwaysAdvanced(), false) &&
				t.checkExpect(bInit1.winnerAlwaysAdvanced(), true) &&
				t.checkExpect(bAdvanced3.winnerAlwaysAdvanced(), true) &&
				t.checkExpect(bAdvanced5.winnerAlwaysAdvanced(), false);
	}
	
}
