

package unit5;


public class Task {
    
        private String name;
        private String description;
   
        
        public String getName() {
        return name;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" + "name=" + name + ", description=" + description + '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean validate()
    {
        if(name==null || description == null || name.equals("") || description.equals("") )
            return false;
        else 
            return true;
    }
    
        
}
