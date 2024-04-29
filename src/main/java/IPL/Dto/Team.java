package IPL.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	
	private String name;
	
	private String username;
	private String password;
	private String imagelink;
	private boolean status;
	private double wallet;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImagelink() {
		return imagelink;
	}
	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	
	
	
	
}
