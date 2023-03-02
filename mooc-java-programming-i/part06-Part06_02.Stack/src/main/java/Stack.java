import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
       //returns value of the object variable
       return this.stack;
    }

    public String take() {
            int lastElement = this.stack.size() - 1;
            String taken = this.stack.remove(lastElement);
            return taken;
    }
}


