package tools.some;

public class BigDecimalRound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myNum2 = 111231.5585678;
		java.math.BigDecimal b = new java.math.BigDecimal(myNum2);
		double myNum3 = b.setScale(4, java.math.BigDecimal.ROUND_HALF_UP)
				.doubleValue();
		System.out.println(myNum2);
		System.out.println(myNum3);

		double d = 3.1465926;
		String result = String.format("%.2f", d);
		System.out.println(d);
		System.out.println(result);
	}

}
