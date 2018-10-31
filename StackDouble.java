import java.util.ArrayList;

public class StackDouble {
	ArrayList<Float> beratBadan = new ArrayList<Float>();
	int top = -1;
	
	public void push (float i){
		top++;
		beratBadan.add(i);
		
	}
	public float pop(){
		
		float values = 99999999;
		if(!beratBadan.isEmpty()){
			values = beratBadan.get(top);
			beratBadan.remove(top);
			top--;	
		}else{
			System.out.println("KOSONG");
		}
		return values;
	}
	public boolean isEmpty(){
		if(beratBadan.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	public void cetak(){
		System.out.println("Top: "+top+" -> Values:"+ beratBadan.toString());
	}	
}
