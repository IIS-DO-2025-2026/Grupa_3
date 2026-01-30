package builder2;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	private String bread;
	private List<String> spreads;
	private List<String> meats;
	private List<String> salads;
	

	public Sandwich(Builder builder) {
		this.bread = builder.bread;
		this.spreads = builder.spreads;
		this.meats = builder.meats;
		this.salads = builder.salads;
	}
	
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads + "]";
	}



	public static class Builder {
		private String bread;
		private List<String> spreads;
		private List<String> meats;
		private List<String> salads;
		
		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<String>();
			meats = new ArrayList<String>();
			salads = new ArrayList<String>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}
		
		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}
		
		public Builder salad(String salad) {
			salads.add(salad);
			return this;
		}
		
		public Sandwich build() {
			return new Sandwich(this);
		}
		
		
	}

}
