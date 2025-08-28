import java.util.Map;

public class VexStorageBox {
    public static final String SIZE = "Small";
    public String capacity = "Full";
    public Double weight = 1.5; // pounds

    public final Map<String, Double> contents;

    private VexStorageBox() {
        contents = Map.of(
            "Ethernet Cable 1", 1.0,
            "Ethernet Cable 2", 2.0,
            "Ethernet Cable 3", 3.0
        );
    }
}
