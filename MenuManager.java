import java.util.Scanner;

/**
 * GestioneMenu
 */
public class MenuManager {

  Scanner scan = new Scanner(System.in);

  private Stack s = new Stack();

  public boolean add(){
    String code, name, lastName;

    System.out.println("Type name: ");
    name = scan.nextLine();
    System.out.println("Type last name: ");
    lastName = scan.nextLine();
    System.out.println("Type code: ");
    code = scan.nextLine();

    Person p = new Person(code, name, lastName);
    
    return (s.push(p)) ? true : false;
  }

  public void del(){
    Person p = s.pull();
    if(p == null){
      System.out.println("Stack is empty.");
    }else{
      System.out.println("Person removed: " + p.getname() + " " + p.getLastName() + " " + p.getCode());
    }
  }
  

  public void read(){
    for (Person p : s.read()) {
      System.out.println(p);
    }
  }
}