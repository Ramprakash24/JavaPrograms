package coding;
// Question from Blackrock San Francisco
public class StockProfit {
	public static void main(String args[]) {
		int[] stockArray = {100,99,100,101,80};
		StockProfit sp = new StockProfit();
		System.out.println(sp.findStockProfit(stockArray));
	}

	private String findStockProfit(int[] stockArray) {
		int buyIndex = 0;
		int sellIndex = 1;
		int maxProfit = stockArray[sellIndex] - stockArray[buyIndex];
		int minElement = stockArray[buyIndex];
		for(int i = 1; i < stockArray.length; i++) {
			if(stockArray[i] - minElement > maxProfit) {
				maxProfit = stockArray[i] - minElement;
				sellIndex = i;
				System.out.println("sellIndex:"+sellIndex);
			}
				
			if(stockArray[i] < minElement) {
				minElement = stockArray[i];
				if(i < sellIndex)
					buyIndex = i;
				System.out.println(buyIndex);
			}
		}
		String outPut = "BUY@"+stockArray[buyIndex]+" on day "+ buyIndex 
				+" and SELL@"+ stockArray[sellIndex] 
				+" on day "+sellIndex+". For a profit of$"+maxProfit+" per share";
		return outPut;
	}
}
