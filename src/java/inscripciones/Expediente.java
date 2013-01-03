/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inscripciones;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "expediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expediente.findAll", query = "SELECT e FROM Expediente e"),
    @NamedQuery(name = "Expediente.findByIdExpediente", query = "SELECT e FROM Expediente e WHERE e.idExpediente = :idExpediente"),
    @NamedQuery(name = "Expediente.findByNivelAprobado", query = "SELECT e FROM Expediente e WHERE e.nivelAprobado = :nivelAprobado"),
    @NamedQuery(name = "Expediente.findByPuedeInscribir", query = "SELECT e FROM Expediente e WHERE e.puedeInscribir = :puedeInscribir"),
    @NamedQuery(name = "Expediente.findByEstadoAcademico", query = "SELECT e FROM Expediente e WHERE e.estadoAcademico = :estadoAcademico"),
    @NamedQuery(name = "Expediente.findByIdEstudiantes", query = "SELECT e FROM Expediente e WHERE e.idEstudiantes = :idEstudiantes")})
public class Expediente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_expediente")
    private Integer idExpediente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivel_aprobado")
    private int nivelAprobado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "puede_inscribir")
    private String puedeInscribir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "estado_academico")
    private String estadoAcademico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estudiantes")
    private int idEstudiantes;

    public Expediente() {
    }

    public Expediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }

    public Expediente(Integer idExpediente, int nivelAprobado, String puedeInscribir, String estadoAcademico, int idEstudiantes) {
        this.idExpediente = idExpediente;
        this.nivelAprobado = nivelAprobado;
        this.puedeInscribir = puedeInscribir;
        this.estadoAcademico = estadoAcademico;
        this.idEstudiantes = idEstudiantes;
    }

    public Integer getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(Integer idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getNivelAprobado() {
        return nivelAprobado;
    }

    public void setNivelAprobado(int nivelAprobado) {
        this.nivelAprobado = nivelAprobado;
    }

    public String getPuedeInscribir() {
        return puedeInscribir;
    }

    public void setPuedeInscribir(String puedeInscribir) {
        this.puedeInscribir = puedeInscribir;
    }

    public String getEstadoAcademico() {
        return estadoAcademico;
    }

    public void setEstadoAcademico(String estadoAcademico) {
        this.estadoAcademico = estadoAcademico;
    }

    public int getIdEstudiantes() {
        return idEstudiantes;
    }

    public void setIdEstudiantes(int idEstudiantes) {
        this.idEstudiantes = idEstudiantes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExpediente != null ? idExpediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.idExpediente == null && other.idExpediente != null) || (this.idExpediente != null && !this.idExpediente.equals(other.idExpediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.Expediente[ idExpediente=" + idExpediente + " ]";
    }
    
}
