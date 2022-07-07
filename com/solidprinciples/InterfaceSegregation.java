package com.solidprinciples;
/**
 * 
 * Segregate tasks from interface properly, should not add
 * too much responsibility unnecessarily
 * @author ravijha
 *
 */
public class InterfaceSegregation {

	// many responsibility
	interface ShapeCalculation
	{
		int calculateArea(int a, int b);
		int calculateVoulume(int a, int b);
		
	}
	
	interface AreaCal
	{
		int calculateArea(int a, int b);

	}
	
	public interface VolumeCalc
	{
		int calcVolume(int a, int b);

	}
	
	class Square implements AreaCal
	{

		@Override
		public int calculateArea(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	class Cube implements VolumeCalc
	{

		@Override
		public int calcVolume(int a, int b) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
