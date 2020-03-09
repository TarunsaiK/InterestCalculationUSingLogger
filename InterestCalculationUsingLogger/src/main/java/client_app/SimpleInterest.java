package client_app;

public class SimpleInterest {
	public double estimate(double principleamount,double rateofinterest,double time)
	{
	
		double calculatedinterest;
		calculatedinterest=((principleamount*rateofinterest*time)/100);
		return calculatedinterest;
	}

}
