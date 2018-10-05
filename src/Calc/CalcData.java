package Calc;

///计算工具类
public class CalcData {

	/**
	 * 计算加权值
	 * 
	 * @param a 一组数据
	 * @param b 二组数据
	 * @return 计算结果
	 */
	public double SumJQ() {

		double[] list_a = new double[] { 0, 2, 3 };

		double[] list_b = new double[] { 3, 4, 3 };

		if (list_a.length != list_b.length)
			return 0;
		else {
			double suma = 0;
			double sumb = 0;

			for (int i = 0; i < list_a.length; i++) {
				suma += list_a[i] * list_b[i];
			}

			for (int i = 0; i < list_a.length; i++) {
				if (list_a[i] > 0)
					sumb += list_b[i];
			}

			return sumb > 0 ? suma / sumb : 0;
		}
	}

	public double avg() {
		double[] list_a = new double[] {1,2,3,4,5,6};
		double suma = 0;
		double sumb = 0;
		for (int i = 0; i < list_a.length; i++) {
			suma += list_a[i];
         
		}
       sumb = list_a.length;
		return suma / sumb;
	}

}
