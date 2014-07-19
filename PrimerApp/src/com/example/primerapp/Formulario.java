package com.example.primerapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Formulario implements Parcelable {
	
	private String nombre;
	private String apellido;
	private String edad;
	private String mail;
	
	public static final Parcelable.Creator<Formulario> CREATOR =
            new Parcelable.Creator<Formulario>()
            {
                @Override
                public Formulario createFromParcel(Parcel parcel)
                {
                    return new Formulario(parcel);
                }
 
                @Override
                public Formulario[] newArray(int size)
                {
                    return new Formulario[size];
                }
        };
        
        public Formulario(Parcel parcel)
        {
            //seguir el mismo orden que el usado en el método writeToParcel
            this.nombre = parcel.readString();
            this.apellido = parcel.readString();
            this.edad = parcel.readString();
            this.mail= parcel.readString();
        }   
     
        public Formulario()
        {
            super();
        }
        //Metodos para usar la interfaz Parcelable
        @Override
        public void writeToParcel(Parcel parcel, int flags)
        {
            parcel.writeString(nombre);
            parcel.writeString(apellido);
            parcel.writeString(edad);
            parcel.writeString(mail);      
        }
         
        @Override
        public int describeContents()
        {
            return 0;
        }
        //Getters and Setter
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getEdad() {
			return edad;
		}

		public void setEdad(String edad) {
			this.edad = edad;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
        
        

}
