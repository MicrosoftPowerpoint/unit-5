

package unit5;

import java.util.ArrayList;


public class LinkedPriorityQueue implements PriorityQueue {
	private ArrayList list[];
        private int size;
    String codes;
    
        
	
	public LinkedPriorityQueue(int s){
            size = s;
		list = new ArrayList[size];
                for(int x = 0; x<size; x++){
                    list[x] = new ArrayList();
                }
        
        
        }

	public Object dequeue(){
        if(list[0].isEmpty()){
        if(list[1].isEmpty()){
        if(list[2].isEmpty()){
        return "";
        }else return list[2].remove(0);
        }else return list[1].remove(0);
        }else return list[0].remove(0);
	}
	
	public void enqueue(Object obj){
		
                throw new IllegalStateException("Must give a priority");
	}
	 public void enqueue(Object o, int i) {
      list[i].add(o);
    }
	public int size(){
		return list.length;
                
	}
        public int queueSize(int i){
            return list[i].size();
        }
        public boolean hasData(){
            for(int i = 0; i < size; i++){
                if(queueSize(1)> 0)
                    return true;
            }
            return false;  
}
    public Object codes() {
    if(list[0].isEmpty()){
    if(list[1].isEmpty()){
    if(list[2].isEmpty()){
    return "";
}   else return list[2].get(0);
}   else return list[1].get(0);
}   else return list[0].get(0);}

    

    

    
}