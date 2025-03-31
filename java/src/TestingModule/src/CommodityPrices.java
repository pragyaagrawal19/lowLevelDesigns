import java.util.*;

public class CommodityPrices {
    private final TreeMap<Long, Integer> priceMap = new TreeMap<>(); // Stores (timestamp -> price)
    private final PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Tracks max price

    // Update or add a price based on timestamp
    public void updatePrice(long timestamp, int price) {
        // If the timestamp is new, just add the price
        if (!priceMap.containsKey(timestamp)) {
            maxHeap.offer(price);
        } else {
            // If price is updated, remove the old price first
            int oldPrice = priceMap.get(timestamp);
            maxHeap.remove(oldPrice);
            maxHeap.offer(price);
        }
        priceMap.put(timestamp, price);
    }

    // Get the latest price (i.e., the most recent timestamp's price)
    public Integer getCurrentPrice() {
        return priceMap.isEmpty() ? null : priceMap.lastEntry().getValue();
    }

    // Get the maximum price ever recorded
    public Integer getMaxPrice() {
        return maxHeap.isEmpty() ? null : maxHeap.peek();
    }

    // Delete a price at a given timestamp
    public void deletePrice(long timestamp) {
        if (!priceMap.containsKey(timestamp)) {
            return;
        }
        int priceToRemove = priceMap.get(timestamp);
        priceMap.remove(timestamp);
        maxHeap.remove(priceToRemove);
    }

    public static void main(String[] args) {
        CommodityPrices tracker = new CommodityPrices();

        tracker.updatePrice(1, 100);
        tracker.updatePrice(5, 120);
        tracker.updatePrice(3, 110);
        tracker.updatePrice(7, 130);
        tracker.updatePrice(4, 105);

        System.out.println("Current Price: " + tracker.getCurrentPrice()); // Expected: 130
        System.out.println("Max Price: " + tracker.getMaxPrice()); // Expected: 130

        tracker.deletePrice(7);
        System.out.println("After Deletion - Current Price: " + tracker.getCurrentPrice()); // Expected: 120
        System.out.println("After Deletion - Max Price: " + tracker.getMaxPrice()); // Expected: 120
    }
}

