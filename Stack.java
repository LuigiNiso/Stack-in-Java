public class Stack {
    private final int MAX_PERSON = 5;
    private Person list[] = new Person[MAX_PERSON];
    private int stkpntr = 0;
    
    public Stack(){}

    public boolean push(Person p){
        if(stkpntr < list.length-1){
            list[stkpntr] = p;
            stkpntr ++;
            return true;
        }else{
            return false;
        }
    }

    public Person pull(){
        stkpntr --;
        if(stkpntr < 0){
            stkpntr = 0;
            return null;
        }
        return list[stkpntr];
    }

    public Person[] read(){
        Person stack[] = new Person[stkpntr];
        for(int i = 0; i < stkpntr; i++){
            stack[i] = list[i];
        }

        return stack;
    }
}    