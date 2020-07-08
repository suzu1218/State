package state;

 class IrairaState extends DogState {
    private static IrairaState s = new IrairaState();
    private IrairaState() {}

    public static DogState getInstance() {
        return s;
    }
    public void tukareta(Dog moto) {
        // なにもしない
    }
    public void tabeta(Dog moto) {
        moto.changeState(TanoshiiState.getInstance());
    }
    public void neru(Dog moto) {
   	 	moto.changeState(NeteruState.getInstance());
    }
    public void okiru(Dog moto) {
    	//なにもしない
    }
    public String toString() {
        return "いらいら状態";
    }
}
