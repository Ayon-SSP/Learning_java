package demo11;

public class Main {

	public static void main(String[] args) {
		
		String [] names=new String[3];
//for(i=0;i++,i<condition): to initialize the array
		for(int i=0;i<names.length;i++) {
			names[i]="name "+i;
		}
		
//forEach loop:When you want to display values of an array
		for(String name : names) {
			System.out.println(name);
		}

		System.out.println("names[0]="+names[0]);
		System.out.println("length of names[0]="+names[0].length());
	}
}
// length:
//For any array object we can get its number of element by
//attrubute called length
//length():
// for the length of a string we call lengt()

