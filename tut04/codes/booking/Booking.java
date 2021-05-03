package model;

/**
 * This is a model class represents a Booking entity for the table Booking in database
 */

public class Booking {
	protected int id;
	protected String start_date_time;
	protected String stop_date_time;
	protected String payed;
	
	public Booking() {
	}
	
	public Booking(String start_date_time, String stop_date_time, String payed) {
		super();
		this.start_date_time = start_date_time;
		this.stop_date_time = stop_date_time;
		this.payed = payed;
	}

	public Booking(int id, String start_date_time, String stop_date_time, String payed) {
		super();
		this.id = id;
		this.start_date_time = start_date_time;
		this.stop_date_time = stop_date_time;
		this.payed = payed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStart_date_time() {
		return start_date_time;
	}

	public void setStart_date_time(String start_date_time) {
		this.start_date_time = start_date_time;
	}

	public String getStop_date_time() {
		return stop_date_time;
	}

	public void setStop_date_time(String stop_date_time) {
		this.stop_date_time = stop_date_time;
	}

	public String getPayed() {
		return payed;
	}

	public void setPayed(String payed) {
		this.payed = payed;
	}
}
