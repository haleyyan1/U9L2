public class Computer extends Electronic{
    private boolean hasKeyboard;
    public Computer(String b,boolean c,boolean k){
        super(b,c);
        hasKeyboard=k;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }
    public void getKeyboard(){
        hasKeyboard=true;
        System.out.println("I am connected to a keyboard");
    }
}
