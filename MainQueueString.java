
public class MainQueueString {

	public static void main(String[] args) {
		QueueString nama = new QueueString();
		nama.cetak();
		
		nama.push("Julliana");nama.cetak();
		nama.push("Nurmawati");nama.cetak();
		nama.push("Risdayanti");nama.cetak();
		nama.push("Irwanti");nama.cetak();
		
		String nm = nama.pop();nama.cetak();
		System.out.println(nm);

	}

}
