public class Cat extends Animal{
    private boolean hasPlayedWith;
    private boolean hasBeenDeclawed;
    public Cat(String n, int a,boolean v,String c,boolean p){
        super(n,a,v,c);
        hasPlayedWith=p;
    }
    public void play(){
        hasPlayedWith=true;
        System.out.println("I have been played with");
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isHasBeenDeclawed() {
        return hasBeenDeclawed;
    }

    public void declaw(){
        hasBeenDeclawed=true;
        System.out.println("I have been declawed");
    }
}
