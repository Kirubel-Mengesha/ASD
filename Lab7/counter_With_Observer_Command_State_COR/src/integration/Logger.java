package integration;

import domain.Observer;

import java.util.Date;

public class Logger implements Observer{
	public void log(int countervalue) {
		System.out.println(new Date()+" Log counter with value "+countervalue);
	}


	public void update(int countervalue) {
		log(countervalue);		
	}

}
