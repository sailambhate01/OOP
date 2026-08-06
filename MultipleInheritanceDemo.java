package multipleinheritancedemo;


interface Animal { 
    void sound(); 
} 

interface Bird { 
    void fly(); 
} 

// Removed 'abstract' so the class can be instantiated
class Bat implements Animal, Bird { 
    public void sound() { 
        System.out.println("Bat is screeching"); // Added double quotes
    } 
    
    public void fly() { 
        System.out.println("Bat is flying"); // Added double quotes and println
    } 
} 

public class MultipleInheritanceDemo { 
    public static void main(String[] args) { 
        Animal a = new Bat(); 
        a.sound(); 
        
        Bird b = new Bat(); 
        b.fly(); 
        
        Bat bat = new Bat(); 
        bat.sound(); 
        bat.fly(); 
    }
}
