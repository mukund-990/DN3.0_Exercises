public class TestBuilder {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder().build();
        System.out.println("Computer 1: " + computer1.getCpu() + ", " + computer1.getRam() + "GB RAM, " + computer1.getStorage() + "GB Storage");

        Computer computer2 = new Computer.Builder()
                .cpu("Intel Core i7")
                .ram(16)
                .storage(512)
                .build();
        System.out.println("Computer 2: " + computer2.getCpu() + ", " + computer2.getRam() + "GB RAM, " + computer2.getStorage() + "GB Storage");
    }
}