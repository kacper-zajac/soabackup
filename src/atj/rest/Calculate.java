package atj.rest;
import java.util.List;
import static java.lang.Math.round;


public class Calculate {
	CalculateInterface add = (double x, double y) -> x + y;
    CalculateInterface subtract = (double x, double y) -> x - y;
    CalculateInterface divide = (double x, double y) -> x / y;
    CalculateInterface multi = (double x, double y) -> x * y;

    
		public double calc(String expression) throws ArithmeticException {
			int index = expression.indexOf(' ');
			String firstString = expression.substring(0, index);
			String operation = expression.substring(index+1,index+2);
			String secondString = expression.substring(index+3);
			Double x = Double.parseDouble(firstString);
			Double y = Double.parseDouble(secondString);
			
	        double value;
	        double scale = 10e5;                                //
	        switch (operation) {
	            case "+":
	                value = add.Calculate(x, y);
	                break;
	            case "-":
	                value = subtract.Calculate(x, y);
	                break;
	            case "*":
	                value = multi.Calculate(x, y);
	                break;
	            case "/":
	                if (y == 0) throw new ArithmeticException();
	                value = divide.Calculate(x, y);
	                break;
	            default:
	                value = 0;
	    }
        value = round(value * scale) / scale;
        int remainder = (int) value;
        if (value - remainder < 5 / scale) return remainder;
        return value;
    }

}