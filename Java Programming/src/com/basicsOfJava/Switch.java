package com.basicsOfJava;

public class Switch {
    public static void main(String[] args) {
        //Switch condition
        // based on the customer membership we will give discount on brand
		/*
		 membership Diamond=50
		 Gold=30
		 Silver=20
		 others= 10
		 */
        String brand = "Samsung";
        int productprice = 30000;
        int discount;
        int discountpercentage = 1;
        char membership;
        membership = 'D';

        switch(brand) {
            case "Samsung":
                if(membership == 'D')
                    discountpercentage = 50;
                else if(membership == 'G')
                    discountpercentage = 30;
                break;

            case "Apple":
                if (membership == 'D')
                    discountpercentage = 50;
                else if(membership == 'G')
                    discountpercentage = 30;
                else if(membership == 'S')
                    discountpercentage = 20;
                break;

            default:
                discountpercentage = 10;
        }

        discount = productprice * discountpercentage / 100;
        System.out.println("Hurray you got $:" + discountpercentage + "% discount");
        System.out.println("Total Bill Amount =" + discount);

    }
}
