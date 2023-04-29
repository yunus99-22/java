public class Holidayis {
 //declaring variables
 private String name;
 private int day;
 private String month;
 //creating constructor that will Initialize variables
 public Holiday(String name, int day, String month) {
  this.name = name;
  this.day = day;
  this.month = month;
 }
 //sameMonth method
 public boolean sameMonth(Holidayis h) {
  //check if both month are equals
  if((h.month).equalsIgnoreCase(this.month))
   return true;
  else
   return false;
 }
 public double aveDate(Holidayis [] holidayis) {
  //declaring variable to hold sum
  double sum=0;
  //iterate over array
  for(Holidayis h:holidays) {
   //add days
   sum=sum+h.day;
  }
  //find and return average
  return sum/holidayis.length;
 }
 
 public static void main(String[] args) {
  //creating Holidayis object with values
  Holiday h=new Holidayis("Independence Day", 4, "July");
        System.out.println(h);
 }
 
 

}