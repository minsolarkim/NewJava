class Example5 {
	public static void main(String[] args) {
		String[][] text = new String[9][9];

		for (int i=0; i < text.length; i++ ) {

			for (int j=0; j < text[i].length; j++) {
				text[i][j] = (i+1) + " * " + (j+1) + " = " + (i+1)*(j+1);
				System.out.println("text["+i+"]["+j+"] = " + text[i][j]);
			}//end of inner

			System.out.println("======================");

		}//end of outer

	}//end of main

}//end of class
