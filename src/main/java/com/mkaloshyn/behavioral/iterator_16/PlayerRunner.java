package main.java.com.mkaloshyn.behavioral.iterator_16;

public class PlayerRunner {

    public static void main(String[] args) {
        String[] tracks = {"Chilly song", "May I be your fiance", "Sing me our song", "Sounds of nature"};
        Playlist myPlaylist = new Playlist("IndiePop", tracks);
        System.out.println("Currently playlist is being played: ");
        Iterator iterator = myPlaylist.getIterator();
        while (iterator.hasNext()) {
            System.out.println("This song is being played now: "+ iterator.next());
        }
    }
}
