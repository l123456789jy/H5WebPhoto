package hagan.web.photo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
    public static String getPhotoFileName() {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        return imageFileName;
    }
}
