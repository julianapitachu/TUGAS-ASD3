
public class MainStackFloat {

	public static void main(String[] args) {
		StackFloat stack = new StackFloat();
		
		System.out.println(stack.tinggiBadan.toString());
		
		stack.cetak();
		
		stack.push(145);stack.cetak();
		stack.push(150);stack.cetak();
		stack.push(156);stack.cetak();
		stack.push(166);stack.cetak();
		
		float nilai = stack.pop(); 
		System.out.println(nilai);
		stack.cetak();
		
		boolean terhapus = stack.isEmpty();
		System.out.println(terhapus);
	}
}
