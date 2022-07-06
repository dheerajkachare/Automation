package Exceptionhandling;

public class sample 
{
		  public static void main(String[] args)
		  {
			  try 
		    {
				  // code that generate exception
		      int divideByZero = 5/0;
		      System.out.println("Rest of code in try block");
		    }
		    
		    catch (ArithmeticException e) 
		    {
		      System.out.println("ArithmeticException => " + e.getMessage());
		    }
		  }
		}

          //The try-catch block is used to handle exceptions in Java. Here's the syntax of try...catch block: