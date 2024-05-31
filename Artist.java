package musiclibrary;


public class Artist extends Account{
    protected String genre;
    protected int numberOfFollowers;
    protected int numberOfMonthlyListener;
    public String[] albums={"Red","Lover","reputation"};
    public String[] relatedArtists={"Post Malone","Charlie Puth","Zayn"};

    public String[] musicOfArtist={"Fortnight","Down Bad","Paper Rings"};

    
    public Artist() {
        
    }
    
   
    public void showAlbums(){
        for(int i =0; i<=albums.length-1;i++){
            System.out.println(albums[i]);
        }
        System.out.println("There are " + albums.length + " musics in this album.");
    }
    
    public void relatedArtists() {
        if(relatedArtists!=null){
            System.out.println("Related artists: ");
                for(int i =0; i<=relatedArtists.length-1;i++){
                    System.out.println("- " + relatedArtists[i]);
                }
        }else {
            System.out.println("No related artists found.");
        }    
    }
    
    public void albumCount() {
        if (albums!= null) {
            System.out.print("Number of album: "+ albums.length);
        } else {
            System.out.println("there is no album.");
        }
    }
    
    
    
    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfMonthlyListener() {
        return numberOfMonthlyListener;
    }

    public void setNumberOfMonthlyListener(int numberOfMonthlyListener) {
        this.numberOfMonthlyListener = numberOfMonthlyListener;
    }

}
