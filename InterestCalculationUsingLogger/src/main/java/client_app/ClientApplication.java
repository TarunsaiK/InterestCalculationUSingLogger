package client_app;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClientApplication {
	private static final Logger LOGGER= LogManager.getLogger(ClientApplication.class);
 public static void main(String[] ar) throws Exception
 {
	 
	SimpleInterest simpleinterestobject=new SimpleInterest();
	CompoundInterest compoundinterestobject=new CompoundInterest();
	double calculatedsimpleinterest=simpleinterestobject.estimate(1000.0,2.0,4.0);
	LOGGER.error("SimpleInterest:" + calculatedsimpleinterest);

	double calculatedcompoundinterest=compoundinterestobject.estimate(1000.0,2.0,4.0,1);
	LOGGER.error("CompountInterest="+calculatedcompoundinterest);

	new ConstructionCostEstimate();
 }
}
