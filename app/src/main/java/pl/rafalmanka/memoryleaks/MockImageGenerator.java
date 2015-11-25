package pl.rafalmanka.memoryleaks;

/**
 * Created by rafal on 11/25/15.
 */
public class MockImageGenerator {

    private static int id;

    private static final String[] img = {
            "http://hdwallpaper.camera/download/35/HD_Wallpapers_Free_Download_For_Android_Mobile_4.jpg/",
            "http://dekhnews.com/wp-content/uploads/2015/07/Cool-hd-Wallpapers-For-Android-Phone.jpg",
            "http://thehdimg.com/images/db_img6/hd-wallpaper-android-mobile-hd-widescreen-11.jpg",
            "http://www.hdwalls.in/wp-content/uploads/2015/01/android_live_wallpapers_hd_for_mobile-1.png",
            "http://wallpaperhd3d.com/wp-content/uploads/2013/08/32.jpg",
            "http://xn----8sbyahcudaxrfs.xn--p1ai/images/desktop/super/2.jpg"
    };

    public static String image() {
        return img[id];
    }

    public static void next() {
        id++;
        if (id >= img.length) {
            id = 0;
        }
    }

    public static int id() {
        return id;
    }
}
