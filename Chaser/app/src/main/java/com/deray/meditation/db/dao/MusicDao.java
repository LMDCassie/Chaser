package com.deray.meditation.db.dao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.deray.meditation.db.bean.Music;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC".
*/
public class MusicDao extends AbstractDao<Music, String> {

    public static final String TABLENAME = "MUSIC";

    /**
     * Properties of entity Music.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Key = new Property(0, String.class, "key", true, "key");
        public final static Property MusicID = new Property(1, Long.class, "musicID", false, "musicID");
        public final static Property AlbumID = new Property(2, Long.class, "albumID", false, "albumID");
        public final static Property ArtistID = new Property(3, Long.class, "artistID", false, "artistID");
        public final static Property Name = new Property(4, String.class, "name", false, "name");
        public final static Property Singer = new Property(5, String.class, "singer", false, "singer");
        public final static Property Album = new Property(6, String.class, "album", false, "album");
        public final static Property Duration = new Property(7, Long.class, "duration", false, "duration");
        public final static Property MusicFile = new Property(8, String.class, "musicFile", false, "musicFile");
        public final static Property MusicSize = new Property(9, Long.class, "musicSize", false, "musicSize");
        public final static Property DateAdd = new Property(10, String.class, "dateAdd", false, "dateAdd");
        public final static Property DateAddL = new Property(11, Long.class, "dateAddL", false, "dateAddL");
        public final static Property Type = new Property(12, Integer.class, "type", false, "type");
        public final static Property MusicIcon = new Property(13, String.class, "musicIcon", false, "musicIcon");
        public final static Property Clicks = new Property(14, Long.class, "clicks", false, "clicks");
        public final static Property IsLike = new Property(15, Boolean.class, "isLike", false, "isLike");
        public final static Property IsPlay = new Property(16, boolean.class, "isPlay", false, "isPlay");
        public final static Property Playlist = new Property(17, String.class, "playlist", false, "playlist");
    }

    private Query<Music> playList_MusicsQuery;

    public MusicDao(DaoConfig config) {
        super(config);
    }
    
    public MusicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC\" (" + //
                "\"key\" TEXT PRIMARY KEY NOT NULL ," + // 0: key
                "\"musicID\" INTEGER," + // 1: musicID
                "\"albumID\" INTEGER," + // 2: albumID
                "\"artistID\" INTEGER," + // 3: artistID
                "\"name\" TEXT," + // 4: name
                "\"singer\" TEXT," + // 5: singer
                "\"album\" TEXT," + // 6: album
                "\"duration\" INTEGER," + // 7: duration
                "\"musicFile\" TEXT," + // 8: musicFile
                "\"musicSize\" INTEGER," + // 9: musicSize
                "\"dateAdd\" TEXT," + // 10: dateAdd
                "\"dateAddL\" INTEGER," + // 11: dateAddL
                "\"type\" INTEGER," + // 12: type
                "\"musicIcon\" TEXT," + // 13: musicIcon
                "\"clicks\" INTEGER," + // 14: clicks
                "\"isLike\" INTEGER," + // 15: isLike
                "\"isPlay\" INTEGER NOT NULL ," + // 16: isPlay
                "\"playlist\" TEXT);"); // 17: playlist
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Music entity) {
        stmt.clearBindings();
 
        String key = entity.getKey();
        if (key != null) {
            stmt.bindString(1, key);
        }
 
        Long musicID = entity.getMusicID();
        if (musicID != null) {
            stmt.bindLong(2, musicID);
        }
 
        Long albumID = entity.getAlbumID();
        if (albumID != null) {
            stmt.bindLong(3, albumID);
        }
 
        Long artistID = entity.getArtistID();
        if (artistID != null) {
            stmt.bindLong(4, artistID);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(6, singer);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(7, album);
        }
 
        Long duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(8, duration);
        }
 
        String musicFile = entity.getMusicFile();
        if (musicFile != null) {
            stmt.bindString(9, musicFile);
        }
 
        Long musicSize = entity.getMusicSize();
        if (musicSize != null) {
            stmt.bindLong(10, musicSize);
        }
 
        String dateAdd = entity.getDateAdd();
        if (dateAdd != null) {
            stmt.bindString(11, dateAdd);
        }
 
        Long dateAddL = entity.getDateAddL();
        if (dateAddL != null) {
            stmt.bindLong(12, dateAddL);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(13, type);
        }
 
        String musicIcon = entity.getMusicIcon();
        if (musicIcon != null) {
            stmt.bindString(14, musicIcon);
        }
 
        Long clicks = entity.getClicks();
        if (clicks != null) {
            stmt.bindLong(15, clicks);
        }
 
        Boolean isLike = entity.getIsLike();
        if (isLike != null) {
            stmt.bindLong(16, isLike ? 1L: 0L);
        }
        stmt.bindLong(17, entity.getIsPlay() ? 1L: 0L);
 
        String playlist = entity.getPlaylist();
        if (playlist != null) {
            stmt.bindString(18, playlist);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Music entity) {
        stmt.clearBindings();
 
        String key = entity.getKey();
        if (key != null) {
            stmt.bindString(1, key);
        }
 
        Long musicID = entity.getMusicID();
        if (musicID != null) {
            stmt.bindLong(2, musicID);
        }
 
        Long albumID = entity.getAlbumID();
        if (albumID != null) {
            stmt.bindLong(3, albumID);
        }
 
        Long artistID = entity.getArtistID();
        if (artistID != null) {
            stmt.bindLong(4, artistID);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String singer = entity.getSinger();
        if (singer != null) {
            stmt.bindString(6, singer);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(7, album);
        }
 
        Long duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(8, duration);
        }
 
        String musicFile = entity.getMusicFile();
        if (musicFile != null) {
            stmt.bindString(9, musicFile);
        }
 
        Long musicSize = entity.getMusicSize();
        if (musicSize != null) {
            stmt.bindLong(10, musicSize);
        }
 
        String dateAdd = entity.getDateAdd();
        if (dateAdd != null) {
            stmt.bindString(11, dateAdd);
        }
 
        Long dateAddL = entity.getDateAddL();
        if (dateAddL != null) {
            stmt.bindLong(12, dateAddL);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(13, type);
        }
 
        String musicIcon = entity.getMusicIcon();
        if (musicIcon != null) {
            stmt.bindString(14, musicIcon);
        }
 
        Long clicks = entity.getClicks();
        if (clicks != null) {
            stmt.bindLong(15, clicks);
        }
 
        Boolean isLike = entity.getIsLike();
        if (isLike != null) {
            stmt.bindLong(16, isLike ? 1L: 0L);
        }
        stmt.bindLong(17, entity.getIsPlay() ? 1L: 0L);
 
        String playlist = entity.getPlaylist();
        if (playlist != null) {
            stmt.bindString(18, playlist);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public Music readEntity(Cursor cursor, int offset) {
        Music entity = new Music( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // key
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // musicID
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // albumID
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // artistID
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // singer
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // album
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // duration
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // musicFile
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // musicSize
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // dateAdd
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // dateAddL
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12), // type
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // musicIcon
            cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14), // clicks
            cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0, // isLike
            cursor.getShort(offset + 16) != 0, // isPlay
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // playlist
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Music entity, int offset) {
        entity.setKey(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setMusicID(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setAlbumID(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setArtistID(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSinger(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAlbum(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDuration(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setMusicFile(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMusicSize(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setDateAdd(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setDateAddL(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setType(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
        entity.setMusicIcon(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setClicks(cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14));
        entity.setIsLike(cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0);
        entity.setIsPlay(cursor.getShort(offset + 16) != 0);
        entity.setPlaylist(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Music entity, long rowId) {
        return entity.getKey();
    }
    
    @Override
    public String getKey(Music entity) {
        if(entity != null) {
            return entity.getKey();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Music entity) {
        return entity.getKey() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "musics" to-many relationship of PlayList. */
    public List<Music> _queryPlayList_Musics(String playlist) {
        synchronized (this) {
            if (playList_MusicsQuery == null) {
                QueryBuilder<Music> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Playlist.eq(null));
                playList_MusicsQuery = queryBuilder.build();
            }
        }
        Query<Music> query = playList_MusicsQuery.forCurrentThread();
        query.setParameter(0, playlist);
        return query.list();
    }

}
