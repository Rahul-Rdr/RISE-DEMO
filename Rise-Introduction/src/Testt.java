import java.time.LocalTime;

public class Testt {

	public static void main(String[] args) {

		LocalTime startTime = LocalTime.of(01, 00, 00, 000); //1:00 AM
		LocalTime endTime = LocalTime.of(06, 30, 00, 000);  //6:30 AM


		Testt dateTimeExample = new Testt();
		try {
			dateTimeExample.execute(startTime, endTime);
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("Interval finish");
	}
	
	
	private void execute(LocalTime startTime, LocalTime endTime) throws InterruptedException {
		Boolean acIsOn = false;
		LocalTime now = null;

		while (true) {

			now = LocalTime.now();

			if (now.isAfter(endTime)) {
				System.out.println("Enter correct value on endTime");
				break;
			}

			if (now.isAfter(startTime) && !acIsOn) {
				System.out.println("Turning on AC....");
				acIsOn = true;
				Thread.sleep(54000); //this is mili sec
				
				
			} else if (now.isAfter(startTime) && acIsOn) {
				System.out.println("Turning off AC....");
				acIsOn = false;
				Thread.sleep(72000); //this is mili sec
			}

		}
	}



}
