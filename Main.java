package inherotance;

class animal{
    void eat() {
		System.out.println("this animal eats food.");
	}
}

class dog extends animal {
	  void bark() {
		  System.out.println("the dog barks.");
	  }
}
 

public class Main {
	  public static void main(String[] args) {
		  
		  dog myDog = new dog();
		  
	      myDog.eat();
		  myDog.bark();
		  
	 }
}