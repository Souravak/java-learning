package loops;

import com.loops.WhileNumberPlayer;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(10);
		
		player.printSquareUptoLimit();
		
		player.printCubeUptoLimit();
	}
}

