def car_fueling(dist,miles,n,gas_stations):
  
    num_refill, curr_refill, limit = 0,0,miles
    while limit < dist+dist-gas_stations[n-1]:  
        if curr_refill >= n or gas_stations[curr_refill] > limit:
            return -1

        while curr_refill < n-1 and gas_stations[curr_refill+1] <= limit:
            curr_refill += 1
            
        num_refill += 1 
        limit = gas_stations[curr_refill] + miles
        curr_refill += 1
        
    return num_refill

no_of_stops = 4;
total_distance = 900;
full_tank = 400;
stops = [200,375,550,750];
num_refill = (car_fueling(total_distance,full_tank,no_of_stops,stops))
print(num_refill)
print(full_tank-(total_distance-stops[no_of_stops-1]))

no_of_stops = 4;
total_distance = 1050;
full_tank = 400;
stops = [200,375,550,750];
num_refill = (car_fueling(total_distance,full_tank,no_of_stops,stops))
print(num_refill)
print(full_tank-(total_distance-stops[no_of_stops-1]))