package answers;

import java.util.Arrays;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {

		Arrays.parallelSort(portfolios);

		int maxPortfolio = Integer.MIN_VALUE;
		int val = 0;

		for (int i=0;i<portfolios.length - 1; i++){
			val = portfolios[i] ^ portfolios[i+1];
			maxPortfolio = Math.max(maxPortfolio, val);
		}


		return maxPortfolio;
	}

}
