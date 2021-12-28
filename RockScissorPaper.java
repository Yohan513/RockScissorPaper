public class RockScissorPaper {
	  RockScissorPaper(){}

	  public static void main(String args[])
	  {
	        RockScissorPaper game = new RockScissorPaper();

	        // game start
	        while(true){



	        }
	  }

	  public static String play() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String U = bf.readLine();
		String result = "";
		//String[] Com = {"Rock", "Scissor", "Paper"};
		Random rand = new Random();
		int ranNum = rand.nextInt(2);
		while(true) {
			if(U.equals("Rock")) {
				switch(ranNum) {
					case 0:
						result = "무";
					case 1:
						result = "승";
					case 2:
						result = "패";
				}
			} else if(U.equals("Scissor")) {
				switch(ranNum) {
					case 0:
						result = "패";
					case 1:
						result = "무";
					case 2:
						result = "승";
				} 
			} else {
				switch(ranNum) {
					case 0:
						result = "승";
					case 1:
						result = "패";
					case 2:
						result = "무";
				}
			}
			return result;

		}
		
	}
}
