package edu.miu.cs.cs544.domain.appt_reservation;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import edu.miu.cs.cs544.domain.user.User;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date time;
	private String location;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User provider;
	
//	@OneToMany(mappedBy="appointment")
//	private Reservation reservations;
	
	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
			Locale.US);
	private static DateFormat tf = DateFormat.getTimeInstance(DateFormat.SHORT,
			Locale.US);
	
	public Appointment() {
		super();
	}

	public Appointment(String date, String time, String location) {
		super();
		setDate(date);
		setTime(time);
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return df.format(date);
	}

	public void setDate(String date) {
		try {
			this.date = df.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTime() {
		return tf.format(time);
	}

	public void setTime(String time) {
		try {
			this.date = tf.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getProvider() {
		return provider;
	}

	public void setProvider(User provider) {
		this.provider = provider;
	}
	
	
}
