package corejava;

public class ArmstrongNumBetweenRange {
	 static class armstrongNumbersInRange{
		 public void armstrong() {
			 int a=0,b=0,c;
			 for(int i=100;i<=999;i++)
				 
			 {
				 c=i;
			       for(int j=i;j>0;){
			           a=j%10;
			           b=b+a*a*a;
			           a=0;
			           j=j/10;
			       }
			       if(c==b)
			    	   System.out.println(b);
			       b=0;
			 }
		 }
	 }

	    public static void main (String [] args) {
	    	ArmstrongNumBetweenRange.armstrongNumbersInRange a=new ArmstrongNumBetweenRange.armstrongNumbersInRange();
	         a.armstrong();
	    }
		 }

