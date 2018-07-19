package momen.ask_and_answer;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by AL-Motahida on 01/12/2017.
 */
public class DB {
    SQLiteDatabase sqLiteDatabase;
    public DB(SQLiteDatabase sqLiteDatabase)
    {
        this.sqLiteDatabase = sqLiteDatabase;
    }
    public void create()
    {
        try {
            sqLiteDatabase.execSQL("create table if not exists arab (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists english (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists biology (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists geology (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists france (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists chemistry (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists physics (stu_id integer primary key autoincrement, askk text)");
            sqLiteDatabase.execSQL("create table if not exists egarab (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists egenglish (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists egbiology (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists eggeology (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists egfrance (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists egchemistry (stu_id integer primary key autoincrement, egaskk text, egaba text)");
            sqLiteDatabase.execSQL("create table if not exists egphysics (stu_id integer primary key autoincrement, egaskk text, egaba text)");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public void deleteeA (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from arab where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeE (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from english where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeB (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from biology where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeG (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from geology where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeF (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from france where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeC (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from chemistry where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteeP (String s)
    {
        try{
            sqLiteDatabase.execSQL("delete from physics where askk ='"+s+"'");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean insertegA(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egarab (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegE(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egenglish (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegB(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egbiology (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegG(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into eggeology (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegF(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egfrance (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegC(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egchemistry (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertegP(String as,String an)
    {
        try {
            //                                                               ('as','an')
            sqLiteDatabase.execSQL("insert into egphysics (egaskk,egaba) values ('"+as+"' , '"+an+"')");
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    public boolean insertS(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into arab (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertE(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into english (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertB(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into biology (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertG(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into geology (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertF(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into france (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertC(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into chemistry (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean insertP(String name)
    {
        try {
            sqLiteDatabase.execSQL("insert into physics (askk) values ('"+name+"')");
            return true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    public ArrayList<String> getAskA()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egarab",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgA()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egarab",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskE()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egenglish",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgE()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egenglish",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskB()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egbiology",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgB()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egbiology",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskG()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from eggeology",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgG()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from eggeology",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskF()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egfrance",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgF()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egfrance",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskC()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egchemistry",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgC()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egchemistry",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAskP()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaskk from egphysics",null);
        int pos = cursor.getColumnIndex("egaskk");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getEgP()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select egaba from egphysics",null);
        int pos = cursor.getColumnIndex("egaba");
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(pos));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllA()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from arab",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllE()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from english",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllB()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from biology",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllG()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from geology",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllF()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from france",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllC()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from chemistry",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
    public ArrayList<String> getAllP()
    {
        ArrayList<String> arr = new ArrayList<String>();
        Cursor cursor = sqLiteDatabase.rawQuery("select askk from physics",null);
        if(cursor.getCount()>0)
        {
            while (cursor.moveToNext())
            {
                arr.add(cursor.getString(0));
            }
        }
        cursor.close();
        return arr;
    }
}
