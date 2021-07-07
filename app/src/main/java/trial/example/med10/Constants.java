package trial.example.med10;

import java.security.PublicKey;

public class Constants {

    public static final String DB_NAME="SHOP_INFO_DB";

    public static final int DB_VERSION=1;

    public static final String TABLE_NAME="AHMEDABAD";

    public static final String C_ID="ID";
    public static final String C_NAME="NAME";
    public static final String C_ADDRESS="ADDRESS";
    public static final String C_PHONE="PHONE";
    public static final String C_IMAGE="IMAGE";
    public static final String C_ADD_TIMESTAMP="ADD_TIMESTAMP";
    public static final String C_UPDATE_TIMESTAMP="UPDATE_TIMESTAMP";

    public static final String CREATE_TABLE="CREATE TABLE " + TABLE_NAME + " ("
            + C_ID + " INTEGER PRIMARY KEY AUTOINCREAMENT,"
            + C_NAME + " TEXT,"
            + C_ADDRESS + " TEXT,"
            + C_PHONE + " TEXT,"
            + C_IMAGE + " TEXT,"
            + C_ADD_TIMESTAMP + " TEXT,"
            + C_UPDATE_TIMESTAMP + " TEXT,"
            + "):";

}
