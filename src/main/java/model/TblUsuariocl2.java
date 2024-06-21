package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuriocl2;

	private String passwordcl2;

	private String usuriocl2;

	public TblUsuariocl2() {
	}

	public int getIdusuriocl2() {
		return this.idusuriocl2;
	}

	public void setIdusuriocl2(int idusuriocl2) {
		this.idusuriocl2 = idusuriocl2;
	}

	public String getPasswordcl2() {
		return this.passwordcl2;
	}

	public void setPasswordcl2(String passwordcl2) {
		this.passwordcl2 = passwordcl2;
	}

	public String getUsuriocl2() {
		return this.usuriocl2;
	}

	public void setUsuriocl2(String usuriocl2) {
		this.usuriocl2 = usuriocl2;
	}

}