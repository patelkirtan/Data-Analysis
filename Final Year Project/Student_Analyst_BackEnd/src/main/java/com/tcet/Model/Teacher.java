package com.tcet.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher 
{
	@Id
	private int FacultyID;
	private String TeacherName;
	private long Mobile;
	private String Email;
	private String Gender;
	private String Branch;
	
	
	public int getFacultyID() {
		return FacultyID;
	}
	public void setFacultyID(int facultyID) {
		this.FacultyID = facultyID;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		this.TeacherName = teacherName;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		this.Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender = gender;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		this.Branch = branch;
	}
}
