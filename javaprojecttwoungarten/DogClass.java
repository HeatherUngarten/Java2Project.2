
public class DogClass extends AnimalClass
{

    private String noise = "Bark, bark bark!!! ";
    
    @Override
    public String getAmimalType()
    {
       return "Dog"; 
    }
    
    public void makeNoise()
    {
        System.out.println(noise);
    }
    
    public void doDoggyThings()
    {
        System.out.println("I'm digging a hole, and burying my bone!");
    }
}

