
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble stack = new StackDouble();
		
		System.out.println(stack.beratBadan.toString());
		
		stack.cetak();
		
		stack.push(40);stack.cetak();
		stack.push(50);stack.cetak();
		stack.push(55);stack.cetak();
		stack.push(60);stack.cetak();
		
		double nilai = stack.pop(); 
		System.out.println(nilai);
		stack.cetak();
		
		boolean kosongkah = stack.isEmpty();
		System.out.println(kosongkah);
	}
}
