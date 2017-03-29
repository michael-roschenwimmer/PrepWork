import java.io.PrintWriter;

public class ReceiptRevisited {
	public static void main( String[] args ) throws Exception {
		PrintWriter fileout = new PrintWriter("receipt.txt");
		
		fileout.println( "+-------------------+" );
		fileout.println( "|                   |" );
		fileout.println( "|    OOOH YEAHHH    |" );
		fileout.println( "|   * * * * * * *   |" );
		fileout.println( "|  TESTING COMPLETE |" );
		fileout.println( "+-------------------+" );
		fileout.close();
	}
}