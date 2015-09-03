package clockAngle;
//import java.util.HashMap;
/*
 * We are given a specific time(like 02:23), we need to get the angle 
 * between hour and minute(less than 180)
 */
 public class clockAngle{
	 public static void main(String args[]) {
		 getclockAngle("02:33");
	 }
	 public static void getclockAngle(String time) {
		 String[] clock = time.split(":");
		 int hourInt = Integer.parseInt(clock[0]);
		 int minuInt = Integer.parseInt(clock[1]);
		 double A = hourInt % 12 * 30 + minuInt * 0.5;
		 double B = minuInt * 360 / 60;
		 if (Math.abs(A - B ) > 180) {
			 System.out.println(360 - (A - B ));
		 } else  {
			 System.out.println(Math.abs(A - B));
		 }
	 }
 }