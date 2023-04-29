public class Invoice{
    private String partNo;
    private String partDesc;
    private int quantity; 
    private int price;


    public Invoice(String partNo,String pdesc,int q,int p){
        this.partNo = partNo;
        partDesc = pdesc;
        quantity = q;
        price = p;
    }

public int getInvoiceAmount(){
    if(quantity < 0)quantity = 0;
    if(price < 0)price = 0;
    return quantity * price;
    }

public static void main(String[]args){
    Invoice invoice = new Invoice("11","paid",10,1200);
    System.out.println("part number is: "+invoice.partNo);
     System.out.println("part  Description  is: "+invoice.partDesc);
      System.out.println("quantity is: "+invoice.quantity);
       System.out.println("price is: "+invoice.price);

        System.out.println("Total   amount   is  "+invoice.getInvoiceAmount());

}


}
