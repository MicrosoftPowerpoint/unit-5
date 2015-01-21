package unit5;


public class RadioShow {

    public static void main(String[] args) {
               LinkedQueue phoneline = new LinkedQueue();
               //3 people call in
               phoneline.enqueue(new Caller("Bob"));
               phoneline.enqueue(new Caller("JOE"));
               phoneline.enqueue(new Caller("cindy"));
               //take the next caller
               System.out.println("Take next caller");
               System.out.println(phoneline.dequeue());
               // 2 more people call in
               phoneline.enqueue(new Caller("geor"));
               phoneline.enqueue(new Caller("jeus"));
               //take the next 3 caller
               System.out.println("Take next 3 caller");
               System.out.println(phoneline.dequeue());
               System.out.println(phoneline.dequeue());
               System.out.println(phoneline.dequeue());
              //who is next? 
               System.out.println("Next caller will be: " + phoneline.peekFront());
               //how many callers left?
               System.out.println("Callers still waiting: " + phoneline.size());
               
               
    }
    
}
