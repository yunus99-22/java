class Item {
    private String name;
    private double fullPrice;
    private double salesPrice;

    public Item(String name, double fullPrice, double salesPrice) {
        this.name = name;
        this.fullPrice = fullPrice;
        this.salesPrice = salesPrice;
    }

    public Item(String name, double fullPrice) {
        this(name, fullPrice, fullPrice / 2);
    }

    public static String format(double value) {
        if (value < 0) {
            return "$0.00";
        }
        String formatted = String.format("%.2f", value);
        if (formatted.indexOf(".") == formatted.length() - 2) {
            formatted += "0";
        }
        return "$" + formatted;
    }

    public String toString() {
        return String.format("Item: %s Full price: %s Sales price: %s",
                name, format(fullPrice), format(salesPrice));
    }
     public static void main(String[] args) {
        Item item1 = new Item("Keyboard", 59.99, 49.99);
        Item item2 = new Item("Monitor", 199.99);
        Item item3 = new Item("Mouse", 29.99, 24.99);
        Item item4 = new Item("Headphones", 99.99, 74.99);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);

        System.out.println(Item.format(-10.0));
        System.out.println(Item.format(0.0));
        System.out.println(Item.format(10.1));
        System.out.println(Item.format(10.123456));
    }
    

}