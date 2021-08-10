public class PrintProblem {

	public static void main(String[] args) {
		System.out.println(print(5,'+'));
	}
	
	public static String print(int rows, char c) {
		String s="";
		int width=2*rows -1;
		
	while(rows>0) {
		for (int i=0; i<width;i++) {
			for(int a=0; a<rows-1;a++) {
				s+=" ";
			}
			s+=c;
		}
		rows--;
		s+="\n";
	}
		
		return s;
	}
}
