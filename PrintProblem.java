public class PrintProblem {

	public static void main(String[] args) {
		System.out.println(print(5,'+')); //change this number
	}
	
	public static String print(int rows, char c) {
		String s="";
		int width=2*rows -1;
		int temprows= rows;
		
	while(temprows>0) {
		String nextRow = halfRow(temprows, c);
		s+=nextRow;
		if (temprows != rows && temprows != 1) {
			int remain = width- 2*nextRow.length();
			for (int i=0; i<remain;i++) {
				s+=" ";
			}
			s+=c;
		}
		if (temprows==1) {
			for (int a=0; a<width-1; a++) {
				s+=c;
			}
		}
	
		temprows--;
		s+="\n";
	}
		
		return s;
	}
	
	private static String halfRow(int rows, char c) {
		String s="";
		for(int a=0; a<rows-1;a++) {
			s+=" ";
		}
		s+=c;
		return s;
	}
}
