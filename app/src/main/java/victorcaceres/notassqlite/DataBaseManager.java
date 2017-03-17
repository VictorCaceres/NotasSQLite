package victorcaceres.notassqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Victor Cáceres on 17/3/2017.
 */

public class DataBaseManager {
    public static final String TABLE_NAME = "notas";


    public static final String CN_ID = "id";
    public static final String CN_TITLE = "titulo";
    public static final String CN_CONTETN = "nota";

    public static final String CREATE_TABLE = "create table " + TABLE_NAME + ""
            + CN_ID + "integer primary key autoincrement, "
            + CN_TITLE + "text not null, "
            + CN_CONTETN + "text;";

    private DbHelper helper;
    private SQLiteDatabase db;

    public DataBaseManager(Context context) {
        helper = new DbHelper(context);
        db = helper.getWritableDatabase();
    }
}
