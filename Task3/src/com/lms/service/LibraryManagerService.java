package com.lms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.lms.model.Books;

public class LibraryManagerService {

	public static List<Books> books = new ArrayList<>();
	public static HashSet<String> categories = new HashSet<>();
	public static HashMap<String, List<String>> borrowedBooks = new HashMap<>();
}
