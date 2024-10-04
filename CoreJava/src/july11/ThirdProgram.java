package july11;

public class ThirdProgram {
	public static void main(String[] args) {
		int p,q;
        p = 11; q= 22;
        
        boolean gt = (p>q);
        System.out.println("Greater Than : "+ gt);
        
        boolean gte = (p>=q);
        System.out.println("Greater Than Equal: "+ gte);
        
        boolean lt = (p<q);
        System.out.println("Less Than : "+ lt);
        
        boolean lte = (p<=q);
        System.out.println("Less Than Equal: "+ lte);
        
        boolean equality = (p == q);
        System.out.println("Equal: "+ equality);
        
        boolean nequality = (p != q);
        System.out.println("Not Equal: "+ nequality);
	}
}
