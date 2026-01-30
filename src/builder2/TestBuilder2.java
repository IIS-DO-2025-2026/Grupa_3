package builder2;

public class TestBuilder2 {
	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("integralno");
		
		builder.spread("pavlaka").spread("urnebes").meat("šunka").spread("majonez");
		
		builder.salad("zelena salata").meat("pečenica").meat("kulen");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);
	}


}
