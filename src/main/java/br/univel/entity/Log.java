package br.univel.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
@Table(name = "log")
public class Log implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(name = "nome_mdb", nullable = false)
	private String nomeMdb;

	@Column(name = "data_hora", nullable = false)
	private Date dataHora;

	@Column(name = "info", nullable = false)
	private String info;

	
	public Log() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Log)) {
			return false;
		}
		Log other = (Log) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getNomeMdb() {
		return nomeMdb;
	}

	public void setNomeMdb(String nomeMdb) {
		this.nomeMdb = nomeMdb;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (nomeMdb != null && !nomeMdb.trim().isEmpty())
			result += "nomeMdb: " + nomeMdb;
		if (dataHora != null)
			result += ", dataHora: " + dataHora;
		if (info != null && !info.trim().isEmpty())
			result += ", info: " + info;
		return result;
	}
}