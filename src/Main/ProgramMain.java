package Main;
import Calc.*;

public class ProgramMain {

	public static void main(String[] args) {
		
		CalcData calcdata=new CalcData();
		double a=	calcdata.SumJQ();
		double b=   calcdata.avg();
		System.out.println(a);
		System.out.println(b);
	}
	

}
