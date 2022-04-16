public class YearlyReport {
private  int month;
private boolean isExpense;
private int amount;

    public YearlyReport(int month, boolean is_expense, int amount) {
        this.month = month;
        this.isExpense = is_expense;
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
