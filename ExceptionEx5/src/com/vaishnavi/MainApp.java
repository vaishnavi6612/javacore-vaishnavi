package com.vaishnavi;
 
   public class MainApp {
	   
	   public static float ans[]=new float[2];
       public static int i;

	public static void main(String[] args) {
		Object []data= {39,10,38,true,"Hello",-17,2,5.4f};
		
		for(int i=0;i<data.length;i++)
		{
			try
			{
			  convert(data[i]);
			}
			catch(ClassCastException ex)
			{
			        System.out.println("ClassCastException="+ex.getMessage());
		    }
			catch(ArithmeticException ex)
			{
				System.out.println("ArithmeticException="+ex.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("ArrayIndexOutOfBounds="+ex.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		
		}
		try
		{
			int no=2;
			if(no==2)
			{
				throw new Exception("Number must not be 2");
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		}
        public static void convert(Object value)throws ClassCastException
        {
        	int no = (int)value;
        	divide(no,no%2);
	    }
        public static void divide(int no,int d)throws ArithmeticException
        {
        	float division=no/d;
        	save(division);
        }
        public static void save(float division)throws ArrayIndexOutOfBoundsException
        {
        	ans[i]=division;
        	i++;
        }

}
