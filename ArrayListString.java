import java.util.ArrayList;
public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		
		for(int i = 0; i < 10;i++){
			data.add(i + "");
		}
		data.add("Jeruk");
		
		System.out.println("----");
		System.out.println("Jumlah data : " + data.size());
		for(int i = 0;i < data.size();i++){
			System.out.print(data.get(i));
		}
		System.out.println(" \n ");
	}

}
