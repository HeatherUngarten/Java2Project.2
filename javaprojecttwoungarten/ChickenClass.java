public class ChickenClass extends AnimalClass
{

    private String noise = "Cluck, cluck cluck!!! ";
    
    @Override
    public String getAmimalType()
    {
       return "Chicken"; 
    }
    
    @Override
    public void makeNoise()
    {
        System.out.println(noise);
    }
    
    public void doChickenThings()
    {
        System.out.println("I am pecking at the ground!! YAY! ");
    }
    
    

            
}

