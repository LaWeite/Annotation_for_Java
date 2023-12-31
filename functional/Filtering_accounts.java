import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Retrying {
    public static void printFilteredAccounts(List<Account> accounts) {
        List<Account> nonEmptyAccounts = filter(accounts, account -> account.getBalance() > 0);
        List<Account> accountsWithTooMuchMoney = filter(nonEmptyAccounts, account -> account.getBalance() >= 100000000 && !account.isLocked());

        // Please, do not change the code below
        nonEmptyAccounts.forEach(a -> System.out.print(a.getNumber() + " "));
        accountsWithTooMuchMoney.forEach(a -> System.out.print(a.getNumber() + " "));
    }

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        return elems.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());
            List<Account> accounts = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] values = scanner.nextLine().split("\\s+");
                Account acc = new Account(
                        values[0], 
                        Long.parseLong(values[1]), 
                        Boolean.parseBoolean(values[2])
                );
                accounts.add(acc);
            }

            printFilteredAccounts(accounts);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static class Account {
        private String number;
        private long balance;
        private boolean locked;

        public Account(String number, long balance, boolean locked) {
            this.number = number;
            this.balance = balance;
            this.locked = locked;
        }

        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }

        public boolean isLocked() {
            return locked;
        }

        public void setLocked(boolean locked) {
            this.locked = locked;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "number='" + number + '\'' +
                    ", balance=" + balance +
                    ", isLocked=" + locked +
                    '}';
        }
    }
}
