package com.ironhack;

import java.util.*;

public class Invoice {

    private String id;
    private double total;
    private boolean isPaid;
    private ArrayList<InvoiceItem> invoiceItems;

    public Invoice(String id, double total, boolean isPaid, ArrayList<InvoiceItem> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", invoiceItems=" + invoiceItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.getTotal(), getTotal()) == 0 && isPaid() == invoice.isPaid() && Objects.equals(getId(), invoice.getId()) && Objects.equals(getInvoiceItems(), invoice.getInvoiceItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTotal(), isPaid(), getInvoiceItems());
    }
}
