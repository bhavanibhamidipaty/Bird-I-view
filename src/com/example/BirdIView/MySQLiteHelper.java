package com.example.BirdIView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

/**
 * Created by Bhavani on 11-07-2015.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "bird";

    private SQLiteDatabase database;
    private final Context context;
    private static String DATABASE_PATH;


    public MySQLiteHelper(Context c){
        super(c, "bird",null,1);
        this.context = c;
        DATABASE_PATH = c.getFilesDir().getParentFile().getPath()+"/databases/";
    }



    public void create() throws IOException {
        boolean check = checkDataBase();

        SQLiteDatabase db_Read = null;

        // Creates empty database default system path
        db_Read = this.getReadableDatabase();
        Log.d("MySQLiteHelper checkpt:", "passed db_Read getwriteabledb"
        );
        db_Read.close();

            if (!check)
                copyDataBase();


    }

    private boolean checkDataBase() {
        SQLiteDatabase checkDB = null;
        Log.d("MySQLiteHelper checkpt:", "going into checkDB");
        try {
            String myPath = DATABASE_PATH + DATABASE_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null,
                    SQLiteDatabase.OPEN_READONLY);
            Log.d("MySQLiteHelper checkpt:", "passed thru checkDB worked without .db");
        } catch (SQLiteException e) {
            // database does't exist yet.
            String myPath = DATABASE_PATH + DATABASE_NAME + ".db";
            checkDB = SQLiteDatabase.openDatabase(myPath, null,
                    SQLiteDatabase.OPEN_READONLY);
            Log.d("MySQLiteHelper checkpt:", "error at passed thru checkDB worked with .db");
        } catch (Exception e){
            Log.d("MySQLiteHelper checkpt:", "error at passed thru checkDB");
        }

        if (checkDB != null) {
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    private void copyDataBase() throws IOException {

        // Open your local db as the input stream
        InputStream myInput = context.getAssets().open(DATABASE_NAME);

        // Path to the just created empty db
        String outFileName = DATABASE_PATH + DATABASE_NAME;

        // Open the empty db as the output stream
        OutputStream myOutput = new FileOutputStream(outFileName);

        // transfer bytes from the inputfile to the outputfile
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        // Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();

    }

    public void open() throws SQLException {
        String myPath = DATABASE_PATH + DATABASE_NAME;
        database = SQLiteDatabase.openDatabase(myPath, null,
                SQLiteDatabase.OPEN_READWRITE);
    }

    /** close the database */
    @Override
    public synchronized void close() {
        if (database != null)
            database.close();
        super.close();
    }

    public Cursor getBirdsCursor(String query, String[] args) throws SQLException {
        Cursor
                mCursor
                =
                database
                        .
                                rawQuery
                                        (query,
                                                args);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }





    @Override
    public void onCreate(SQLiteDatabase sqlDB){

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer){

    }
}
