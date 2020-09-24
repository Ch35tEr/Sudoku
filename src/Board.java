import java.util.*;

class Board {
	private ArrayList<ArrayList<int>> board;
	//private ArrayList<ArrayLiat<>> unchanged;
	private int height = 9;
	private int width = 9;

	/*
	 * Function to create 2d matrix of a sudoku board
	 *
	 */
	public Board(String board) {
		String [] lines = board.split('\n');
		board = new ArrayList<ArrayList<int>>();
		for (String line : lines) {
			String [] numbers = line.split(" ");
			board.add(this.parseInt(numbers));
		}	
	}

	/*
	 * Function to set 2D board
	 */
	public Board(ArrayList<ArrayList<int>> board) {
		this.board = board;
	}

	/*
	 * Function to conver a list of String numbers into a list of numbers
	 * Input Example	: {"0", "1", "2"}
	 * Output		: {0, 1, 2}
	 */
	public Array<int> parseInt(String [] numbers) {
		ArrayList<int> output = new ArrayList<int>();
		for (String num : numbers)
			output.add(Integer.parseInt(num));
		return output;
	}

	public void print() {
		for (Array<int> line : board) {
			for (int x : line)
				System.out.print(x + " ");
			System.out.println();
		}
	}

	public void solve() {
		close_one();
		solveBoard(0);
	} 

	private Boolean solveBoard(int index) {
		if (index >= 90)
			return true;
		int x;
		int y;
		int i;

		ArrayList<int> poss;
		// = new ArrayList<int>(Collections.nCopies(9, 0));
		x = (index / 9);
		y = (index % 9);

		if (!hp_changeable(x, y)) {
			if (solve(index + 1))
				return true;
			else
				return false;
		} else {
			poss = hp_find_poss(x, y);
			for (i = 0; poss.get(i) != 0 && i < 9; i++) {
				board.get(x).set(y, poss.get(i));
				if (solve(index + 1))
					return true;
				else
					board.get(x).set(y, 0);
			}
		}
		return false;
	}

	/*
	 *
	 *
	 */
	void close_one() {
		int x;
		int y;
		ArrayList<int> poss;

		for (int c = 1; c == 1;) {
			c = 0;
			for (x = 0; x < height; x++) {
				for (y = 0; y < width; y++) {
					if (hp_changeable(x, y)) {
						poss = hp_find_poss(x, y);
						if (poss.get(0) != 0 && poss.get(1) == 0) {
							c = 1;
							board.get(x).set(y, poss.get(0));
							unchanged.get(x).set(y, poss.get(0));
						}
					}
				}
			}
		}
	}

	/*
	 *
	 */
	Boolean solved() {
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				if (hp_changeable(x, y))
					return false;
			}
		}
		return true;
	}

	/* 
	 * ************************************************************************
	 *			Private helper functions
	 * ************************************************************************
	 */
	


	/*
	 * Function to all possible numbers that can exist in the
	 * block at x and y
	 */
	public ArrayList<int> hp_find_poss(int x, int y) {
		int count;
		int loop = 0;
		ArrayList<int> poss = new ArrayList<int>(Collections.nCopies(9, 0));
		for (int i = 1; i <= 9; i++)
			if (!hp_is_there(x, y, i))
				poss.set(loop++, i);
		return poss;
	}


	/*
	 * Function to check if there num within the block, row or col
	 * at x and y in the board
	 */
	private Boolean hp_is_there(int x, int y, int num) {
		boolean test_x = hp_check_x(y, num);
		boolean test_y = hp_check_y(x, num);
		boolean test_b = hp_check_b(x, y, num);

		if (test_x == false && test_y == false && test_b == false)
			return false;
		else
			return true;
	}

	/*
	 * Function to check if num is repeating along y
	 */
	private Boolean hp_check_x(int y, int num) {
		for (int i = 0; i < 9; i++)
			if (board.get(i).get(y) == num)
				return true;
		return false;
	}

	/*
	 * Function to check if num is repeating along x
	 */
	private Boolean hp_check_x(int x, int num) {
		for (int i = 0; i < 9; i++)
			if (board.get(x).get(i) == num)
				return true;
		return false;
	}

	/*
	 * Function to check if num is repeating in the block at x and y
	 */
	private Boolean hp_check_b(int x, int y, int num) {
		int j = (x / 3) * 3;
		int i = (y / 3) * 3;
		int maxj = j + 3;
		int maxi = i + 3;
		for (; j < maxj; j++) {
			i = (y / 3) * 3; 
			for (; i < maxi; i++)
				if (board.get(j).get(i) == num)
					return true;
		}
		return false;
	}

	/*
	 * Function that chceks if we change modify contents at x and y
	 */
	private Boolean hp_changeable(int x, int y) {
		if (unchanged.get(x).get(y) == false)
			return true;
		return false;
	}

	/*
	 * Function to check if c is a possibility in imposs
	 *	if it is, returns true
	 *	else it will add c to imposs
	 */
	private Boolean hp_repeating_poss(ArrayList<int> imposs, int c) {
		for (int i = 0; i < 9 && imposs.get(i) != 0; i++)
			if (imposs.get(i) == c)
				return true;
		imposs.set(i, c);
		return false;
	}
}
