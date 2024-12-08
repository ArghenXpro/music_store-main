public class Main {

    public static void main(String[] args) {
//
        Genre rock = new Genre("ROCK");
        Author ElvisPresley = new Author("Elvis","Presley");
        Music CantHelp = new Music("Can't help falling in love", ElvisPresley, rock,
                "https://youtu.be/vGJTaP6anOU?si=f0NqVtoWpJJq1iHo", 246, 40);
        Music JailhouseRock  = new Music("Jailhouse Rock", ElvisPresley, rock,
                "https://youtu.be/gj0Rz-uP4Mk?si=84smzzGA4pZiKDFe", 208, 20);
        Music TheWonderofYou = new Music("Wonder of You",ElvisPresley, rock,
                "https://youtu.be/F5eEvfOyb7k?si=ueyoYe4C8P0kvWJO", 256, 55);
        Music MyWay  = new Music("My Way", ElvisPresley,rock,
                "https://youtu.be/ixbcvKCl4Jc?si=ikFNKLfeIv-z6uVD",267, 60);
        Music HoundDog = new Music("Hound Dog", ElvisPresley, rock,
                "https://youtu.be/aNYWl13IWhY?si=UYKRbdmyMpz6-jwP", 256, 40);
        Music UnchainedMelody = new Music("Unchained Melody", ElvisPresley, rock,
                "https://youtu.be/1jFklrR1-YA?si=OOyqwwtaBuY-oshZ", 138, 50);

        User Argen = new User("Argen Joldubaev", "Rock", 9999);
        User Adolf = new User("Adolf Hitler", "Rock", 120);
        Adolf.buyMusic(TheWonderofYou, 3);

        Argen.getBalance();
        Argen.buyMusic(CantHelp, 5);
        Argen.buyMusic(JailhouseRock, 4);
        Argen.buyMusic(TheWonderofYou,4);
        Argen.buyMusic(MyWay,5);
        Argen.buyMusic(HoundDog,5);
        Argen.buyMusic(UnchainedMelody, 5);
        Argen.getBalance();
        Argen.getPlaylist();

        Adolf.getBalance();
        Adolf.buyMusic(CantHelp, 5);
        Adolf.buyMusic(JailhouseRock, 4);
        Adolf.buyMusic(TheWonderofYou,4);
        Adolf.buyMusic(MyWay,5);
        Adolf.buyMusic(HoundDog,5);
        Adolf.cashIn(700);
        Adolf.buyMusic(CantHelp, 0);
        Adolf.buyMusic(CantHelp, -1);
        Adolf.buyMusic(CantHelp, 3);
        Adolf.buyMusic(UnchainedMelody,9);
        Adolf.buyMusic(TheWonderofYou,0);
        Adolf.getBalance();
        Adolf.getPlaylist();

        Argen.listenMusic(TheWonderofYou);
        Argen.listenMusic(JailhouseRock);
        Argen.listenMusic(MyWay);
        Argen.listenMusic(MyWay);
        Argen.listenMusic(MyWay);
        Argen.listenMusic(MyWay);

        Adolf.listenMusic(UnchainedMelody);
        Adolf.listenMusic(UnchainedMelody);
        Adolf.listenMusic(UnchainedMelody);

        CantHelp.getDownloads();
        CantHelp.getViews();
        CantHelp.getRate();

        CantHelp.openVideo();

    }

}