import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> beratBadan = new ArrayList<Double>();
	int back = -1;
	
	public void insert (double value){
		beratBadan.add(value);
	}
	public double get(){
		double value = beratBadan.get(0);
		beratBadan.remove(0);
		return value;
	}
	public void cetak(){
		System.out.println("Values:"+ beratBadan.toString());
//		System.out.println("[");
//		boolean pertama = true;
//		for (double d : beratBadan){
//			if (pertama){
//				pertama = false;
//			}else{
//				
//			}
//		System.out.print(d);
//		System.out.println(", ");
//	}
//		System.out.print("]\n");
	}
}
