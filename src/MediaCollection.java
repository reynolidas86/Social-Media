import java.util.HashMap;

public class MediaCollection {
    
    private HashMap<Topic, MediaItem> media = new HashMap<Topic, MediaItem>();

    public MediaCollection() throws Exception
    {
        this.media.put(Topic.Bacon, new Image("Bacon", "a slice!", "assets/bacon.jpg"));
        this.media.put(Topic.Doritos, new Ad("I LOVE DORITOS", "yes i do", "https://www.doritos.com/"));
        this.media.put(Topic.Hamsters, new Song("Hamster Dance", "Funky little hamsters dancing. think about it.", "Hampton and the Hamsters", "assets/HamsterDance.wav"));
        this.media.put(Topic.Music, new Ad("A brighter future, with Adrianne Lenker", "Folk music star Adrianne Lenker just released her new album, Bright Future. Listen now!", "https://open.spotify.com/album/2Y8WS7iDIZkvzB5GUeLvku?si=lRIH6LLCTdK53pWw407Jfw"));
        this.media.put(Topic.Barbies, new Image("New Barbie dropped", "Check it", "assets/barbie.jpeg"));
        this.media.put(Topic.Grapes, new Event("20th Annual Glassboro Grape Eating Competition", "It is time again for the annual grape eating competition. Estimates say this year the top competitors may even eat up to 7 grapes."));
        this.media.put(Topic.Hairstyles, new Image("New Hairstyles dropped", "They're stupid. Everyone should shave their heads.", "assets/hairstyles.jpg"));
        this.media.put(Topic.Investments, new Ad("The future of investing is here", "Invest in DOGECOIN today", "https://dogecoin.com/"));
        this.media.put(Topic.Pizza, new Event("Building the World's Smallest Pizza", "Join us at the Rowan Boulevard Pizza Hut as we construct the world's smallest pizza with a diameter of 1.616255(18)x10-35 m"));
        this.media.put(Topic.Popcorn, new Song("APPARENTLY", "This is what Popcorn sounds like", "Pop Secret", "assets/Popcorn.wav"));
        this.media.put(Topic.Romance, new Song("In a bad romance?", "This song may be for you!", "Lady Gaga", "assets/BadRomance.wav"));
        this.media.put(Topic.Squirrels, new Image("200+ Cute Squirrels in your area", "Looking for nuts!", "assets/squirrel.png"));
        this.media.put(Topic.Sugar, new Song("\"Sugar is not good for you\"", "A notion defiled by Def Leppard's new track", "Def Leppard", "assets/Sugar.wav"));
        this.media.put(Topic.Superman, new Event("New Superman Sighting", "Eyewitness claims say Superman flew above Robinson Hall yesterday and began to cry at the sight of it"));
        this.media.put(Topic.Toothpaste, new Video("New Toothpaste strat found", "Brushing your teeth with the void is awesome, millenials say", "assets/Toothpaste.mp4"));
        this.media.put(Topic.Travel, new Ad("Travel much?", "Consider Travelers Insurance", "https://www.travelers.com/"));
        this.media.put(Topic.Pancakes, new Video("Making pancakes", "Making bacon pancakes", "assets/Pancakes.mp4"));
        //this.media.put(Topic.Volkswagons, new Ad("Volkswagons: The vehicle you can count on", "theyre awesome", "https://www.vw.com/en.html"));

        
    }

    public HashMap<Topic, MediaItem> getMedia() {
        return media;
    }

    public static Image getThread() throws Exception{
    return new Image("Not the thread you're looking for", "Looks like there was no available post to get media for. Heres a thread instead.", "assets/thread.jpg");
    }
}


