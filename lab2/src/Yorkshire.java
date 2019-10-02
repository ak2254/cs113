// *****************************************************************
// Yorkshire.java
//

 public class Yorkshire extends Dog
{
	 int breedWeight = 75;
private String color;
public Yorkshire(String name, String color )
{
super(name);
this.color = color;
}
// -------------------------------------------------------------
// Small bark -- overrides speak method in Dog
// -------------------------------------------------------------
public String speak()
{
return "woof";
}
@Override
public int avgBreedWeight() {
	
	return breedWeight;
}
}
// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

  
