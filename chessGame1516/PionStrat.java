
public class PionStrat {
	
	//create an object of SingleObject
	private static PionStrat instance = new PionStrat();

  	//make the constructor private so that this class cannot be
  	//instantiated
  	private PionStrat(){}

   	//Get the only object available
   	public static PionStrat getInstance(){
   		return instance;
   	}
   	
   	public boolean isMoveOK() {
   		return false;
   	}
}
