import java.util.Date;

public class Test {
	
	enum Months {
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December

		
	}

	public static void main(String[] args) {
		//System.out.println(Months.valueOf("January") > Months.valueOf("February"));
		System.out.println(new Date(2020,8,15).getYear());
		System.out.println(new Date(2020,8,15).toString());
		new Date();
	}

}



//div[4]/div/div[1]/div/input