package Dynamic_Binding;

public class Werknemer implements Persoon
{
  private String naam;
	
  public Werknemer (String naam)
  {
    this.naam = naam;
  }

  public String toString ()
  {
    return (naam);
  }
  
  public String getRol()
  {
     return ("werknemer");
  }

}
