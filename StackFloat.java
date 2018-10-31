import java.util.ArrayList;

public class StackFloat {
	ArrayList<Float> tinggiBadan = new ArrayList<Float>();
	int top = -1;
	
	public void push (float i){
		top++;
		tinggiBadan.add(i);
	}
	public float pop(){
		float values = tinggiBadan.get(top);
		if(!tinggiBadan.isEmpty()){
			values = tinggiBadan.get(top);
			tinggiBadan.remove(top);
			top--;	
		}else{
			System.out.println("KOSONG");
		}
		return values;
		
	}
	public boolean isEmpty(){
		if(tinggiBadan.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	public void cetak(){
		System.out.println("Top: "+top+" -> Values:"+ tinggiBadan.toString());
	}	
}
