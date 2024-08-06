public class CorporateOrder extends Order{
    private String company;
    private String contact;

    public CorporateOrder(String date, double amount, String state, String company, String contact) {
        super(date, amount, state);
        this.company = company;
        this.contact = contact;
    }

    public String getCompany() {
        return company;
    }

    public String getContact() {
        return contact;
    }

    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
