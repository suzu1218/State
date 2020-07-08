package state;

class TanoshiiState extends DogState {
    private static TanoshiiState s = new TanoshiiState();
    private TanoshiiState() {}

    public static DogState getInstance() {
        return s;
    }
    public void tukareta(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }
    public void tabeta(Dog moto) {
        // なにもしない
    }
    public void neru(Dog moto) {
    	 moto.changeState(NeteruState.getInstance());
    }
    public void okiru(Dog moto) {
    	//なにもしない
    }
    public String toString() {
        return "楽しい状態";
    }
}
