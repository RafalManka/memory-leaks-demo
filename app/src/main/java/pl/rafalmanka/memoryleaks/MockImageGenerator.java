package pl.rafalmanka.memoryleaks;

/**
 * Created by rafal on 11/25/15.
 */
public class MockImageGenerator {

    private static int id;

    private static final String[] img = {
            "http://tremendouswallpapers.com/wp-content/uploads/2014/12/cat-blue-eyes-high-definition_110413.jpg",
            "http://k31.kn3.net/taringa/2/A/D/B/3/D/juliodj2004/EC3.jpg",
            "http://zerotips.com/wp-content/uploads/2012/02/lion_hd_wallpaper.jpg",
            "http://www.freewallpaperfullhd.com/wp-content/uploads/2015/02/City-Night-Neon-Wallpaper-HD-1920x1080.jpg",
            "http://xyer.co/wallpaper/10/4/free-high-definition-2014.jpg",
            "http://hdwallpapersfit.com/wp-content/uploads/2015/02/ultra-hd-wallpapers-space.jpg",
            "http://i.dailymail.co.uk/i/pix/2012/11/28/article-2239510-163E1219000005DC-57_964x525.jpg",
            "http://www.ihdwallpaperx.com/wp-content/uploads/2015/02/Animal-HD-Wallpaper-Background.jpg",
            "http://hdwallpaper.camera/download/35/HD_Wallpapers_Free_Download_For_Android_Mobile_4.jpg/",
            "http://www.metrowallpapers.in/wp-content/uploads/2015/08/High-Definition-2.jpg",
            "http://dekhnews.com/wp-content/uploads/2015/07/Cool-hd-Wallpapers-For-Android-Phone.jpg",
            "http://thehdimg.com/images/db_img6/hd-wallpaper-android-mobile-hd-widescreen-11.jpg",
            "http://www.hdwalls.in/wp-content/uploads/2015/01/android_live_wallpapers_hd_for_mobile-1.png",
            "http://wallpaperhd3d.com/wp-content/uploads/2013/08/32.jpg",
            "http://www.somepets.com/wp-content/gallery/hd-animal-background-wallpaper/2560x1600-Royal-Bengal-Tiger-HD-Animal-Wallpaper.jpg",
            "http://xyer.co/wallpaper/25/8/hd-high-definition-free-hd.jpg",
            "http://newwallpapers1.com/wp-content/uploads/2014/12/High-Definition-Images-2.jpg",
    };

    public static String image() {
        return img[id];
    }

    public static void next() {
        if (id >= img.length) {
            id = -1;
        }
        id++;
    }

    public static int id() {
        return id;
    }
}
