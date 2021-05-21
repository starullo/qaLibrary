package com.library;

import java.util.ArrayList;

public class Library {
	
	private String city;
	private String state;
	private ArrayList<Book> bList;
	private ArrayList<Magazine> mList;
	private ArrayList<Newspaper> nList;
	
	public Library() {
		this.city = "???";
		this.state = "???";
		this.bList = new ArrayList<Book> ();
		this.mList = new ArrayList<Magazine> ();
		this.nList = new ArrayList<Newspaper> ();
	}
	
	public Library(String city, String state) {
		this.city = city;
		this.state = state;
		this.bList = new ArrayList<Book> ();
		this.mList = new ArrayList<Magazine> ();
		this.nList = new ArrayList<Newspaper> ();
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public ArrayList<Book> getBooks() {
		return this.bList.items();
	}
	
	public ArrayList<Magazine> getMazazines() {
		return this.mList.items();
	}
	
	public ArrayList<Newspaper> getNewspapers() {
		return this.nList.items();
	}
	
//	returns an array list of information about checked out media. if it's not checked out the length of the array will just be one, if it is checked out the length will be 2
	public ArrayList<String> getCheckOutInfo(Media m) {
		ArrayList<String> info = new ArrayList<String> ();
		if (m.isCheckedOut) {
			info.add(m.checkedOutDate);
			info.add(m.dueDate);
		} else {
			info.add("not checked out");
		}
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public void setState(String newState) {
		this.state = newState;
	}
	
	public void deleteMedia(int id) {
		boolean found = false;
		for (int i = 0; i < this.bList.size(); i++) {
			Media curBook = this.bList.get(i);
			if (curBook.id == id) {
				this.bList.remove(i);
				found = true;
				break;
			}
		}
		if (!found) {
			for (int i = 0; i < this.mList.size(); i++) {
				Media curMag = this.mList.get(i);
				if (curMag.id == id) {
					this.mList.remove(i);
					found = true;
					break;
				}
			}
		}
		if (!found) {
			for (int i = 0; i < this.nList.size(); i++) {
				Media curN = this.nList.get(i);
				if (curN.id == id) {
					this.nList.remove(i);
					break;
				}
			}
		}
	}
	
	public void deleteMedia(int id, String mType) {
		if (mType.equalsIgnoreCase("book")) {
			for (int i = 0; i < this.bList.size(); i++) {
				Media curBook = this.bList.get(i);
				if (curBook.id == id) {
					this.bList.remove(i);
					break;
				}
			}
		} else if (mType.equalsIgnoreCase("magazine")) {
			for (int i = 0; i < this.mList.size(); i++) {
				Media curMag = this.mList.get(i);
				if (curMag.id == id) {
					this.mList.remove(i);
					break;
				}
			}
		} else if (mType.equalsIgnoreCase("newspaper")) {
			for (int i = 0; i < this.nList.size(); i++) {
				Media curN = this.nList.get(i);
				if (curN.id == id) {
					this.nList.remove(i);
					break;
				}
			}
		} else {
			System.out.println("Please enter either \"book\", \"magazine\", or \"newspaper\" as a media type");
		}
	}
	
	
	
	
}
