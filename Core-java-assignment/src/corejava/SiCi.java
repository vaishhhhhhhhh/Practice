package corejava;

import java.util.Scanner;

public class SiCi {
	 static class Interest{
		 public void sici() {
			 System.out.println("enter principle amount");
			 Scanner sc = new Scanner (System.in);
			 int p = Integer.parseInt(sc.next());
			 System.out.println("enter rate");
			 int r = Integer.parseInt(sc.next());
			 System.out.println("enter number of time period elapsed");
			 int t = Integer.parseInt(sc.next());
		 double s=(p*t*r)/100;
		 System.out.println("simple interest =" +s);
	    	double c=p*(Math.pow ((1+r),t)-1);
	    	 System.out.println("compound interest =" +c);
	    }
	 }
	
	    public static void main (String args[]) {
	    	SiCi.Interest i=new SiCi.Interest();
	    	i.sici();
	    }
	}


