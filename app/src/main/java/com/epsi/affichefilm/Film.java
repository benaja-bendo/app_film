package com.epsi.affichefilm;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private int picture;
    private String title;
    private String description;

    public Film() {
    }

    public Film(int picture, String title, String description) {
        this.picture = picture;
        this.title = title;
        this.description = description;
    }

    protected Film(Parcel in) {
        picture = in.readInt();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Film> CREATOR = new Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel in) {
            return new Film(in);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Film{" +
                "picture='" + picture + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(picture);
        parcel.writeString(title);
        parcel.writeString(description);
    }
}
