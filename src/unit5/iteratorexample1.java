
package unit5;

import java.util.ArrayList;
import java.util.ListIterator;

public class iteratorexample1 {
    
    static ArrayList list = new ArrayList();
    static ListIterator li;
    static int pos = 0;
 
    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        li=list.listIterator();
        
        //move 1
        System.out.println("1 - Move over Item: " + li.next());
        pos++;
      
        
        //move 2
        System.out.println("2 - Move over Item: " + li.next());
        pos++;
        
        
        //remove B
        System.out.println("3 - Remove somestuff");
        li.remove();
        pos--;
        
        
        //move 4
        System.out.println("4 - add B back in: ");
        li.add("b");
        pos++;
       
        
        //move 5
        System.out.println("5 - Move over Item: " + li.next());
        pos++;
       
    
        //move 6
        System.out.println("6 - Move backover Item: " + li.previous());
        pos--;
       
       
        //move 7
        System.out.println("7 - remove last item seen: " );
        li.remove();
        
        
        //move 8
        System.out.println("8 - Move backover Item: " + li.previous());
        pos--;
        
        //move 9
        System.out.println("9 - set last thing seen to e ");
        li.set("e");
       
        
        //move 10
        System.out.println("10 - add b back in to left of li "); 
        li.add("b");
        pos++;
      
    
        //move 11
        System.out.println("11 - add c back to left of li");
        li.add("c");
        pos++;
        
        //move 12
        System.out.println("12 - Try to remove something, wont work");
        //li.remove();
       
        //move 13
        System.out.println("13 - Move over Item: " + li.next());
        pos++;
    
        
        //move 14
        System.out.println("14 - Try to move past end of list: , this wont work");
        //li.next();
        showList();
        
        
        
    }
 
   public static void showList()
   {
       for (int x=0; x<list.size(); x++)
           
       {
           
           if(x==pos) System.out.print("*");
               System.out.print(list.get(x));
       }
       if (pos==list.size()) System.out.println("*");
        System.out.println("");// print to a new line
       
   }
    
    
}