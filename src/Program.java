

public class Program {

	public static void main(String [] argv) {
	
		String easy = 
			"0 0 0 2 6 0 7 0 1\n"+
			"6 8 0 0 7 0 0 9 0\n"+
			"1 9 0 0 0 4 5 0 0\n"+
			"8 2 0 1 0 0 0 4 0\n"+
			"0 0 4 6 0 2 9 0 0\n"+
			"0 5 0 0 0 3 0 2 8\n"+
			"0 0 9 3 0 0 0 7 4\n"+
			"0 4 0 0 5 0 0 3 6\n"+
			"7 0 3 0 1 8 0 0 0\n";
		Board easyB = new Board(easy);		
		System.out.println();
		easyB.solve();

		easyB.print();
		System.out.println();	

		String medium = 
		"1 4 0 5 0 6 3 0 0\n"+
		"3 0 0 0 0 0 0 8 0\n"+
		"9 8 2 4 1 3 0 0 0\n"+
		"0 0 0 8 0 0 0 0 9\n"+
		"0 7 6 3 0 0 1 2 0\n"+
		"8 0 0 0 0 1 0 0 0\n"+
		"0 0 0 2 3 7 8 1 5\n"+
		"0 5 0 0 0 0 0 0 6\n"+
		"0 0 8 6 0 5 0 3 4\n";
		Board mediumB = new Board(medium);		
		System.out.println();
		mediumB.solve();

		mediumB.print();
		System.out.println();	

		String hard = 
		"1 0 0 0 0 0 0 0 0\n"+
		"0 0 0 0 1 2 0 0 0\n"+
		"0 0 0 0 0 0 0 0 1\n"+
		"0 8 0 0 0 0 5 0 0\n"+
		"0 5 0 0 8 9 0 0 7\n"+
		"0 9 0 0 0 0 0 0 0\n"+
		"0 0 0 0 0 0 6 5 0\n"+
		"0 0 0 0 0 0 0 0 0\n"+
		"0 0 0 3 0 0 0 0 0\n";
		Board hardB = new Board(hard);		
		System.out.println();
		hardB.solve();

		hardB.print();
		System.out.println();
	}

}
