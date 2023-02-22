public class SecondExample 
{
    public static void main(String[] args) 
	{
	   int a[]={4,5,6,7,3,1,4,6,8,9,10,11,12};
	     int temp;
	     for(int i=0;i<a.length;i++)
	   {
	       for(int j=i+1;j<a.length;j++)  
	       {   
	          if(a[i]<a[j]);
	           {
	              temp=a[i];
	              a[i]=a[j];
	              a[j]=temp;
	            }  
	        } 
	   
	               System.out.println(a[i]-1);
	               break;
	    }
	
	}
}



