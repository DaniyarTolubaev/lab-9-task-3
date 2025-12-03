public class Main {
    public static void main(String[] args) {

        Account acc = new Account("Daniyar", 500, "PL11-2222-3333");

        try {
            System.out.println("Trying to translate 1000...");
            acc.transfer(1000);

        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("An unexpected error has occurred!");
            e.printStackTrace();

        } finally {
            System.out.println("Current balance: " + acc.getBalance());
        }
    }
}
