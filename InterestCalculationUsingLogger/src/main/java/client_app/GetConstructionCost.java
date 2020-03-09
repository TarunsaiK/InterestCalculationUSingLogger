package client_app;

public class GetConstructionCost {
	static int standardmaterialprice=1200;
	static int  abovestandardmaterialprice=1500;
	static int highstandardmaterialwithoutautomationprice=1800;
	static int highstandardmaterialwithautomationprice=2500;
	GetConstructionCost()
	{
		
	}
   public static int getstandardprice()
   {
	   return standardmaterialprice;
   }
   public static int getabovestandardprice()
   {
	   return abovestandardmaterialprice;
   }
   public static int gethighstandarmaterial(boolean automation)
   {
	   if(automation)
		   return highstandardmaterialwithautomationprice;
	   return highstandardmaterialwithoutautomationprice;
   }

}
