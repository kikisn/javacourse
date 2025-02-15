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

public class BillCalculatorAgain {

    public static void main(String args[]) {
        PhoneBill phoneBill1 = new PhoneBill();
        phoneBill1.setPhoneBillID(227);
        phoneBill1.setPlanFee(1500);
        phoneBill1.setMinutesUsed(200);
        phoneBill1.setAllottedMinutes(300);

        System.out.println("Phone Bill ID: " + phoneBill1.getPhoneBillID());
        System.out.println("Your Plan Fee: " + phoneBill1.getPlanFee());
        System.out.println("The minutes you used is: " + phoneBill1.getMinutesUsed());
        System.out.println("Your plan only allows: " + phoneBill1.getAllottedMinutes() + "minutes");
        System.out.println("You used an excess of: " + phoneBill1.excessMinutes());
        System.out.println("Your total overage cost is: " + phoneBill1.calculateOverage());
        System.out.println("Your total tax is: " + phoneBill1.calculateTax());
        System.out.println("Your total Bill is: " + (phoneBill1.totalBill()+phoneBill1.calculateTax()));
    }
}