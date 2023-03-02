import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> mylist;

    public TodoList() {
        this.mylist = new ArrayList<>();
    }

    public void add(String task) {
        this.mylist.add(task);
    }

    public void print() {
        for (String item : this.mylist){
            System.out.println((this.mylist.indexOf(item) + 1) + ": " + item);
        }
    }

    public void remove(int number) {
        int index = number - 1;
        this.mylist.remove(index);
    }
}
