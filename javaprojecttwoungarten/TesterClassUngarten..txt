
public class TesterClassUngarten 
{
    public static void main(String[] args) 
    {
        //test cat class
        System.out.println("Non-Polymorphic:");
        CatClass  cat1 = new CatClass();
        cat1.setName("Fluffy");
        System.out.println(cat1.getPrefix() + cat1.getAmimalType());
        cat1.doKittyThings();
        cat1.makeNoise();
        System.out.println("My name is " + cat1.getName());
            
        //Polymorphic version
        System.out.println ("\nPolymorphic version: ");
        AnimalClass an1 = new CatClass();
        an1.setName("Polymorphic Fluffy");
        System.out.println(an1.getPrefix() + an1.getAmimalType());
        ((CatClass)an1).doKittyThings();
        ((CatClass)an1).makeNoise();
        System.out.println("My name is " + ((CatClass)an1).getName()+ "\n");
       //end cat test
        
    
        //test dog class
        System.out.println("Non-Polymorphic");
        DogClass dog1 = new DogClass();
        dog1.setName("Sir Barks A-lot");
        System.out.println(dog1.getPrefix() + dog1.getAmimalType());
        dog1.doDoggyThings ();
        dog1.makeNoise();
        System.out.println("My name is " + dog1.getName());
        
        System.out.println("\nPolymorphic version:");
        AnimalClass an2 = new DogClass();
        an2.setName("Polymorphic Sir Barks A-lot");
        System.out.println(an2.getPrefix () + an2.getAmimalType());
        ((DogClass)an2).doDoggyThings();
        ((DogClass)an2).makeNoise();
        System.out.println("My name is " + ((DogClass)an2).getName() + "\n");
    
        //test chicken class
        System.out.println("Non-Polymorphic");
        ChickenClass chicken1 = new ChickenClass();
        chicken1.setName("Sir Clucks A-lot");
        System.out.println(chicken1.getPrefix() + chicken1.getAmimalType());
        chicken1.doChickenThings ();
        chicken1.makeNoise();
        System.out.println("My name is " + chicken1.getName());
        
        System.out.println("\nPolymorphic version:");
        AnimalClass an3 = new ChickenClass();
        an3.setName("Polymorphic Sir Clucky");
        System.out.println(an3.getPrefix () + an3.getAmimalType());
        ((ChickenClass)an3).doChickenThings();
        ((ChickenClass)an3).makeNoise();
        System.out.println("My name is " + ((ChickenClass)an3).getName()+ "\n");
    }
    
}
