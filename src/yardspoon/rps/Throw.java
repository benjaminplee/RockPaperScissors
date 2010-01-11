package yardspoon.rps;

public enum Throw {
	Rock, Paper, Scissors;

	public Result play(Throw opponent) {
		if(this == opponent) {
			return Result.Tie;
		}
		
		return Result.Win;
	}

}
