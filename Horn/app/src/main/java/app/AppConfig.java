package app;

/**
 * Created by vighnu on 12/11/2015.
 */
public class AppConfig {
    // Server user login url
    public static String URL_LOGIN = "http://blueripples.org/horn/app_server/login.php";

    // Server user register url
    public static String URL_REGISTER = "http://blueripples.org/horn/app_server/register.php";

    public static final String URL_VERIFY_OTP = "http://blueripples.org/horn/app_server/verify_otp.php";

    public static final String URL_FORGOT_PASSWORD = "http://blueripples.org/horn/app_server/forgot_password.php";

    public static final String URL_CHANGE_PASSWORD = "http://blueripples.org/horn/app_server/changePassword.php";

    public static final String SMS_ORIGIN = "MSGIND";

    // special character to prefix the otp. Make sure this character appears only once in the sms
    public static final String OTP_DELIMITER = ":";
    public static String URL_SM_SERVICES = "http://blueripples.org/horn/app_server/SM.php";
    public static String URL_SM_WORKSHOPDATA = "http://blueripples.org/horn/app_server/SM_WorkshopDatalist.php";
}

