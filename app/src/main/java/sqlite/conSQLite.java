package sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;

import androidx.annotation.Nullable;

public class conSQLite extends SQLiteOpenHelper {

    SQLiteDatabase bd;

    private Context aContext;

    public conSQLite(Context context) {
        super(context, llamadas.getNombreBD(), null, llamadas.getVersioBD());
        aContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(llamadas.getCrearTablaUsuario());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public long insertar(Editable usuario, Editable contrasenia){
        long dev = 0;
        bd = this.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(llamadas.getUsuarioCol(), String.valueOf(usuario));
        valores.put(llamadas.getContraseniaCol(), String.valueOf(contrasenia));
        dev = bd.insert(llamadas.getNombreTabla(), null, valores);
        bd.close();
        return dev;
    }

    public String getUsuario(){
        bd = this.getReadableDatabase();
        String[] columna = new String[]{llamadas.getUsuarioCol()};
        Cursor cursor = bd.query(llamadas.getNombreTabla(), columna, null, null,null, null, null);

        return cursor.getString(0);
    }
}
