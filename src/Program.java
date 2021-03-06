import java.util.*;

public class Program {

	public static void main(String [] argv) {
		/*
		System.out.println("********************************************************************************************");
		System.out.println("*********************************		EASY BOARD		*********************************");
		System.out.println("********************************************************************************************");

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

		System.out.print(easy);

		Board easyB = new Board(easy);		
		System.out.println();
		easyB.solve();

		easyB.print();
		System.out.println();	

		System.out.println("********************************************************************************************");
		System.out.println("*********************************		MEDIUM BOARD		*********************************");
		System.out.println("********************************************************************************************");

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

		System.out.print(medium);

		Board mediumB = new Board(medium);		
		System.out.println();
		mediumB.solve();

		mediumB.print();
		System.out.println();	

		System.out.println("********************************************************************************************");
		System.out.println("*********************************		HARD BOARD		*********************************");
		System.out.println("********************************************************************************************");

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

		System.out.print(hard);

		Board hardB = new Board(hard);		
		System.out.println();
		hardB.solve();

		hardB.print();
		System.out.println();

		System.out.println("********************************************************************************************");
		System.out.println("*********************************		ASSIGN BOARD		*********************************");
		System.out.println("********************************************************************************************");


		String assign = 
		"0 0 8 7 0 6 2 0 0\n"+
		"0 0 7 0 1 0 3 0 0\n"+
		"0 0 0 4 0 0 0 0 0\n"+
		"3 0 0 0 0 0 6 0 9\n"+
		"0 6 0 0 7 0 0 5 0\n"+
		"1 0 5 0 0 0 0 0 2\n"+
		"0 0 0 0 0 7 0 0 0\n"+
		"0 0 1 0 6 0 8 0 0\n"+
		"0 0 4 2 0 5 7 0 0\n";

		System.out.print(assign);

		Board assignB = new Board(assign);		
		System.out.println();
		assignB.solve();

		assignB.print();
		System.out.println();

		System.out.println("********************************************************************************************");
		System.out.println("********************************************************************************************");
		System.out.println("********************************************************************************************");*/

		Scanner in = new Scanner(System.in);
		String input = "";
		for (int i = 0; i < 9; i++)
			input = input + in.nextLine()+"\n";
		System.out.println(input);
		Board assign = new Board(input);
		assign.solve();
		assign.print();
	}

}
