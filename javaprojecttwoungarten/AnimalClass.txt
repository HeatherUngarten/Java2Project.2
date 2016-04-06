
public abstract class AnimalClass
{
    
    private String prefix = "I am a " ;
    private String name = "noName";
    
    public String getPrefix()
    {   
        return prefix;
    }
    
    public void setName(String n)
    {
        name = n;
    }
     
    public String getName()
    {
        return name;
    }
    public abstract String getAmimalType();
    public abstract void makeNoise();
  
    
}
