//package codewithamit.gym;
import codewithamit.gym.AmitGym;

// Subclass all four access modifiers explain it
/*
class Using extends AmitGym
{
        void method2()
	{
        System.out.println(x);// public access in sub class
        System.out.println(y); // protected access in sub class
        // System.out.println(z);// default (no modifier) not acess in sub class
        // System.out.println(a); // private not access in sub class
        }
}
*/

public class UsingPackage{
    public static void main(String[] args) {
        System.out.println("I am using the packages");
        Using c = new Using(); 

        //World all four access modifiers explain it
	System.out.println(c.x); // public access in world another package
	/*
        System.out.println(c.y); // protected not access in world another package
        System.out.println(c.z); // default (no modifier) not access in world another package
	System.out.println(c.a); // private not access in world another package
	*/
        
    }
}
