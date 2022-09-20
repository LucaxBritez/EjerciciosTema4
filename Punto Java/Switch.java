public class Switch{
  public static void main(String args[]){
    String estacion = "Verano";
	switch(estacion){
	  
	  case "Verano":
	    System.out.println("Es Verano");
	    break;
	  
	  case "Invierno":
	    System.out.println("Es Invierno");
	    break;
	  
	  case "Otoño":
	    System.out.println("Es Otoño");
	    break;
	  
	  case "Primavera":
	    System.out.println("Es Primavera");
	    break;
	  default:
	    System.out.println("Estoy en default");
	    break;
	  }
  }

}