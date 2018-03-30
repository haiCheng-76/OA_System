package com.example.oa.domain;

import java.io.Serializable;

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
	private String fileuploadtime;
	private int employee_id;
	private String file_location;

	public File() {
	}

	public File(int fileid, String filename, double filesize, String fileuploadtime, int employee_id,
			String file_location) {
		this.fileid = fileid;
		this.filename = filename;
		this.filesize = filesize;
		this.fileuploadtime = fileuploadtime;
		this.employee_id = employee_id;
		this.file_location = file_location;
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

	public String getFileuploadtime() {
		return fileuploadtime;
	}

	public void setFileuploadtime(String fileuploadtime) {
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

}
