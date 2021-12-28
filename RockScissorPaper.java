import java.io.*;
import java.util.Random;
import java.nio.charset.Charset;

public class RockScissorPaper {
	  RockScissorPaper(){}
	  public static String log = "";
	  
	  public static String play() throws IOException {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String U = bf.readLine();
			String result = "";
			Random rand = new Random();
			int ranNum = rand.nextInt(3);
			
			if(U.equals("Rock")) {
				switch(ranNum) {
					case 0:
						result = "무";
						break;
					case 1:
						result = "승";
						break;
					case 2:
						result = "패";
						break;
				}
			} else if(U.equals("Scissor")) {
				switch(ranNum) {
					case 0:
						result = "패";
						break;
					case 1:
						result = "무";
						break;
					case 2:
						result = "승";
						break;
				} 
			} else if(U.equals("Paper")) {
				switch(ranNum) {
					case 0:
						result = "승";
						break;
					case 1:
						result = "패";
						break;
					case 2:
						result = "무";
						break;
				}
			}
			return result;
		}
	  
	  public static void write()
	  {
		File file = new File("log.txt");
		try {
		    FileWriter fileWriter = new FileWriter(file);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    log += play();
		    printWriter.print(log);
		    printWriter.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	  }
	  
	  public static void TextFileLoad() throws IOException {
		  FileReader reader = new FileReader("log.txt", Charset.forName("UTF-8"));
		  
		  int ch;
		  char result;
		  int winCount = 0, drawCount = 0, loseCount = 0, gameCount = 0;
		  while((ch = reader.read()) != -1) {
			  result = (char) ch;
			  if(result == '승') {
				  winCount += 1;
			  } else if(result == '무') {
				  drawCount += 1;
			  } else if(result == '패') {
				  loseCount += 1;
			  }
			  gameCount += 1;
		  }
		  System.out.println(gameCount + "전" + winCount + "승" + drawCount + "무" + loseCount + "패" + " 승률" + Math.round(((float) winCount / gameCount * 100)) + "%");
	  }

	  public static void main(String args[]) throws IOException
	  {
	        RockScissorPaper game = new RockScissorPaper();

	        // game start
	        while(true){
	        	write();
	        	TextFileLoad();
	        }
	  }
}