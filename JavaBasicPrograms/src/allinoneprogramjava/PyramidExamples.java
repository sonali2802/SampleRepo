package allinoneprogramjava;

public class PyramidExamples {

	public static void main(String[] args) {
		 //  1)program to print half of pyramid using *
        System.out.println("**************************");
		for(int i=1;i<6;i++) {//number of lines in pyramid
			for(int j=1;j<=i;j++) {//pattern in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
		//2)program to print half of pyramid using numbers
		System.out.println("****************");
		for(int i=1;i<6;i++) {//number of lines in pyramid
			for(int j=1;j<=i;j++) {//pattern in pyramid
				System.out.print(j+" ");
			}
			System.out.println();
		}
	   //3)Program to print half of pyramid using alphabets
		System.out.println("************");
		char c='A';
	   for(char i=0;i<5;i++) {
	     for(char j=0;j<=i;j++) {
	System.out.print((char)(c+i)+" ");
	     }
	  System.out.println("");
	   }
	
	//4)inverted half pyramid using *
	System.out.println("************");
	for(int i=5;i>0;i--) {//number of lines in pyramid
		for(int j=i;j>0;j--) {//pattern in pyramid
			System.out.print("* ");
		}
		System.out.println();
	}

	//5)program to print half of pyramid using numbers
			System.out.println("****************");
			for(int i=6;i>0;i--) {//number of lines in pyramid
				for(int j=i;j>0;j--) {//pattern in pyramid
					System.out.print(i+" ");
				}
				System.out.println();
			}
	   //program to print full pyramid using *
			 
			System.out.println("*************************************");
			System.out.println("\n");
			 int rows1 = 5;  			   		        
		   
		     int rowCount1 = 1;     	  
		     for (int i = rows1; i > 0; i--)  
		        {  	           
		   
		            for (int j = 1; j <= i*2; j++)  
		            {  
		                System.out.print(" ");  
		            }  	   
		         
		   
		            for (int j = 1; j <= rowCount1; j++)            
		            {  
		                System.out.print("*"+" ");  
		            }  	   

		               
		            for (int j = rowCount1-1; j >= 1; j--)  
		            {                 
		                System.out.print("*"+" ");              
		            }                         
		               
		            System.out.println(); 		   
		   
		            rowCount1++;  
		        } 
			    
			    //program to print full pyramid using *
		     System.out.println("\n");
				System.out.println("****************************************");
				
				System.out.println("\n");
				
				 int rows12 = 5;

				    for(int i = rows12; i >= 1; --i) {
				      for(int space = 1; space <= rows12 - i; ++space) {
				        System.out.print("  ");
				      }

				      for(int j=i; j <= 2 * i - 1; ++j) {
				        System.out.print("* ");
				      }

				      for(int j = 0; j < i - 1; ++j) {
				        System.out.print("* ");
				      }

				      System.out.println();
				    }
				    
				    
				    
				    System.out.println("*************************************");
					System.out.println("\n");
					
					int a = 5, k = 0, count = 0, count1 = 0;

				    for (int i = 1; i <= a; ++i) {
				      for (int space = 1; space <= a - i; ++space) {
				        System.out.print("  ");
				        ++count;
				      }

				      while (k != 2 * i - 1) {
				        if (count <= a - 1) {
				          System.out.print((i + k) + " ");
				          ++count;
				        } else {
				          ++count1;
				          System.out.print((i + k - 2 * count1) + " ");
				        }

				        ++k;
				      }
				      count1 = count = k = 0;

				      System.out.println();
				    }				    
					System.out.println("\n");
				    System.out.println("*************************************");
					System.out.println("\n");    
				    
					int rows2 = 6, coef = 1;

				    for(int i = 0; i < rows2; i++) {
				      for(int space = 1; space < rows2 - i; ++space) {
				        System.out.print("  ");
				      }

				      for(int j = 0; j <= i; j++) {
				        if (j == 0 || i == 0)
				          coef = 1;
				        else
				          coef = coef * (i - j + 1) / j;

				        System.out.printf("%4d", coef);
				      }

				      System.out.println();
				    }
					System.out.println("\n");
				    System.out.println("*************************************");
					System.out.println("\n");     
					int rows = 4, number = 1;

				    for(int i = 1; i <= rows; i++) {

				      for(int j = 1; j <= i; j++) {
				        System.out.print(number + " ");
				        ++number;
				      }

				      System.out.println();
				    }
				    
				    System.out.println("\n");
				    System.out.println("*************************************");
					System.out.println("\n");
				    
	}
			

         }	      
	      
	    	   
	
	
	     
	
	
	










