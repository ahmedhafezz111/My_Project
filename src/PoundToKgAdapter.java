
public class PoundToKgAdapter implements WeightAdapter {
private double Pound_To_Kg_Ratio=0.45359237;

@Override
public double convert(double weight) {
	// TODO Auto-generated method stub
	return weight * Pound_To_Kg_Ratio ;
}
}
