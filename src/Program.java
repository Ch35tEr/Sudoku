

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
		easyB.print();
		System.out.println();
		easyB.printUnchanged();
		
		System.out.println();
		easyB.solve();

		easyB.print();
		System.out.println();
		easyB.printUnchanged();
		
	}

}
