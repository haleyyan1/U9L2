public class Phone extends Electronic{
    private boolean hasCalled;
    public Phone(String b,boolean c,boolean ca){
        super(b,c);
        hasCalled=ca;
    }

    public boolean isHasCalled() {
        return hasCalled;
    }
    public void call(){
        hasCalled=true;
        System.out.println("I have called someone");
    }
}
