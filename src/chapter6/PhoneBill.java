package chapter6;
/*
So, a phone bill should have an ID, a base class, a
number of allotted minutes and a number of minutes used.
And then, it should also be able to calculate the overage,
calculate the tax, and calculate the total.
And then, it should also be able to print an itemized bill.
You should also include three constructors
a default one
one that accepts the ID only
one that accepts all fields
Now no matter which of these constructors you use, all fields should be set eventually.
Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */
public class PhoneBill {
    private int phoneBillID;
    private double planFee;
    private int allottedMinutes;
    private double minutesUsed;

    public PhoneBill (){
        phoneBillID = 0;
        planFee = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill (int phoneBillID){
        setPhoneBillID(phoneBillID);
    }

    public PhoneBill (int phoneBillID, double planFee, int allottedMinutes, double minutesUsed){
        setPhoneBillID(phoneBillID);
        setPlanFee(planFee);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }

    public double getPhoneBillID(){
        return phoneBillID;
    }

    public void setPhoneBillID(int phoneBillID){
        this.phoneBillID = phoneBillID;

    }

    public double getPlanFee(){
        return planFee;
    }

    public void setPlanFee(double planFee){
        this.planFee = planFee;

    }

    public double getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double excessMinutes(){
        return minutesUsed - allottedMinutes;
    }
    public double calculateOverage () {
        if (minutesUsed <= allottedMinutes) {
            return 0;
        }

        double overageRate = 0.25;
        return excessMinutes() * overageRate;
    }


    public double totalBill(){
        return planFee + calculateOverage();
    }

    public double calculateTax(){
        double tax = 0.15;
        return totalBill() * tax;
    }

}
