import java.time.LocalTime;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LocalTime now = LocalTime.now();

		// TODO Please Specify the required time below (Hour , Minute , Second ,
		// NanoSecond)
		LocalTime startTime = LocalTime.of(01, 30, 00, 000);
		LocalTime endTime = LocalTime.of(01, 59, 00, 000);

		System.out.println("Specific Time of Day=" + startTime);
	

		Testt dateTimeExample = new Testt();
		try {
			dateTimeExample.execute(startTime, endTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("End of main");
	}
	private void execute(LocalTime startTime, LocalTime endTime) throws InterruptedException {
		Boolean isOn = false;
		LocalTime now = null;

		while (true) {

			now = LocalTime.now();

			if (now.isAfter(endTime)) {
				System.out.println("Exiting from loop..");
				break;
			}

			if (now.isAfter(startTime) && !isOn) {
				System.out.println("Turning on AC....");
				isOn = true;
				Thread.sleep(2000);
				
			} else if (now.isAfter(startTime) && isOn) {
				System.out.println("Turning off AC....");
				isOn = false;
				Thread.sleep(2000);
			}

		}
	}



}
