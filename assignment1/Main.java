package assignment1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Artist> array= newArtist();
        System.out.println("age >=35 n:"+Age(array));
        removA(array);
        List<Album> list = newAlbum();
        System.out.println(year1974(list));
        int n = list.size();
        list.add(n,new Album());
        list.clear();
        System.out.println(list.size());

    }




    public  static List<Album> newAlbum()  {
        Scanner in = new Scanner(System.in);
        List<Album> views = new LinkedList<>() {};
        for(int i = 0; i < 6; i++) {
            System.out.print("title:");
            String title= in.next();
            System.out.print("Publish day:");
            int day = in.nextInt();
            System.out.print("Publish month:");
            int month= in.nextInt();
            System.out.print("Publish year:");
            int year = in.nextInt();
            LocalDate publishYear = LocalDate.of(year,month,day);
            System.out.print("genre:");
            String genre= in.next();
            Album album =   new Album(i,title,genre,publishYear);
            views.add(album);
        }
        return  views;
    }

    public static boolean year1974 (List<Album> list) {
        int n = 0;
        for (Album album : list) {
            if (album.getPublishedYear().getYear() == 1974) {
                n++;
                return true;
            }
        }
        return  false;}


    public static void removA (ArrayList<Artist> array){

        for ( Artist artist:array
        ) {
           if ( artist.getName().charAt(0)=='A'){
               array.remove(artist);
           }
        }
    }


    public  static int Age (ArrayList<Artist> array){
        int n=0;
        for ( Artist artist:array
        ) {
            long age = getAge(artist);
            if(age>=35){
                n++;
            }
        }
        return  n ;
    }

    public static long  getAge(Artist  artist) {
        LocalDate now = LocalDate.now();
        long age =  ChronoUnit.YEARS.between(artist.getbDate(),now);
        return age;}





public  static ArrayList<Artist> newArtist() throws ParseException {
    Scanner in = new Scanner(System.in);
    ArrayList<Artist> views = new ArrayList<>();
    for(int i = 0; i < 6; i++) {
        System.out.print("name:");
        String name= in.next();
        System.out.print("BDay day:");
        int day = in.nextInt();
        System.out.print("BDay month:");
        int month= in.nextInt();
        System.out.print("BDay year:");
        int year = in.nextInt();
        LocalDate bDate = LocalDate.of(year,month,day);
        System.out.print("artistic name:");
        String artisticName= in.next();
        System.out.print("role:");
        String role=in.next();
        System.out.print("country:");
        String country=in.next();
        System.out.print("city:");
        String city=in.next();
        Artist artist= new Artist(i,name,artisticName,role,country,city,bDate);
        views.add(artist);
}
       return  views;
}



}
