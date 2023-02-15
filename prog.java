

public class prog {
    public static void main(String[] args) {
      Person ivanov = new Person("Иван", "Иванов", "21.05.1994",
      "Анна Иванова" ,"Игорь Иванов" );
      ivanov.display();
      Person ivanov1 = new Person("Надежда", "Иванова", "07.08.1995",
       "Наталья Сидорова" ,"Василий Сидоров" );
      ivanov1.display();

    }
}
class Person {
    private String name;
    private String surname;
    private String dayOfBirth;
    private String nameMam;
    private String nameDad;

  
    public Person( String name,String surname, String dayOfBirth, String nameMam,String nameDad) {

      this.name = name;
      this.surname = surname;
      this.dayOfBirth = dayOfBirth;
      this.nameMam = nameMam;
      this.nameDad = nameDad;
    }
    public void display(){
      System.out.println(this.name +" "+this.surname +" "+this.dayOfBirth+"  Мать: "+this.nameMam +
       ",  Отец: "+this.nameDad);
    }
    
}

