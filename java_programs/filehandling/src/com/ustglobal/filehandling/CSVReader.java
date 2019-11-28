package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

	public static void main(String[] args) {
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in)) {
			
			while(reader.ready()) {
				String line=reader.readLine();
				System.out.println(line);
				String[] word = line.split(",");
				System.out.println("id is "+word[0]);
				System.out.println("name is "+word[1]);
				System.out.println("sal is "+word[2]);
				System.out.println("gender is "+word[3]);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
