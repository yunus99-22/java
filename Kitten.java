public class Kitten{
    private String name;
    private String owner;private static int age;

    public Kitten( String name,String owner){
        this.name = name ;
        this.owner = owner;
    }

    public int getage(){
        return age;
    }

    public static void haveBirthday(){
        age += 1;
        System.out.println(age);
    }

    public String tostring(){
        return name + "is " + age + " "+ "and belongs to " + owner;
    }
      public static void main(String[]args){
        Kitten kit = new Kitten("lucas","ruvugo");

        kit.haveBirthday();
        kit.haveBirthday();
        kit.haveBirthday();
        kit.haveBirthday();
        kit.haveBirthday();
        kit.haveBirthday();
        kit.haveBirthday();
        
          
             
             
    System.out.println(kit.tostring());
      }
    
}