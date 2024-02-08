
public class TokenPass {
	private int[] board;
	private int currentPlayer;
	
	public TokenPass(int playerCount)
	{
		board = new int[playerCount];
		
		//loop through the array fill with random ints
		for(int i = 0; i < board.length; i++)
		{
			board[i] = (int)(Math.random() * 10 + 1);
		}
		
		//you don't need minus 1 here
		//the minus 1 happens automatically when you cast to int
		currentPlayer = (int)(Math.random() * playerCount); 
	}
	
	public void distributeCurrentPlayerTokens()
	{
		//loop starting with the amount of tokens
		//you have to distribute, stop when tokens is 0
		
		int tokens = board[currentPlayer];
		board[currentPlayer] = 0; 
		int nextPlayer = currentPlayer+1; 
		
		for(int i = tokens; i > 0; i--)
		{
			//if the current position is not off the end of 
			//the board give them one token
			if(nextPlayer < board.length)
			{
				board[nextPlayer]++; 
				nextPlayer++; 
			}
			if(nextPlayer == board.length)
				nextPlayer = 0; 
			
		}
		
		
	}

}
