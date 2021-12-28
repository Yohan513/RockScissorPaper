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
			  if(result == '��') {
				  winCount += 1;
			  } else if(result == '��') {
				  drawCount += 1;
			  } else if(result == '��') {
				  loseCount += 1;
			  }
			  gameCount += 1;
		  }
		  System.out.println(gameCount + "��" + winCount + "��" + drawCount + "��" + loseCount + "��" + " �·�" + Math.round(((float) winCount / gameCount * 100)) + "%");
	  }

	  public static void main(String args[]) throws IOException
	  {
	        RockScissorPaper game = new RockScissorPaper();
	        String str = "Hello!";

	        // game start
	        while(true){
	        	TextFileLoad();
	        	if(str == "Hello!") {
	        		break;
	        	}


	        }
	  }
}