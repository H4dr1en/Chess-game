package Observable;

public interface IObservable {
	
	void attach(IObserver o);
	
	boolean detach(IObserver o);
	
	void notifyObservers();
}
