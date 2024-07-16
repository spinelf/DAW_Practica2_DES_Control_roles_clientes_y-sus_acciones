package com.rolclientes.modelo.beans;

import java.io.Serializable;
import java.util.Objects;

	public class Cliente implements Serializable{


		private static final long serialVersionUID = 1L;
		
		private int idCliente;
		private String nombreUsuario;
		private String password;
		private String mailCliente;
		private String nombreCliente;
		private String direccionCliente;
		private int enabled;
		private String fechaRegistroCliente;
		
		//constructor por defecto
		public Cliente() {
			super();
		}

		//constructor con parámetros
		public Cliente(int idCliente, String nombreUsuario, String contraseña, String mailCliente, String nombreCliente, String direccionCliente,
				int enabled, String fechaRegistroCliente) {
			super();
			this.idCliente = idCliente;
			this.nombreUsuario = nombreUsuario;
			this.password = contraseña;
			this.mailCliente = mailCliente;
			this.nombreCliente = nombreCliente;
			this.direccionCliente = direccionCliente;
			this.enabled = enabled;
			this.fechaRegistroCliente = fechaRegistroCliente;
		}

		//generamos los métodos setter y getter mediante "source", así como equals, hashCode y toString
		public int getIdCliente() {
			return idCliente;
		}


		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}


		public String getNombreUsuario() {
			return nombreUsuario;
		}


		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getMailCliente() {
			return mailCliente;
		}


		public void setMailCliente(String mailCliente) {
			this.mailCliente = mailCliente;
		}


		public String getNombreCliente() {
			return nombreCliente;
		}


		public void setNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
		}


		public String getDireccionCliente() {
			return direccionCliente;
		}


		public void setDireccionCliente(String direccionCliente) {
			this.direccionCliente = direccionCliente;
		}


		public int getEnabled() {
			return enabled;
		}


		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}


		public String getFechaRegistroCliente() {
			return fechaRegistroCliente;
		}


		public void setFechaRegistroCliente(String fechaRegistroCliente) {
			this.fechaRegistroCliente = fechaRegistroCliente;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public int hashCode() {
			return Objects.hash(password, direccionCliente, enabled, fechaRegistroCliente, idCliente, mailCliente,
					nombreCliente, nombreUsuario);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Cliente))
				return false;
			Cliente other = (Cliente) obj;
			return Objects.equals(password, other.password)
					&& Objects.equals(direccionCliente, other.direccionCliente) && enabled == other.enabled
					&& Objects.equals(fechaRegistroCliente, other.fechaRegistroCliente) && idCliente == other.idCliente
					&& Objects.equals(mailCliente, other.mailCliente)
					&& Objects.equals(nombreCliente, other.nombreCliente)
					&& Objects.equals(nombreUsuario, other.nombreUsuario);
		}


		@Override
		public String toString() {
			return "Cliente [idCliente=" + idCliente + ", nombreUsuario=" + nombreUsuario + ", password=" + password
					+ ", mailCliente=" + mailCliente + ", nombreCliente=" + nombreCliente + ", direccionCliente="
					+ direccionCliente + ", enabled=" + enabled + ", fechaRegistroCliente=" + fechaRegistroCliente
					+ "]";
		}

}
