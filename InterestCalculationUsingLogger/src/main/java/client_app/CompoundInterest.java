package client_app;

public class CompoundInterest {
	public double estimate(double principle ,double rateofinterest,double numberoftimesinterestapplied,double timeelapsed)
	{
		return principle*(Math.pow(1+(rateofinterest/numberoftimesinterestapplied),numberoftimesinterestapplied*timeelapsed ));
	}
}
