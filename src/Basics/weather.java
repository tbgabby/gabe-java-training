package Basics;
public class weather {
	public static void main(String[] args) {
		int temp = 83;
		String sunCondition = "overcast";
		if (temp > 80) {
			System.out.println("Pleasant day. Wear shorts and t-shirt");
		} else if ((temp > 60) && (sunCondition != "sunny")) {
			System.out.println("Day is warmer. Put on something comfortable.");
			System.out.println("Wear a hat to keep the sun away from your eyes.");
		} else if ((temp > 40) || (sunCondition != "overcast")) {
			System.out.println("Day seems cooler. Make sure you wear long-sleeve and jeans.");
		} else {
			System.out.println("Cold day. Bring a blanket.");
		}
	}
}