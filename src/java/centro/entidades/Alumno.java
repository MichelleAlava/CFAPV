/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centro.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author michelle
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
    , @NamedQuery(name = "Alumno.findByIdAlumno", query = "SELECT a FROM Alumno a WHERE a.idAlumno = :idAlumno")
    , @NamedQuery(name = "Alumno.findByNombresAlumno", query = "SELECT a FROM Alumno a WHERE a.nombresAlumno = :nombresAlumno")
    , @NamedQuery(name = "Alumno.findByApellidosAlumno", query = "SELECT a FROM Alumno a WHERE a.apellidosAlumno = :apellidosAlumno")
    , @NamedQuery(name = "Alumno.findByCedulaAlumno", query = "SELECT a FROM Alumno a WHERE a.cedulaAlumno = :cedulaAlumno")
    , @NamedQuery(name = "Alumno.findByFechaNac", query = "SELECT a FROM Alumno a WHERE a.fechaNac = :fechaNac")
    , @NamedQuery(name = "Alumno.findByDireccionAlumno", query = "SELECT a FROM Alumno a WHERE a.direccionAlumno = :direccionAlumno")
    , @NamedQuery(name = "Alumno.findByTelefonoAlumno", query = "SELECT a FROM Alumno a WHERE a.telefonoAlumno = :telefonoAlumno")
    , @NamedQuery(name = "Alumno.findByEmailAlumno", query = "SELECT a FROM Alumno a WHERE a.emailAlumno = :emailAlumno")
    , @NamedQuery(name = "Alumno.findByFechaInscrip", query = "SELECT a FROM Alumno a WHERE a.fechaInscrip = :fechaInscrip")
    , @NamedQuery(name = "Alumno.findByCursoNomPre", query = "SELECT a FROM Alumno a WHERE a.cursoNomPre = :cursoNomPre")
    , @NamedQuery(name = "Alumno.findByCursoHorario", query = "SELECT a FROM Alumno a WHERE a.cursoHorario = :cursoHorario")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    @Size(max = 25)
    @Column(name = "nombres_alumno")
    private String nombresAlumno;
    @Size(max = 25)
    @Column(name = "apellidos_alumno")
    private String apellidosAlumno;
    @Size(max = 11)
    @Column(name = "cedula_alumno")
    private String cedulaAlumno;
    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Size(max = 40)
    @Column(name = "direccion_alumno")
    private String direccionAlumno;
    @Size(max = 10)
    @Column(name = "telefono_alumno")
    private String telefonoAlumno;
    @Size(max = 40)
    @Column(name = "email_alumno")
    private String emailAlumno;
    @Column(name = "fecha_inscrip")
    @Temporal(TemporalType.DATE)
    private Date fechaInscrip;
    @Size(max = 40)
    @Column(name = "curso_nom_pre")
    private String cursoNomPre;
    @Size(max = 15)
    @Column(name = "curso_horario")
    private String cursoHorario;

    public Alumno() {
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombresAlumno() {
        return nombresAlumno;
    }

    public void setNombresAlumno(String nombresAlumno) {
        this.nombresAlumno = nombresAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public String getCedulaAlumno() {
        return cedulaAlumno;
    }

    public void setCedulaAlumno(String cedulaAlumno) {
        this.cedulaAlumno = cedulaAlumno;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccionAlumno() {
        return direccionAlumno;
    }

    public void setDireccionAlumno(String direccionAlumno) {
        this.direccionAlumno = direccionAlumno;
    }

    public String getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(String telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public Date getFechaInscrip() {
        return fechaInscrip;
    }

    public void setFechaInscrip(Date fechaInscrip) {
        this.fechaInscrip = fechaInscrip;
    }

    public String getCursoNomPre() {
        return cursoNomPre;
    }

    public void setCursoNomPre(String cursoNomPre) {
        this.cursoNomPre = cursoNomPre;
    }

    public String getCursoHorario() {
        return cursoHorario;
    }

    public void setCursoHorario(String cursoHorario) {
        this.cursoHorario = cursoHorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "centro.entidades.Alumno[ idAlumno=" + idAlumno + " ]";
    }
    
}
