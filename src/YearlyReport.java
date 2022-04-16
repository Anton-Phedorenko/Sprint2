public class YearlyReport {
    private final int month;
    private final boolean isExpense;
    private final int amount;

    public YearlyReport(int month, boolean isExpense, int amount) {
        this.month = month;
        this.isExpense = isExpense;
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public boolean isIsExpense() {
        return isExpense;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "YearlyReport{" +
                "month=" + month +
                ", is_expense=" + isExpense +
                ", amount=" + amount +
                '}';
    }
}
