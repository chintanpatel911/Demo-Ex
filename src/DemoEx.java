import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

/*Name: Chintan PAtel
 * CSU ID : 2473177
 * Assigment 8: Phone number
 */
public class DemoEx {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("src/BP.txt"));
		int badData = 0 ;
		int goodData = 0;	
		
		while (in.hasNext()){
			try{
				int value = in.nextInt();
				if (value < 0){
					throw new BPIllegalvaueException("Invalid Data");
				}else {
					goodData++;
				}
			}
				
				
				catch (InputMismatchException ex){
					in.next();
					badData++;
				}
			
				catch (BPIllegalvaueException ex){
					badData++;
				}
		    }
		
		
			System.out.print("goodData: " + goodData + " " + "badData:" + badData );

	}

}
