
public class UnweightedEdge<T> {

	
		T from;
		T to;
		
		public UnweightedEdge()
		{
			this.from=null;
			this.to=null;			
		}
		
		public UnweightedEdge(T source,T destination)
		{
			this.from=source;
			this.to=destination;
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

}
