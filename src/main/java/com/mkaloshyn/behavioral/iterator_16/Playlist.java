package main.java.com.mkaloshyn.behavioral.iterator_16;

public class Playlist implements Collection {

    private String name;
    private String[] tracks;

    public Playlist(String name, String[] tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }

    @Override
    public Iterator getIterator() {
        return new TrackIterator();
    }

    private class TrackIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index<tracks.length;
        }

        @Override
        public Object next() {
            return tracks[index++];
        }
    }
}
