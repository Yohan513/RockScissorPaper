import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class RockScissorPaper {
	  RockScissorPaper(){}
	  
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


	        }
	  }
}