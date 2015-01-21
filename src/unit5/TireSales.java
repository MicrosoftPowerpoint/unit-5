

package unit5;


public class TireSales {

   
    public static void main(String[] args) {
      ArrayStack pole = new ArrayStack();
      //add 4 tires
      pole.push(new Tire ("goodyear"));
      pole.push(new Tire ("goodyear"));
      pole.push(new Tire ("goodyear"));
      pole.push(new Tire ("goodyear"));
      //sell 2 tires
        System.out.println("Selling 2 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        //add 4 more tires to pole
        pole.push(new Tire("micheline"));
        pole.push(new Tire("micheline"));
        
        System.out.println("Selling 3 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println(pole.pop());
         
      }
    }
    

