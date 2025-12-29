class MinimumCostToAcquireItem {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1 == 0 && need2 == 0) return 0;
        long totalCost = 0;
         
        
        if(costBoth < cost1 + cost2){
            int common = Math.min(need1, need2);

            totalCost += (long) common * costBoth;
            need1 -= common ;
            need2 -= common;
        }

        totalCost += (long) need1 * Math.min(cost1, costBoth);

        totalCost += (long) need2 * Math.min(cost2, costBoth);
        

        return totalCost;
    }
}