public class VariableScope {
    // Declare the Global Variable
    static int globalCount = 100;

    // Main method
    public static void main(String[] args) {
        // Print globalCount in main
        System.out.println("Global Count (from main): " + globalCount);

        // Call showScope
        showScope();
    }

    // showScope method
    public static void showScope() {
        // Declare localCount variable
        int localCount = 50;

        // Print globalCount and localCount
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
