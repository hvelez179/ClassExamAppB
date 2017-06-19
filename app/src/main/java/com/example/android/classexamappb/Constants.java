package com.example.android.classexamappb;

import android.net.Uri;

public class Constants {

    /**
     * Is the name for the entire ContentProvider
     */
    private static final String CONTENT_AUTHORITY = "com.mac.training.movieapp";

    /**
     *
     */
    private static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     *
     */
    private static final String PATH_MOVIE = "movie";

    /**
     *
     */
    private static final String PATH_GENRE = "genre";

    /**
     *
     */
    public static final Uri MOVIE_CONTENT_URI =
            BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIE).build();

    /**
     *
     */
    public static final Uri GENRE_CONTENT_URI =
            BASE_CONTENT_URI.buildUpon().appendPath(PATH_GENRE).build();

    /**
     *
     */
    public static final String _ID = "_id";

    /**
     *
     */
    public static final String GENRE_COLUMN_NAME = "genreName";

    /**
     *
     */
    public static final String MOVIE_COLUMN_NAME = "movieName";

    /**
     *
     */
    public static final String MOVIE_COLUMN_RELEASE_DATE = "movieReleaseDat";

    /**
     *
     */
    public static final String MOVIE_COLUMN_GENRE = "movieGenre";
}
