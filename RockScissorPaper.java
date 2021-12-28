import java.io.*;
public class RockScissorPaper {
	  RockScissorPaper(){}

	  void write()
	  {
		File file = new File("log.txt");
		try {
		    FileWriter fileWriter = new FileWriter(file);
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.print(play());
		    printWriter.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	  }
	  public static void main(String args[])
	  {
	        RockScissorPaper game = new RockScissorPaper();

	        // game start
	        while(true){



	        }
	  }
}
