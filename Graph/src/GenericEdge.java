
public class GenericEdge<T> {
	
	T from;
	T to;
	int cost;

	public GenericEdge(T token,T token2,int weight)
	{
		this.from= token;
		this.to=token2;
		this.cost=weight;
		
	}

	public T getFrom() {
		return from;
	}

	public void setFrom(T from) {
		this.from = from;
	}

	public T getTo() {
		return to;
	}

	public void setTo(T to) {
		this.to = to;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	

}
