package com.tcet.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	private int RollNo;
	private String StudentName;
	private long Mobile;
	private String Email;
	private String Gender;
	private String Branch;
	private Date StudentDOB;
	private String AcademicYear;
	private String Division;
	
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		this.RollNo = rollNo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
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
	public Date getStudentDOB() {
		return StudentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.StudentDOB = studentDOB;
	}
	public String getAcademicYear() {
		return AcademicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.AcademicYear = academicYear;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		this.Division = division;
	}
}
