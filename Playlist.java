package musiclibrary;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist implements MusicAndPlaylist{
    protected String title;
    protected int numberOfLikes=0;
    protected int numberOfMusic;
    protected int durationInMinute;
    protected User ownerOfPlaylist;
    protected boolean isPlaying;
    protected String currentPlaylist;
    protected ArrayList<String> playlist = new ArrayList<>();
    public Music music;
    protected ArrayList<String> myPlaylists = new ArrayList<>();
    
    
    public Playlist() {
    }
    
    public void createAPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to playlist: ");
        String name = scanner.nextLine();
        if(getMyPlaylists().contains(name)){
            System.out.println("The playlist is already created.");
        }else{
            getMyPlaylists().add(name);
            System.out.println("The playlist " +name +" is created.");
            

        }
    }

    public void addMusicToPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the music you want to add: ");
        String music = scanner.nextLine();
        playlist.add(music);
        System.out.println("The music" + music + " is added to playlist successfully.");
        System.out.print("Do you want to add another music? ");
        String answer = scanner.nextLine();
        if(answer.equals("yes")){
            addMusicToPlaylist();
        }
        
    }

    public void deletePlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to delete the playlist? ");
        String answer = scanner.nextLine();
        if(answer.equals("yes")){
            System.out.print("Enter the name of the playlist you want to delete: ");
            String title = scanner.nextLine();
            getMyPlaylists().remove(title);
            System.out.println("Playlist" + title +" is deleted successfully.");
        }else if(answer.equals("no")){
            System.out.println("Playlist is not deleted.");
        }else{
            deletePlaylist();
        }
    }
    
    @Override
    public void play(String title) {
        isPlaying = false;
        if(isPlaying){
            System.out.println("Playlist is not playing.");
        }else{
            currentPlaylist = title;
            System.out.println("Playlist " + currentPlaylist + " is playing.");
        }
        isPlaying = false;
    }

    @Override
    public void like(String title) {
        System.out.println("The playlist is liked.");
        numberOfLikes++;
        System.out.println("total number of likes is : "+ numberOfLikes);
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the playlist you want to search: ");
        String theNameOfPlaylist = scanner.nextLine();
        for(String item: myPlaylists){
            for(int i=0; i<=getMyPlaylists().size()-1;i++){
                if(myPlaylists.contains(theNameOfPlaylist)){
                    System.out.println("The playlist " +theNameOfPlaylist+ " is founded." );
                    break;
                }else{
                    System.out.println("The playlist " +theNameOfPlaylist+ " is not founded.");
                    break;
                }
            }
            break;
        }
    } 

    @Override
    public void playAgain(String title) {
        if(isPlaying && !currentPlaylist.isEmpty()){
            System.out.println(title + " is playing again.");
        }else{
            System.out.println("No song is currently playing.");
        }
    }
    
    
    
    

    
    
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfMusic() {
        return numberOfMusic;
    }

    public void setNumberOfMusic(int numberOfMusic) {
        this.numberOfMusic = numberOfMusic;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(int durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public User getOwnerOfPlaylist() {
        return ownerOfPlaylist;
    }

    public void setOwnerOfPlaylist(User ownerOfPlaylist) {
        this.ownerOfPlaylist = ownerOfPlaylist;
    }

    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<String> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<String> getMyPlaylists() {
        return myPlaylists;
    }

    public void setMyPlaylists(ArrayList<String> myPlaylists) {
        this.myPlaylists = myPlaylists;
    }

    

}