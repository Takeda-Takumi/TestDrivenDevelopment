package gradle;

interface Expression {
    Expression plus(Expression addend);
    Money reduce(Bank bank, String to);
}
