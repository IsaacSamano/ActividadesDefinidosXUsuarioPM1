package com.example.samanoisaacintents;

import android.os.Parcel;
import android.os.Parcelable;

public class Alumno implements Parcelable {
    private String nombre;
    private String telefono;
    private String email;
    private String contrasena;

    public Alumno(String nombre, String telefono, String email, String contrasena) {
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.contrasena=contrasena;
    }

    protected Alumno(Parcel in) {
        nombre = in.readString();
        telefono = in.readString();
        email = in.readString();
        contrasena = in.readString();
    }

    public static final Creator<Alumno> CREATOR = new Creator<Alumno>() {
        @Override
        public Alumno createFromParcel(Parcel in) {
            return new Alumno(in);
        }

        @Override
        public Alumno[] newArray(int size) {
            return new Alumno[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(telefono);
        parcel.writeString(email);
        parcel.writeString(contrasena);
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+ " Telefono "+ getTelefono()+ " Email "+ getEmail() + " Contrasena " + getContrasena();
    }


}
