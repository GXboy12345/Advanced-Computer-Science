import java.util.Map;
import java.util.Arrays;
public class VexStorageBox {
    private static String SIZE;
    private String capacity;
    private Double weight; // pounds
    private String[] contents;

    public VexStorageBox() {
        this.contents = null;
        capacity = "Empty";
        weight = 1.5;
        SIZE = "Small";
    }

    public void inspectContents() {
        System.out.println(this.contents);
    }

    public void trashContents() {
    this.contents = new String[0];
    }
}
