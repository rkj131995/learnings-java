package com.solidprinciples;

public class SRP {
	
	class Employee {
		
		int calPay() {
			return 0;
			
		};
		
		void printPaySlip() {
			
		}
		
		void saveEmp() {
			
		}
		// instead create separate class for separate resposibility
	}
	
	class PrintService {
		
		void printPaySlip() {
			
		}
	}
	
	class NotificationService {
		
		void sendEmail() {
			
		}
	}

}
