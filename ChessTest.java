
public class ChessTest {

	public static void main(String[] args) {
		Chess chess = new GraphicalChess();
		
		chess.moveBishop();
		
	}
}

final class Chess ////code written by a Siddharth
{
	void moveKing() {
		System.out.println("Moving king diagonally/vertically/horizontally...bakward/forward 1 STEP..");
	}	
	void moveQueen() {
		System.out.println("Moving diagonally/vetically/horizontally...backward/forward...1step/N step..");
	}
	final void moveBishop() { 
		System.out.println("Moving the bishop diagonally....backword/forward...1 step...many steps...");
	}
	void moveKnite() {
		System.out.println("Moving the knight in L shape...anywhere ...jump over...");
	}
	void moveRook() {
		System.out.println("Moving the rook horizontally..vertically..back/forward...1/n steps");
	}
	void movePawn() {
		System.out.println("Only move forward..1 step..1 step diagonal to kill......");
	}
}

class GraphicalChess extends Chess // Suvomoy
{
	
	/*void moveBishop() {
		super.moveBishop(); //reuse the logic already written...
		System.out.println("+ overridden.... the bishop is being moved to a new location...on graphics..");
		System.out.println("that location should be diagonally/ahead/backward..on same color....");
	}*/
	void moveBishop() {
		System.out.println("moving bishop in L way......");
	}
}
