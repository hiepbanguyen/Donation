package ie.app.models;

public class Donation
{
    public String _id;
    public int amount;
    public String paymenttype;
    public int upvotes;
    public String date = "19-04-2022";
    public Donation (String _id ,int amount, String paymenttype, int upvotes)
    {
        this.amount = amount;
        this.paymenttype = paymenttype;
        this.upvotes = upvotes;
        this._id = _id;
    }
    public Donation ()
    {
        this.amount = 0;
        this.paymenttype = "";
        this.upvotes = 0;
    }

    public Donation(int donatedAmount, String method, int i) {
        this.amount = donatedAmount;
        this.paymenttype = method;
        this.upvotes = i;
    }

    public int getAmount() {
        return amount;
    }

    public String toString()
    {
        return _id + ", " + amount + ", " + paymenttype + ", " + upvotes;
    }
}
