public class Company{
	private CityCinema[] branches;
	public Company(String name, int branchCount){
		branches=new CityCinema[branchCount];
		branches[0]=new CityCinema("Emporium Cinema " , 3 , "Lahore ");
		branches[1]=new CityCinema("PackagesMall Cinema ", 2, "Lahore");
	}
	public String toString() {
        	StringBuilder sb = new StringBuilder();
		sb.append("\nCompany branches: ");
        	for (int i = 0; i < branches.length; i++) {
            	     sb.append("\n").append(branches[i]);
        	}
		return sb.toString();
	}
}