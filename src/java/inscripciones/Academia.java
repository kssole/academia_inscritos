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
@Table(name = "academia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Academia.findAll", query = "SELECT a FROM Academia a"),
    @NamedQuery(name = "Academia.findByIdAcademia", query = "SELECT a FROM Academia a WHERE a.idAcademia = :idAcademia"),
    @NamedQuery(name = "Academia.findByNombre", query = "SELECT a FROM Academia a WHERE a.nombre = :nombre")})
public class Academia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_academia")
    private Integer idAcademia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre")
    private String nombre;

    public Academia() {
    }

    public Academia(Integer idAcademia) {
        this.idAcademia = idAcademia;
    }

    public Academia(Integer idAcademia, String nombre) {
        this.idAcademia = idAcademia;
        this.nombre = nombre;
    }

    public Integer getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(Integer idAcademia) {
        this.idAcademia = idAcademia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcademia != null ? idAcademia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Academia)) {
            return false;
        }
        Academia other = (Academia) object;
        if ((this.idAcademia == null && other.idAcademia != null) || (this.idAcademia != null && !this.idAcademia.equals(other.idAcademia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inscripciones.Academia[ idAcademia=" + idAcademia + " ]";
    }
    
}
