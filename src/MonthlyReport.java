public class MonthlyReport {
    private String item_name;
    private boolean isExpense;
    private int quantity;
    private int sumOfOne;

    public MonthlyReport(String item_name, boolean isExpense, int quantity, int sumOfOne) {
        this.item_name = item_name;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    public String getItem_name() {
        return item_name;
    }

    public boolean isIs_expense() {
        return isExpense;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSumOfOne() {
        return sumOfOne;
    }

    @Override
    public String toString() {
        return "MonthlyReport{" +
                "item_name='" + item_name + '\'' +
                ", is_expense=" + isExpense +
                ", quantity=" + quantity +
                ", sumOfOne=" + sumOfOne +
                '}';
    }
}

