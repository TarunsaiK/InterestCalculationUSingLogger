package client_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ConstructionCostEstimate  {
private static final Logger LOGGER= LogManager.getLogger(ConstructionCostEstimate.class);
int totalconstructioncost=0;

public ConstructionCostEstimate() throws IOException
  {	  
	  LOGGER.error("Choose from the options Below for required house construction material%n");
	  LOGGER.error("1) Standard Material%n2) Above Standard Material%n3) High Standard Material%n");
	 
	  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	  int materialtype=Integer.parseInt(read.readLine());
	
	  if(materialtype==1)
	  {
		 
		 totalconstructioncost=GetConstructionCost.getstandardprice();
	  }
	  else if(materialtype==2)
	  {
		  totalconstructioncost=GetConstructionCost.getabovestandardprice();
	  }
	  else if(materialtype==3)
	  {
		  LOGGER.error("1)Fully Automated %n2)Not Fully Automated%n");
		  
		  int automated=Integer.parseInt(read.readLine());
		  if(automated==1)
			  totalconstructioncost=GetConstructionCost.gethighstandarmaterial(true);
		  else
			  totalconstructioncost=GetConstructionCost.gethighstandarmaterial(false);
			  
	  }
	  LOGGER.error("The Total Cost for Construction material is "+totalconstructioncost);
	  
	  
	  
	
  }
}
