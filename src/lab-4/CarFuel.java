public class CarFuel {

    int minRefill(int total_distance, int full_tank, int stops[], int no_of_stops) {
        int last_refill = 0, current_refill = 0, min_stops = 0;

        while(total_distance > 0) {
            last_refill = current_refill;
            while(current_refill < no_of_stops-1 && (stops[current_refill + 1] - stops[last_refill]) <= full_tank) {
                // System.out.println(current_refill+" "+last_refill);
                current_refill++;
            }
            if(current_refill == last_refill)
                return -1;
            if(current_refill < no_of_stops)
                min_stops++;
            total_distance -= stops[current_refill];
        }
        return min_stops;
}
    

    public static void main(String args[]) {
        int tot_dist, full_tank, no_of_stops, min_refills;
        tot_dist = 900; full_tank = 400; no_of_stops = 4;
        int stops[] = {275,375,550,750};
  
        CarFuel obj = new CarFuel();
        min_refills = obj.minRefill(tot_dist, full_tank, stops, no_of_stops);

        System.out.println("Minimum Refills required to travel distance d = "+tot_dist+"km : "+ min_refills);
    }
}
