package state;

public class NeteruState extends DogState {

	private static NeteruState s = new NeteruState();
    private NeteruState() {}

    public static DogState getInstance() {
        return s;
    }
    public void tukareta(Dog moto) {
        //なにもしない
    }
    public void tabeta(Dog moto) {
        //なにもしない
    }
    public void neru(Dog moto) {
    	//なにもしない
    }
    public void okiru(Dog moto) {
    	moto.changeState(FutsuuState.getInstance());
    }
    public String toString() {
        return "寝てる状態";
    }
}
