import java.util.Arrays;

public class VexStorageBox {
    private static int SIZE; //max items
    private int capacity; //stored items
    private Double weight; // pounds
    private String[] contents;

    public VexStorageBox() {
        this.contents = new String[0];
        capacity = 0;
        weight = 1.5;
        SIZE = 5;
    }

    public void inspectContents() {
        System.out.println((Arrays.toString(contents)));
    }

    public void checkCapacity() {
        System.out.println(Integer.toString(capacity));
    }

    public void trashContents() {
        this.contents = new String[0];
    return;
    }

    public void addItem(String item) {
        if(capacity+1 <= SIZE) {
            this.contents = Arrays.copyOf(this.contents, this.contents.length + 1);
            this.contents[this.contents.length - 1] = item;
            capacity = this.contents.length;
            return;
        }
        else {
            System.out.println("The box is already full!");
        }
    }
}
