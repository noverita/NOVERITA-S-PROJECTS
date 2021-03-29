import java.util.*;

public class ComputeMethods5026201009 {
    public double fToC(double degreesF) {
    double degreesC = 5 / 9.0 * (degreesF - 32); 
	return degreesC;
    }
    public double hypotenuse (int a, int b) {
        double c = Math.sqrt((a*a)+(b*b));
	return c;
    }
    public int roll() {
        Random num= new Random();
        return((num.nextInt(6)+1)+(num.nextInt(6)+1));
    }
}