import java.util.Scanner;

/**
 * GestioneMenu
 */
public class MenuManager {

  Scanner scan = new Scanner(System.in);

  private Stack q = new Stack();

  public boolean add(){
    String code, name, lastName;

    System.out.println("Type name: ");
    name = scan.nextLine();
    System.out.println("Type last name: ");
    lastName = scan.nextLine();
    System.out.println("Type code: ");
    code = scan.nextLine();

    Person p = new Person(code, name, lastName);
    
    return true;
  }

  public void del(){

  }
  

  public void read(){

  }
}