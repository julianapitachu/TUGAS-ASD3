
public class MainStackString {

	public static void main(String[] args) {
		StackString nama = new StackString();
		nama.cetak();
		
		nama.push("Julliana");nama.cetak();
		nama.push("Nurmawati");nama.cetak();
		nama.push("Risdayanti");nama.cetak();
		nama.push("Irwanti");nama.cetak();
		
		String nm = nama.pop();nama.cetak();
		System.out.println(nm);
		
		
		

	}

}
