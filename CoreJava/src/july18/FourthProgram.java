package july18;

public class FourthProgram {
	int sub1,sub2,sub3,sub4,sub5;
    int total;
    double per;
        
    FourthProgram(int s1,int s2, int s3, int s4, int s5)
    {
        sub1 = s1; sub2 = s2; sub3=s3; sub4=s4; sub5=s5;    
    }
    
    double getpercent()
    {
        total = sub1+sub2+sub3+sub4+sub5;     
        per = (total/5.0);
        return per; 
    }
    
    void finalresult(double p)
    {
             if(p >=80.00)
             {
                 System.out.println("Passed with I divion");
             }
             else
             {
                 if(p >= 60.00)
                 {
                     System.out.println("Passed with II divion");        
                 }
                 else
                 {
                     if(p >=40.00)
                     {
                         System.out.println("Passed with III divion");
                     }
                     else
                     {
                         System.out.println("Failed..!!");
                         }
                 }    
             }
    }
}
