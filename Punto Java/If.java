import java.util.Scanner;

class If{
  
  
  
  public static void main(String args[]){
    int numerolf = 0;
	Scanner escaner = new Scanner(System.in);
	System.out.println("Introduce tu numero");
	numerolf = escaner.nextInt();
	
	if(numerolf > 0){
	  System.out.println("Numerolf es positivo");
	} else if(numerolf < 0){
	    System.out.println("Numerolf es negativo");
	} else if(numerolf == 0){
	    System.out.println("Numerolf es neutro");
	}
	
	}
  }