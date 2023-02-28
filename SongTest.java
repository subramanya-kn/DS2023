package com.dassault;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SongTest {

	public static void main(String[] args) {
		
		
		Song song1 = new Song("Jhoome Jo Pathhan","Arijit Singh","Pathan",2022);
        Song song2 = new Song("Zhingat","Ajay Atul","Sairat",2025);
        Song song3 = new Song("Jane Kyo Log Pyar Karte Hai","Udit Narayan","Dil Chahta Hai",1999);
        Song song4 = new Song("Aaj Ki party","Mika Singh","Bajrangi Bhai Jan",2026);
        Song song5 = new Song("Baby Doll","Sunny Leone","Ragini MMS",1995);
        System.out.println("Content is ready....all songs are ready...");
        
  //ArrayList is a raw type.
  //References to generic type ArrayList<E> should be parameterized      
        
        //ArrayList<Song> myPlayList = new ArrayList<Song>(); // no [] management here....wow
        //LinkedList myPlayList = new LinkedList(); // no [] management here....wow
        TreeSet    myPlayList = new TreeSet(); // no [] management here....wow
       // HashSet myPlayList = new HashSet(); // no [] management here....wow

        System.out.println("Collection is ready....can we add duplicate sogs???");
        
        System.out.println("1st song...adding...");
        myPlayList.add(song1);
           
        System.out.println("2nd song...adding...");
        myPlayList.add(song2);
       
        System.out.println("2nd song...adding..again...");
        myPlayList.add(song2);
        
        System.out.println("3rd song...adding...");
        myPlayList.add(song3);
        
        System.out.println("4th song...adding...");
        myPlayList.add(song4);
                
        System.out.println("5th song...adding...");
        myPlayList.add(song5);
        
        System.out.println("All songs are added");

        Iterator<Song> songIterator = myPlayList.iterator();
        while(songIterator.hasNext()) {
        	Song x = songIterator.next();
        	
        	System.out.println("x "+x);
        }
        
	}
}

class Song implements Comparable<Song> //isA
{
    String title;
    String artist;
    String album;
    int year;

   /* @Override
	public int compareTo(Song o) { //this function is invoked by add method of TreeSet to compare two songs
		System.out.println("comparing "+year+ " with "+o.year);
		return Integer.compare(year, o.year);
	}
    */
    
    @Override
   	public int compareTo(Song o) { //this function is invoked by add method of TreeSet to compare two songs
   		System.out.println("comparing "+album+ " with "+o.album);
   		return album.compareTo(o.album);
   	}

    public Song(String title) {
        this.title = title;

    }

    public Song(String title, String artist, String album, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

	
}