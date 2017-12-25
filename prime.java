
package lab;

 class prime
{
		  public static void main(String[] args) {
         int i,m=0,flag=0;  
         System.out.println("we will check numbbers ");
        
             
          for(i=1;i<=100;i++)
          {flag=0;
        	  for(m=2;m<=i/2;m++)
        	  {
        		  
        	  
           if(i%m==0){   
           System.out.println("Number"+i+" is not prime");   
           flag=1;   
           break;   
           } }  
          
          if(flag==0)   
          System.out.println("Number "+i+"is prime");  
          }

    }

}
