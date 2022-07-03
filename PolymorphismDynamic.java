
import java.util.Scanner;
public class PolymorphismDynamic
{
 public static void main(String[] args) {
  
  //Dynamic Polymorphism
  
  Scanner scanner = new Scanner(System.in);
  AnimalD animal;
  
  System.out.println("What animal do you want?"); 
  System.out.print("(1=dog) or (2=cat): ");
  int choice = scanner.nextInt();
  
  if(choice==1) {
   animal = new DogD();
   animal.speak();
  }
  else if(choice==2) {
   animal = new CatD();
   animal.speak();
  }
  else {
   animal = new AnimalD();
   System.out.println("That choice was invalid");
   animal.speak();
  }
 }
}
