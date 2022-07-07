package com.solidprinciples;
/**
 * 
 * child class should be replacable with parent class
 * @author ravijha
 *
 */
public class LiskovPrinciple {
	
	 class Vehicle {
		
		void startEngine() throws Exception
		{
			
		}
	}
	
	class Bicycle extends Vehicle
	{
		void startEngine() throws Exception
		{
			throw new Exception("Not found");
		}
	}
	
	class Car extends Vehicle
	{
		void startEngine()
		{
			System.out.println(" Engine found");
		}
	}
	
	public static void main(String[] args) throws Exception {
		LiskovPrinciple l = new LiskovPrinciple();
		
		Bicycle cycle = l.new Bicycle();
		Vehicle car = l.new Car();
		
		car.startEngine();
		cycle.startEngine();

		
		// both vehicle behaves differently but not to be, instead we can have
		// two vehicle types with engine and without Engine
	}

}
