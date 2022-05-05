public class Person {
    private String code;
    private String name;
    private String lastName;

    
    
    public Person() {}
    public Person(String code, String name, String lastName) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona [code=" + code + ", lastName=" + lastName + ", name=" + name + "]";
    }
}
