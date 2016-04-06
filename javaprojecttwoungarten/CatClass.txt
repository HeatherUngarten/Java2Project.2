
public class CatClass extends AnimalClass
{

    private String noise = "Meow, meow, meow!!!! ";
    
    @Override
    public String getAmimalType()
    {
       return "Cat"; 
    }    
    
    @Override
    public void makeNoise()
    {
        System.out.println(noise);
    }
    
    public void doKittyThings()
    {
        System.out.println("I'm tearing up your couch and leaving mice around.");
    }    
    
}
