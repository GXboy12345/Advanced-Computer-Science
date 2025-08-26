import java.util.HashMap;
import java.util.Map;

public class VexStorageBox {
    public final String size = "Small";
    public String capacity = "Full";
    public float weight = 1.5f; //pounds
    /*
    public String[] contents = {
        "Ethernet Cable 1", 
        "Ethernet Cable 2", 
        "Ethernet Cable 3"
    };
    */
    public Map<String, String> contents;

    public VexStorageBox() {
        this.contents = new HashMap();
    }

    public void openBox() {
        System.out.println("Opening the Vex Storage Box...");
    }
}