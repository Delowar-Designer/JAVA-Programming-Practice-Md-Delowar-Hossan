
package basicjava;


public class Java12_Format_Specifler {
    public static void main (String [] args){
        
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.22;
        
        
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("Characetr c = %c\n",c);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("integer i = %d\n",i);
        System.out.printf("float f = %.1f\n",f);
        System.out.printf("double d = %.3f\n",d);
        
    }
    
}
