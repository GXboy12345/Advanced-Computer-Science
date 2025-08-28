public class VexStorageBoxTester {
    public static void main() {
        // System.out.println("Lorem Ipsum Dolor Sit Amet");

        // Init
        VexStorageBox ethernetCables = new VexStorageBox(5);

        // Check it's empty
        ethernetCables.inspectContents();

        //Add one item
        ethernetCables.addItem("Some item");
        ethernetCables.checkCapacity();
        ethernetCables.inspectContents();

        // Trash contents
        ethernetCables.trashContents();
        ethernetCables.inspectContents();

        //Check for overflow func
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
