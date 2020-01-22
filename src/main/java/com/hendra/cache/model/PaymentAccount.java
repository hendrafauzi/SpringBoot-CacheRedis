package com.hendra.cache.model;

import java.io.Serializable;
import java.util.Date;

public class PaymentAccount implements Serializable
{
    private String paymentId;
    private CustomerInfo customerInfo;
    private double balance;
    private Date date;

    public PaymentAccount()
    {
        //Empty Construct
    }

    public PaymentAccount(String paymentId, CustomerInfo customerInfo, double balance, Date date)
    {
        this.paymentId = paymentId;
        this.customerInfo = customerInfo;
        this.balance = balance;
        this.date = date;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "PaymentAccount{" +
                "paymentId='" + paymentId + '\'' +
                ", customerInfo=" + customerInfo +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
