import java.util.Map;

public class VexStorageBox {
    private static String SIZE;
    private String capacity;
    private Double weight; // pounds
    private final Map<String, Double> contents;

    public VexStorageBox() {
        contents = Map.of(
            "Ethernet Cable 1", 1.0,
            "Ethernet Cable 2", 2.0,
            "Ethernet Cable 3", 3.0
        );
        capacity = "Empty";
        weight = 1.5;
        SIZE = "Small";
    }
}
