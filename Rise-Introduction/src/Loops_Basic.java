
public class Loops_Basic {

	public static void main(String[] args) {
// TODO Auto-generated method stub

//While loop

//1 to 10
		int i = 10;

		/*
		 * while(i>0) { System.out.println(i); i--;//i=2 } }
		 */
		int j = 20;
		do {
			System.out.println(j);
			j++;

		} while (j > 30);// 1 loop of execution is guarantee

//
//1 to 10

		/*
		 * for(initization;condition;increment) {
		 * 
		 * }
		 */
		/*
		 * if(5>2) {
		 * 
		 * 
		 * System.out.println("success"); System.out.println("second step"); }
		 * 
		 * else
		 * 
		 * System.out.println("fail");
		 */

		for (int ix = 0; i < 10; ix = ix + 3) {
			if (ix == 9)
				System.out.println(" 9 is displayed");
			else
				System.out.println("I didnot find");//

		}

	}

}
