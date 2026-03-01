public class OOPSBannerApp {

    public static void main(String[] args) {
        
        String[] oopsBanner = {
            String.join("  ", " ***", " ***", "**** ", " ****"),
            String.join("  ", "* *", "* *", "* *", "* "),
            String.join("  ", "* *", "* *", "* *", "* "),
            String.join("  ", "* *", "* *", "**** ", " *** "),
            String.join("  ", "* *", "* *", "* ", "    *"),
            String.join("  ", "* *", "* *", "* ", "    *"),
            String.join("  ", " ***", " ***", "* ", "**** ")
        };

        // Traverse the array using an enhanced for-loop
        for (String line : oopsBanner) {
            System.out.println(line);
        }
    }
}
