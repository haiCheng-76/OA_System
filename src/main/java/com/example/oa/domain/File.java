package com.example.oa.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件信息表
 * 
 * @author 龙海成
 *
 */
public class File  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6127202511164646819L;
	private int fileid;
	private String filename;
	private double filesize;
	private Date fileuploadtime;
	private int employee_id;
	private String uploaderName;
	private String file_location;

	public File() {
	}

	
	public String getUploaderName() {
		return uploaderName;
	}


	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}


	public int getFileid() {
		return fileid;
	}

	public void setFileid(int fileid) {
		this.fileid = fileid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public double getFilesize() {
		return filesize;
	}

	public void setFilesize(double filesize) {
		this.filesize = filesize;
	}

	public Date getFileuploadtime() {
		return fileuploadtime;
	}

	public void setFileuploadtime(Date fileuploadtime) {
		this.fileuploadtime = fileuploadtime;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFile_location() {
		return file_location;
	}

	public void setFile_location(String file_location) {
		this.file_location = file_location;
	}


	@Override
	public String toString() {
		return "File [fileid=" + fileid + ", filename=" + filename + ", filesize=" + filesize + ", fileuploadtime="
				+ fileuploadtime + ", employee_id=" + employee_id + ", file_location=" + file_location + "]";
	}
	
}
