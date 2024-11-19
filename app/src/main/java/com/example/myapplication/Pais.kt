package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

data class Pais(
    val nombre: String,
    val bandera: Int,
    var poblacion: Int
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)

        parcel.writeInt(bandera)

        parcel.writeInt(poblacion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pais> {
        override fun createFromParcel(parcel: Parcel): Pais {
            return Pais(parcel)
        }

        override fun newArray(size: Int): Array<Pais?> {
            return arrayOfNulls(size)

        }
    }
}