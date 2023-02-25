
public class Client {
	  private WeightAdapter Adapter;
	  
	  public Client(WeightAdapter Adapter) {
	    this.Adapter = Adapter;
	  }
	 
	  public double convertWeight(double weight) {
	    return Adapter.convert(weight);
	  }


}
