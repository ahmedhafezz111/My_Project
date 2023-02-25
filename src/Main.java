
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WeightAdapter adapter= new PoundToKgAdapter();
Client client = new Client(adapter);

//Use the client to convert a weight from pounds to kilograms
double weightInPounds = 100.0;
double weightInKg = client.convertWeight(weightInPounds);
System.out.println(weightInPounds + " pounds is " + weightInKg + " kilograms.");

	}

}
