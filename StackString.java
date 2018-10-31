import java.util.ArrayList;

public class StackString {
	ArrayList<String> mahasiswa = new ArrayList<String>();
	int top = -1;
	
	public void push (String value){
		mahasiswa.add(value);
		top = top + 1;	
	}
	public String pop(){
		String value = mahasiswa.get(top);
		mahasiswa.remove(top);
		top = top - 1;
		return value;
	}	
	public void cetak(){
		System.out.println( mahasiswa.toString());
	}	
}
