package model;

/**
 * This is a model class represents a Room entity for the table Room in database
 */

public class Room {
	protected int id_number;
	protected int grace_period_hours;
	protected int fixed_booking_charge;
	
	public Room() {
	}
	
	public Room(int grace_period_hours, int fixed_booking_charge) {
		super();
		this.grace_period_hours = grace_period_hours;
		this.fixed_booking_charge = fixed_booking_charge;
	}

	public Room(int id_number, int grace_period_hours, int fixed_booking_charge) {
		super();
		this.id_number = id_number;
		this.grace_period_hours = grace_period_hours;
		this.fixed_booking_charge = fixed_booking_charge;
	}

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public int getGrace_period_hours() {
		return grace_period_hours;
	}

	public void setGrace_period_hours(int grace_period_hours) {
		this.grace_period_hours = grace_period_hours;
	}

	public int getFixed_booking_charge() {
		return fixed_booking_charge;
	}

	public void setFixed_booking_charge(int fixed_booking_charge) {
		this.fixed_booking_charge = fixed_booking_charge;
	}

}
