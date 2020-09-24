import static org.junit.Assert.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	private Board subjectEasy;
	//private Board subjectMedium;
	//private Board subjectHard;
	private final String easy = 
		"0 0 0 2 6 0 7 0 1\n"+
		"6 8 0 0 7 0 0 9 0\n"+
		"1 9 0 0 0 4 5 0 0\n"+
		"8 2 0 1 0 0 0 4 0\n"+
		"0 0 4 6 0 2 9 0 0\n"+
		"0 5 0 0 0 3 0 2 8\n"+
		"0 0 9 3 0 0 0 7 4\n"+
		"0 4 0 0 5 0 0 3 6\n"+
		"7 0 3 0 1 8 0 0 0\n";

	private final ArrayList<ArrayList<Integer>> easyBoard ={
		{0, 0, 0, 2, 6, 0, 7, 0, 1},
		{6, 8, 0, 0, 7, 0, 0, 9, 0},
		{1, 9, 0, 0, 0, 4, 5, 0, 0},
		{8, 2, 0, 1, 0, 0, 0, 4, 0},
		{0, 0, 4, 6, 0, 2, 9, 0, 0},
		{0, 5, 0, 0, 0, 3, 0, 2, 8},
		{0, 0, 9, 3, 0, 0, 0, 7, 4},
		{0, 4, 0, 0, 5, 0, 0, 3, 6},
		{7, 0, 3, 0, 1, 8, 0, 0, 0}
	};

	private final String medium = 
		"1 4 0 5 0 6 3 0 0\n"+
		"3 0 0 0 0 0 0 8 0\n"+
		"9 8 2 4 1 3 0 0 0\n"+
		"0 0 0 8 0 0 0 0 9\n"+
		"0 7 6 3 0 0 1 2 0\n"+
		"8 0 0 0 0 1 0 0 0\n"+
		"0 0 0 2 3 7 8 1 5\n"+
		"0 5 0 0 0 0 0 0 6\n"+
		"0 0 8 6 0 5 0 3 4\n";

	private final ArrayList<ArrayList<Integer>> mediumBoard ={
		{1, 4, 0, 5, 0, 6, 3, 0, 0},
		{3, 0, 0, 0, 0, 0, 0, 8, 0},
		{9, 8, 2, 4, 1, 3, 0, 0, 0},
		{0, 0, 0, 8, 0, 0, 0, 0, 9},
		{0, 7, 6, 3, 0, 0, 1, 2, 0},
		{8, 0, 0, 0, 0, 1, 0, 0, 0},
		{0, 0, 0, 2, 3, 7, 8, 1, 5},
		{0, 5, 0, 0, 0, 0, 0, 0, 6},
		{0, 0, 8, 6, 0, 5, 0, 3, 4}
	};
	
	private final String hard = 
		"1 0 0 0 0 0 0 0 0\n"+
		"0 0 0 0 1 2 0 0 0\n"+
		"0 0 0 0 0 0 0 0 1\n"+
		"0 8 0 0 0 0 5 0 0\n"+
		"0 5 0 0 8 9 0 0 7\n"+
		"0 9 0 0 0 0 0 0 0\n"+
		"0 0 0 0 0 0 6 5 0\n"+
		"0 0 0 0 0 0 0 0 0\n"+
		"0 0 0 3 0 0 0 0 0\n";

	private final ArrayList<ArrayList<Integer>> hardBoard ={
		{1, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 1, 2, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 1},
		{0, 8, 0, 0, 0, 0, 5, 0, 0},
		{0, 5, 0, 0, 8, 9, 0, 0, 7},
		{0, 9, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 6, 5, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 3, 0, 0, 0, 0, 0}
	};

	private final ArrayList<ArrayList<Integer>> initialUnchanged = {
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0}
	};

	@Before
	public void setup() {
		subjectEasy = new Board(easy);
	}

	@Test
	public void testGetBoard() {
		ArrayList<ArrayList<Integer>> easyA = subjectEasy.getBoard();
		for (int i = 0; i < 9; i++) {
			assertArrayEquals(easyA.get(i).toArray(), easyBoard.get(i).toArray());
		}
	}
}