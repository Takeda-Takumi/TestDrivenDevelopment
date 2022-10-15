package gradle;

interface Expression {
    Money reduce(Bank bank, String to);
}
