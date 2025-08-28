import java.util.Map;

public class VexStorageBox {
    public static final String SIZE = "Small";
    public String capacity = "Full";
    public float weight = 1.5f; // pounds

    public final Map<String, Float> contents;

    public VexStorageBox() {
        contents = Map.of(
            "Ethernet Cable 1", 1f,
            "Ethernet Cable 2", 2f,
            "Ethernet Cable 3", 3f
        );
    }
}
