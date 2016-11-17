package com.keepitfresh.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task
{
   @Id @GeneratedValue
   @Column(name = "id")
	private int id;
   @Column(name = "user")
    private String user;
   @Column(name = "name")
    private String name;
	@Column(name = "email_address")
    private String emailAddress;
   @Column(name = "exp_date")
    private Date expDate;
    
    public Task() {
        super();
    }
    
    public Task(String user, String name, String emailAddress, Date expDate)
    {
        super();
        this.user = user;
        this.name = name;
        this.emailAddress = emailAddress;
        this.expDate = expDate;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public Date getExpDate() {
		return expDate;
	}
    
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}


    @Override
    public String toString() {
        return String.format(
                "Item [id=%s, user=%s, name=%s, emailAddress=%s , expDate=%s]", id,
                user, name, emailAddress, expDate);
    }
    
	@Override
	public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (id != other.id)
            return false;
        return true;
	}
}
