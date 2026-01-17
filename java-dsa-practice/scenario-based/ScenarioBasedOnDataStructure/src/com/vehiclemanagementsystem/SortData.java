package com.vehiclemanagementsystem;

public class SortData {
	Vehicle[] vehicles;
	
	public SortData(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}
	
	void sort() {
		mergeSort(0, vehicles.length-1, vehicles);
	}
	public void mergeSort(int low, int high, Vehicle[] vehicles) {
		
		if(low < high) {
			int mid = low + (high-low)/2;
			
			mergeSort(low,mid,vehicles);
			mergeSort(mid+1,high,vehicles);
			merge(low, mid, high, vehicles);
			
		}
	}
	 public void merge(int low, int mid, int high, Vehicle[] vehicles) {
		 int m = mid - low + 1;
		 int n = high - mid ;
		 
		 Vehicle[] left = new Vehicle[m];
		 Vehicle[] right = new Vehicle[n];
		 
		 
		 for(int i=0 ; i<m ; i++) left[i] = vehicles[low + i];
		 for(int i=0 ; i<n ; i++) right[i] = vehicles[mid + i + 1];
		 
		 int i = 0;
		 int j = 0;
		 int k = low;
		 
		 while(i<m && j<n) {
			 if(compare(left[i], right[j])) {
				 vehicles[k++] = left[i++];
			 }
			 else {
				 vehicles[k++] = right[j++];
			 }
		 }
		 
		 while(i<m)  vehicles[k++] = left[i++];
		 while(j<n)  vehicles[k++] = right[j++];
		 
		 
	 }
	 
	 public static boolean compare(Vehicle v1, Vehicle v2) {
			return v1.getMileage() < v2.getMileage();
		}
	 public void display() {
		for(Vehicle vehicle : vehicles) {
			System.out.println("Vehcile Id : "+vehicle.getVehicleId() + "Vehicle Mileage : " +vehicle.getMileage());
		}
	}
}
