package fr.uphf;

public class FootResultsService implements FootResultServiceInterface{

	@Override
	public Result retrieveResult(String team1, String team2) {
		
		//Search in a data base the results
		//Fixed (static) response
		return new Result(team1, 2, team2, 1);
	}

}
