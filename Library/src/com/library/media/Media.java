package com.library.media;

import java.util.ArrayList;

public abstract class Media implements LibraryActions {
	
	protected boolean isCheckedOut;
	protected boolean isOverdue;
	protected String checkedOutDate;
	protected String dueDate;
	protected int year;
	protected int pages;
	
	public Media() {
		this.isCheckedOut = false;
		this.isOverdue = false;
		this.checkedOutDate = "x";
		this.dueDate = "x";
		this.year = 0000;
		this.pages = 0000;
	}
	
	public Media(int year, int pages) {
		this.isCheckedOut = false;
		this.isOverdue = false;
		this.checkedOutDate = "x";
		this.dueDate = "x";
		this.year = year;
		this.pages = pages;
	}
	
	public boolean getCheckedOut() {
		return this.isCheckedOut;
	}
	
	public boolean getIsOverdue() {
		return this.isOverdue;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getPages() {
		return this.pages;
	}

	
}
