package com.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@XmlRootElement
@ApiModel("Student Request Model")
public class StudentModel {

	@Min(1)
	@Max(1000000)
	@ApiModelProperty(name = "studentNo", dataType = "String", value="Student No, allowed only long value between 1 to 1000000 numbers", required = true, example = "1" )
	Long sno;
	
	@NotNull
	@Size(max = 100, min = 3, message = "Student No can't be more than 100 characters")
	@ApiModelProperty(name = "studentName", dataType = "String", value="Student Name, allowed only between 3 to 100 characters", required = true, example = "Babu" )
	String sname;
	
	/*
	@Pattern(regexp = "[A-Za-z]{1,100}")
	private String address;
	
	@Email(message = "Email Address is invalid")
	private String email;
	*/
	
	public Long getSno() {
		return sno;
	}
	public void setSno(Long sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
