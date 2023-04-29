public class List1{
    public static void main(String[] args) {
        String[] fruits = {"mango", "banana", "watermalon", "cassava", "apple"};
        //fruits[4] = "orrange";

        //System.out.println(fruits.length);

       /* for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }*/

        for (String i : fruits) {
            System.out.println(i);
        }
    }
}