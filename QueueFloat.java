import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> tinggiBadan = new ArrayList<Float>();
	int back = -1;
	
	public void insert (float value){
		tinggiBadan.add(value);
	}
	public float get(){
		float value = tinggiBadan.get(0);
		tinggiBadan.remove(0);
		return value;
	}
	public void cetak(){
		System.out.println("Values:"+ tinggiBadan.toString());
//		System.out.println("[");
//		boolean pertama = true;
//		for (float d : container){
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


