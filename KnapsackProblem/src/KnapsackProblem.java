import java.util.Iterator;

public class KnapsackProblem {

	public static void main(String[] args) {
		
	double[] weights =new double[] {5,10,4,7};
	double[] prices =new double[] {30,40,50,45};
	int knapsack_capacity=15;
	
	knapsack(weights,prices,knapsack_capacity);
	
	}

	//Knapsack Problem
	public static void knapsack(double[] weights, double[] prices, 
	int knapsack_capacity) {
	
	//Eşya adedi
	int N = weights.length;
	
	//Değer/ağırlık oranı
	double[] rate = new double[N];
	
	int[] indices = new int[N];
	
	for (int i = 0; i < N; i++) {
		rate[i]=(prices[i]/weights[i]);
		indices[i]=i;
		System.out.println((i+1)+". eşya için oran: "
		+rate[i]);
	}
	System.out.println();
	
	//Bubble Sort ile oranları sıralama
	for (int i = 0; i < N - 1; i++) {
	    for (int j = 0; j < N - i - 1; j++) {
	        if (rate[j] < rate[j + 1]) { 
	            double tempRate = rate[j];
	            rate[j] = rate[j + 1];
	            rate[j + 1] = tempRate;

	            int tempIndex = indices[j];
	            indices[j] = indices[j + 1];
	            indices[j + 1] = tempIndex;
	        }
	    }
	}

	System.out.println("Değer/ağırlık Oranı Sıralaması: ");
	for (int i = 0; i < rate.length; i++) {
		System.out.print("["+rate[i]+"] ");
	}
	System.out.println("\n");
	
	double totalValue = 0;
	int remainingCapacity = knapsack_capacity;

	for (int i = 0; i < N; i++) {
	    int idx = indices[i]; // Sıralanmış listeden orijinal indeksi al
	    if (weights[idx] <= remainingCapacity) {
	        // Tüm eşyayı al
	        totalValue += prices[idx];
	        remainingCapacity -= weights[idx];
	        System.out.println((idx+1) + ". eşya tamamen alındı. Kalan kapasite: " + remainingCapacity);
	    } else {
	        // Sadece kapasite kadar al (kesirli alma işlemi)
	        totalValue += prices[idx] * ((double) remainingCapacity / weights[idx]);
	        System.out.println((idx+1) + ". eşyadan " + remainingCapacity + " kg alındı.");
	        break; 
	    }
	}
	System.out.println("Maksimum değer: " + totalValue);


	
	
	
	}
	

	

	
}
