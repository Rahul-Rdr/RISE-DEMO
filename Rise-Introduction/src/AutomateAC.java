import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AutomateAC {

	public static void main(String[] args) throws InterruptedException {

		LocalTime time = LocalTime.now();
		
		//String currentTime = "";
		//int currentT = Integer.parseInt(currentTime);
		
		String endTime = "2321";
		int endT = Integer.parseInt(endTime);

		while (!(Integer.parseInt(time.format(DateTimeFormatter.ofPattern("HHmm")))==(endT)) && (Integer.parseInt(time.format(DateTimeFormatter.ofPattern("HHmm")))<endT )) 
		{

			System.out.println("under loop");
			Thread.sleep(6000);
			
//			currentTime = time.format(DateTimeFormatter.ofPattern("HHmm"));
//			currentT = Integer.parseInt(currentTime);
			System.out.println((Integer.parseInt(time.format(DateTimeFormatter.ofPattern("HHmm")))));
			System.out.println(endT);
			
		}

		System.out.println("OUTER loop");

//	LocalTime endTime = LocalTime.parse( "18:52" ) ;
//		//System.out.println(java.time.LocalTime.now());
//		
//		boolean x =endTime.equals(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
//		System.out.println(endTime);
//		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
//		System.out.println(x);
//		while(!endTime.equals(java.time.LocalTime.now())) {
//			
//			System.out.println("its under loop");
//			Thread.sleep(5000);
//		}
//		
//		System.out.println("its outer loop");

//	boolean tim = t.equals(e);
//	System.out.println(tim);
	}

}
