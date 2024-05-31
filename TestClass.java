package musiclibrary;

public class TestClass {

    public static void main(String[] args) {
        Account account = new Account();
        PremiumAccount premiumAccount = new PremiumAccount();
        Music music = new Music();
        Playlist playlist = new Playlist();
        Artist artist = new Artist();
        User user = new User();

        //account part
        /*account.createAccount();
        account.logInToAccount();
        account.deleteAccount();
        account.logOut();*/
        
        //add/delete friend
        /*account.friends.add("busra");
        account.friends.add("havva");
        account.addFriends();
        account.deleteFriends();*/
        
        //premium account
        //premiumAccount.payment(86, true);
        
        
        //artist part
        /*artist.showAlbums();
        System.out.println("-----------");
        artist.relatedArtists();
        System.out.println("-----------");
        artist.albumCount();
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");*/
                
        
       
        
        
       /*music.play("Lover");
        music.search("lover");
        music.like("Lover");
        
        System.out.println("Total number of likes: " + music.numberOfLikes);*/
        
        
        //playlist part
        
        playlist.myPlaylists.add("turkish musics");
        playlist.myPlaylists.add("english musics");
        playlist.createAPlaylist();
        playlist.addMusicToPlaylist();
        System.out.println("Musics in the playlist: " + playlist.getPlaylist());
        System.out.println("My playlists: " + playlist.getMyPlaylists());
        
        //playlist.deletePlaylist();
        //playlist.search();
        
        
    }
}
