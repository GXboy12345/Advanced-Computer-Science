public class VexStorageBoxTester {
    public static void main() {
        // System.out.println("Lorem Ipsum Dolor Sit Amet");

        VexStorageBox ethernetCables = new VexStorageBox();
        ethernetCables.inspectContents();

        ethernetCables.addItem("Some item");
        ethernetCables.checkCapacity();
        ethernetCables.inspectContents();

        ethernetCables.trashContents();
        ethernetCables.inspectContents();

        for(int i = 1; i < 6; i++) {
            ethernetCables.addItem("Trash item #" + Integer.toString(i));
        }
        ethernetCables.addItem("Test");
        ethernetCables.inspectContents();
    }

    // public int multiply(int a, int b) {
    //     return a*b;
    // }
}
