package CopyFizzBuzzCat;

public class CopyFizzBuzzCatPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the message to the user that what the program work for.  
		System.out.println("Print Numbers 1 to 100");
		// for loop that is used to initializes value ,check at maximum limits and increment the value by one.
		for(int i=1;i<=100;i++){
			if(i%2==0 && i%3==0 && i%5==0 && i%10==0)// check the print number is multiply by 2,3,5 and 10
			{
				System.out.println("CopyFizzBuzzCat");	
			}
			else if(i%2==0 && i%3==0 && i%5==0){// check the print number is multiply by 2,3 and 5
				System.out.println("CopyFizzBuzz");	
			}
			else if(i%2==0 && i%5==0 && i%10==0){// check the print number is multiply by 2 and 3
				System.out.println("CopyBuzzCat");
			}
			else if(i%2==0 && i%3==0){// check the print number is multiply by 2 and 3
				System.out.println("CopyFizz");
			}
			
			else if(i%2==0 && i%5==0){// check the print number is multiply by 2 and 5
				System.out.println("CopyBuzz");
			}
			else if(i%2==0 && i%10==0){// check the print number is multiply by 2 and 10
				System.out.println("CopyCat");
			}
			
			else if(i%2==0){// check the print number is multiply by 2 
				System.out.println("Copy");
			}
			else if(i%3==0 && i%5==0 && i%10==0){// check the print number is multiply by 3,5 and 10
				System.out.println("FizzBuzzCat");	
			}
				
			else if(i%3==0 && i%5==0){// check the print number is multiply by 3 and 5
				System.out.println("FizzBuzz");//Print the message if it is multiply with both.
			}
			else if(i%3==0){// check the print number is multiply by 3 
				System.out.println("Fizz");//Print the message if it is multiply with
			}
			else if(i%5==0 && i%10==0)// check the print number is multiply by 5 and 10
			{
				System.out.println("BuzzCat");//Print the message if it is multiply with
			}
			else if(i%5==0){// check the print number is multiply by 5 
				System.out.println("Buzz");
			}
			else if(i%10==0){// check the print number is multiply by 10
				System.out.println("Cat");
			}
			
			else
				System.out.println(i);//Print the message if it is not  multiply with both number.
		}
		
	}

}
