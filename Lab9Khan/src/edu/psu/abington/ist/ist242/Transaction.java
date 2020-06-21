package edu.psu.abington.ist.ist242;

import java.text.DecimalFormat;
import java.util.ArrayList;

enum PaymentType {cash, credit}

public class Transaction {

    private static DecimalFormat df2 = new DecimalFormat("1.00");

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType pType;
    private double totalPrice;
    private double subTotal;

    //Constructor Method
    public Transaction(int _transactionId, Order _order, PaymentType _pType) {
        this.transactionId = _transactionId;
        this.order = _order;
        this.pType = _pType;
    }

    //Setters and Getters
    public int getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(int _transactionId) {
        this.transactionId = _transactionId;
    }

    public Order getOrder() {
        return order;
    }


    public void setOrder(Order _order) {
        this.order = _order;
    }

    public PaymentType getPaymentType() {
        return pType;
    }


    public void setPaymentType(PaymentType _pType) {
        this.pType = _pType;
    }

    public double getSubTotal() { return subTotal; }

    public void setSubTotal(double _subTotal) {this.subTotal = _subTotal;}

    public double getTotalPrice() { return totalPrice; }

    public void setTotalPrice(double _totalPrice) {this.totalPrice = _totalPrice;}



    public double calculateTransaction(double transactionSubtotal) {
        totalPrice = transactionSubtotal;
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;}

    public static void listTransactions(ArrayList<Transaction> tList) {
        for (Transaction trans : tList) {
            System.out.println("Transaction ID: " + trans.getTransactionId());
            System.out.println("Order:" + trans.getOrder().getorderId());
            System.out.println("Payment Type: " + trans.getPaymentType());
            System.out.println("Total price: $" + df2.format(trans.getTotalPrice()));}
        }}